package decimill.lang;

import java.util.ArrayList;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.TriangularDistribution;
import org.apache.commons.math3.distribution.UniformRealDistribution;

/**
 * @author David Stefan
 */
public abstract class DM_Object {

    public static int sampleSize = 10;

    public Object cast(Class t) throws CastException {
        throw new CastException("Cannot cast " + this.getClass().getName() + " to " + t.getName());
    }
    
    public abstract DM_Object plus(DM_Object o);

    public abstract DM_Object minus(DM_Object o);

    public abstract DM_Object times(DM_Object o);

    public abstract DM_Object div(DM_Object o);

    public abstract DM_Object pow(DM_Object o);

    public abstract DM_Object lt(DM_Object o);

    public abstract DM_Object gt(DM_Object o);

    public abstract DM_Object eq(DM_Object o);

    public abstract DM_Array toArray(int size);
    
    public abstract DM_Sample toSample();

    public static DM_Sample buildFrom90CI(double lb, double ub) {
        
        double mean = (ub - lb) / 2 + lb;
        double sd = (ub - lb) / 3.29;
        double[] samples = new NormalDistribution(mean, sd).sample(sampleSize);
        ArrayList<DM_Double> values = new ArrayList<>();

        for (double sample : samples) {
            values.add(new DM_Double(sample));
        }

        return new DM_Sample(values);
    }

    public static DM_Sample buildFromUnif(double a, double b) {

        double[] samples = new UniformRealDistribution(a, b).sample(sampleSize);
        ArrayList<DM_Double> values = new ArrayList<>();

        for (double sample : samples) {
            values.add(new DM_Double(sample));
        }

        return new DM_Sample(values);
    }

    public static DM_Sample buildFromTriang(double a, double b, double c) {

        double[] samples = new TriangularDistribution(a, c, b).sample(sampleSize);
        ArrayList<DM_Double> values = new ArrayList<>();

        for (double sample : samples) {
            values.add(new DM_Double(sample));
        }

        return new DM_Sample(values);
    }

}
