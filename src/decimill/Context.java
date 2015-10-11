package decimill;

import decimill.expression.Dist90CINode;
import decimill.expression.DoubleNode;
import decimill.expression.Reference;
import decimill.expression.ExprNode;
import decimill.expression.IntegerNode;
import decimill.lang.DM_Object;
import decimill.scenario.Scenario;
import decimill.model.Model;
import java.util.HashMap;
import java.util.Map;

/**
 * Context is a key class of the decimill framework serving as a container for
 * all models, scenarios and functions. It provides a simple cacheing mechanism
 * that is used by QueryCompliler to improve the performance of the evaluation.
 * 
 * Here's what it should look like:
 * <p>
 * <code>
 * Context ctx = new Context();
 * </code>
 *
 * @author David Stefan
 */
public class Context {

    private final Map<String, Model> models;
    private final Map<String, Scenario> scenarios;
    private final Map<String, String> dispatcher;
    private final Map<String, Function> functions;
    private final Map<String, DM_Object> cache;

    public Context() {
        this.models = new HashMap<>();
        this.scenarios = new HashMap<>();
        this.dispatcher = new HashMap<>();
        this.functions = new HashMap<>();
        this.cache = new HashMap<>();
    }

    /**
     * Assign an object to the given name in the cache.
     *
     * @param name
     * @param o
     */
    public void cache(String name, DM_Object o) {
        cache.put(name, o);
    }

    /**
     * Retrieve a cached object by the given name. Returns null if no object
     * with such name is cached.
     *
     * @param name
     * @return
     */
    public DM_Object getCached(String name) {
        return cache.get(name);
    }

    /**
     * Find out whether an object with the given name has been cached.
     *
     * @param name
     * @return
     */
    public boolean isCached(String name) {
        return this.cache.containsKey(name);
    }

    /**
     * Adds a model to the context. If a model or scenario (as identified by the
     * given model's namespace) already exists in the context an exception is
     * thrown.
     *
     * @param model
     * @throws ContextException
     */
    public void addModel(Model model) throws ContextException {

        if (dispatcher.containsKey(model.getNamespace())) {
            throw new ContextException("Model or Scenario with namespace '" + model.getNamespace() + "' already exists in this context.");
        }

        // Add model
        models.put(model.getNamespace(), model);

        // Save model id in dispatcher for correct assignment routing
        dispatcher.put(model.getNamespace(), "model");
    }

    /**
     * Adds a scenario to the context. If a scenario or model (as identified by
     * the given scenario's namespace) already exists in the context an
     * exception is thrown.
     *
     * @param scnr
     * @throws ContextException
     */
    public void addScenario(Scenario scnr) {

        if (dispatcher.containsKey(scnr.getNamespace())) {
            throw new ContextException("Scenario or Model with namespace '" + scnr.getNamespace() + "' already exists in this context.");
        }

        // Add scenario
        scenarios.put(scnr.getNamespace(), scnr);

        // Save scenario id in disptacher for correct assignment routing
        dispatcher.put(scnr.getNamespace(), "scenario");
    }

    /**
     * Adds a function to the context. If a function with the given name already
     * exists in the context an exception is thrown.
     *
     * @param name
     * @param fx
     * @throws ContextException
     */
    public void addFunction(String name, Function fx) throws ContextException {

        if (functions.containsKey(name)) {
            throw new ContextException("A function with name '" + name + "' already exists in this context.");
        }
        functions.put(name, fx);
    }

    public void assign(String refString, Integer value) {
        Reference ref = stringToReference(refString);
        assign(ref, new IntegerNode(value));
    }

    public void assign(String refString, Double value) {
        Reference ref = stringToReference(refString);
        assign(ref, new DoubleNode(value));
    }

    public void assign(String refString, double lb, double ub) {
        Reference ref = stringToReference(refString);
        assign(ref, new Dist90CINode(lb, ub));
    }

    public void assign(Reference ref, ExprNode expr) {

        String namespace = ref.getNamespace();
        String varName = ref.getId();

        if (!dispatcher.containsKey(namespace)) {
            throw new ContextException("No model or scenario with namespace '" + namespace + "' found when assigning an expression to context.");
        }

        switch (dispatcher.get(namespace)) {
            case "model": {
                Model model = models.get(namespace);
                if (model != null) {
                    model.assign(ref, expr);
                }
                break;
            }
            case "scenario": {
                Scenario scnr = scenarios.get(namespace);
                if (scnr != null) {
                    scnr.assign(varName, expr);
                }
            }
        }
    }

    public Model getModel(String id) {
        return models.get(id);
    }

    public Scenario getScenario(String id) {
        return scenarios.get(id);
    }

    public Function getFunction(String id) {
        return functions.get(id);
    }

    public void addScenario(String name, Scenario scnr) {
        scenarios.put(name, scnr);
    }

    public ExprNode getAssigned(String strRef) {
        return getAssigned(stringToReference(strRef));
    }

    public ExprNode getAssigned(Reference ref) {

        String namespace = ref.getNamespace();
        String id = ref.getId();

        ExprNode expr = null;
        String type = dispatcher.get(namespace);

        if (type == null) {
            throw new ContextException("No model or scenario with namespace '" + namespace + "'.");
        }

        switch (dispatcher.get(namespace)) {
            case "model": {
                Model model = models.get(namespace);
                expr = model.hasAssignment(id) ? model.getAssigned(ref) : null;
                break;
            }
            case "scenario": {
                Scenario scnr = scenarios.get(namespace);
                expr = scnr.hasAssignment(id) ? scnr.getAssigned(id) : null;
                break;
            }
        }

        return expr;
    }
    
    /**
     * A helper function that transforms a valid reference string into a
     * Reference object. Strings must be in the form <namespace>.<name>, e.g.
     * 'Foo.bar'. If the given string is not in the required format an exception
     * is thrown.
     *
     * @param ref
     * @return
     * @throws ContextException
     */
    private static Reference stringToReference(String ref)
            throws ContextException {

        String[] refParts = ref.split("\\.");

        if (refParts.length != 2) {
            throw new ContextException("'" + ref + "' is not a valid reference string.");
        }

        return new Reference(refParts[0], refParts[1]);
    }

    @Override
    public String toString() {

        String str = "Context\n\n";

        for (String modelId : models.keySet()) {
            str += modelId + ":\n";
            str += models.get(modelId);
        }

        for (String scenarioId : scenarios.keySet()) {
            str += scenarioId + ":\n";
            str += scenarios.get(scenarioId);
        }

        return str;
    }
}
