package decimill;

import decimill.expression.Dist90CINode;
import decimill.expression.DoubleNode;
import decimill.expression.ExprNode;
import decimill.expression.Reference;
import decimill.lang.DM_Boolean;
import decimill.lang.DM_Object;
import decimill.model.Model;
import decimill.model.ModelCompiler;
import decimill.query.QueryCompiler;
import decimill.scenario.Scenario;
import decimill.scenario.ScenarioCompiler;
import java.io.IOException;

/**
 * @author David Stefan
 */
public class Test {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        
        Context context = new Context();
        
        Model model = new Model(1, "Foo");
        ModelCompiler.compile(model, "`bar = 0.5`");
        
        context.addModel(model);
        
        model.assign(new Reference(null, "var"), new Dist90CINode(10.0, 100.0));
        context.assign(new Reference("Foo", "var"), new DoubleNode(100.0));
        
        String out = QueryCompiler.compile(context, "`=Foo.var`");
        
        System.out.println(out);
    }

}
