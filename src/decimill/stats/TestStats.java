package decimill.stats;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;
import decimill.Context;
import decimill.Function;
import decimill.FunctionInvocationException;
import decimill.adapters.statistics.StatsAdapter;
import decimill.adapters.statistics.StatsAdapterException;
import decimill.expression.RefNode;
import decimill.lang.CastException;
import decimill.lang.DM_Array;
import decimill.lang.DM_Boolean;
import decimill.lang.DM_Double;
import decimill.lang.DM_Object;
import decimill.lang.DM_Sample;
import decimill.model.Model;
import decimill.model.ModelCompiler;
import decimill.parser.CompilerException;
import decimill.query.QueryCompiler;
import decimill.scenario.Scenario;
import decimill.scenario.ScenarioCompiler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import jmetal.core.Problem;
import jmetal.core.Solution;
import jmetal.metaheuristics.nsgaII.NSGAII;
import jmetal.metaheuristics.nsgaII.NSGAII_main;
import jmetal.problems.Kursawe;
import jmetal.util.JMException;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * @author David Stefan
 */
public class TestStats {

    private static int counter = 0;

    public static void main(String[] args) throws Exception {
        
//        map.put("David", 1);
//        map.put("Ania", 2);
//        map.put("Ania", 3);
//        
//        System.out.println(map);
        
        TestStats.testStats();
//        System.out.println(100 % 3);
//        System.exit(-1);
        
//        DM_Object.sampleSize = 10000;
//        Context ctx = new Context();
//        
//        Model model = new Model(1, "CHP");
//        ModelCompiler.compileFromFile(model, "data/model");
//        
//        ctx.addModel(model);
//        
//        //String query = "`=sum(UCL.electricity_consumption) / 1000000`";
//        
//        QueryCompiler compiler = new QueryCompiler(ctx);
//        
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            DM_Object res = compiler.eval(new RefNode("CHP", "electricity_consumption"));
//            if (i % 100 == 0) {
//                System.out.println(i);
//            }
//        }
//        long stopTime = System.currentTimeMillis();
//        
//        System.out.println("Evaluation took " + (stopTime - startTime) + "ms");
    }

    public static void testIf() {

        Context ctx = new Context();

        ctx.addFunction("if", new Function() {

            public DM_Object call(DM_Boolean cond, DM_Object a, DM_Object b) {

                if (cond.getValue()) {
                    return a;
                } else {
                    return b;
                }
            }

            public DM_Object call(DM_Array<DM_Object> cond, DM_Object a, DM_Object b) throws FunctionInvocationException {

                DM_Array<DM_Object> res = new DM_Array<>();
                DM_Array<DM_Object> aArray;
                DM_Array<DM_Object> bArray;

                try {

                    if (!(a instanceof DM_Array)) {
                        aArray = (DM_Array) a.toArray(cond.size());
                    } else {
                        aArray = (DM_Array) a;
                    }

                    if (!(b instanceof DM_Array)) {
                        bArray = (DM_Array) b.toArray(cond.size());
                    } else {
                        bArray = (DM_Array) b;
                    }

                    for (int i = 0; i < cond.size(); i++) {

                        DM_Object o = cond.get(i);

                        if (o instanceof DM_Array) {
                            res.add(call((DM_Array) o, aArray.get(i), bArray.get(i)));
                        } else if (o instanceof DM_Sample) {
                            res.add(call((DM_Sample) o, aArray.get(i).toSample(), bArray.get(i).toSample()));
                        } else {
                            if (((DM_Boolean) o.cast(DM_Boolean.class)).getValue()) {
                                res.add(aArray.get(i));
                            } else {
                                res.add(bArray.get(i));
                            }
                        }
                    }

                } catch (CastException e) {
                    throw new FunctionInvocationException(e.getMessage());
                }

                return res;
            }

            public DM_Object call(DM_Sample cond, DM_Sample a, DM_Sample b) throws FunctionInvocationException {
                
                DM_Sample sample = new DM_Sample();
                ArrayList<DM_Boolean> conds = (ArrayList<DM_Boolean>) cond.cast(DM_Boolean.class);

                for (int i = 0; i < cond.size(); i++) {
                    if ((Boolean) conds.get(i).cast(Boolean.class)) {
                        sample.add(a.get(i));
                    } else {
                        sample.add(b.get(i));
                    }
                }
                return sample;
            }
        });

        ctx.addFunction("sum", new Function() {

            public DM_Object call(DM_Array<DM_Object> array) {

                DM_Object res = array.get(0);

                for (int i = 1; i < array.size(); i++) {
                    res = res.plus(array.get(i));
                }

                return res;
            }
        });

        DM_Object.sampleSize = 2;

        try {
            Model chp = new Model(1, "CHP");
            ModelCompiler.compileFromFile(chp, "data/model");
            ctx.addModel(chp);
            String out = QueryCompiler.compileFromFile(ctx, "data/query");
            System.out.println(out);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void testStats() throws IOException { 
        
        Context ctx = new Context();
        
        Model model = new Model(1, "CHP");
        ModelCompiler.compileFromFile(model, "data/model");
        
        Scenario scenario = new Scenario(1, "TC");
        ScenarioCompiler.compileFromFile(scenario, "data/scenario");
        
        ctx.addModel(model);
        ctx.addScenario(scenario);
        
        String out = QueryCompiler.compileFromFile(ctx, "data/query");
        System.out.println(out);
    }
}
