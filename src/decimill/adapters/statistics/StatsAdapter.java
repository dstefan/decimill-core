package decimill.adapters.statistics;

import decimill.FunctionInvocationException;
import decimill.lang.CastException;
import decimill.lang.DM_Array;
import decimill.lang.DM_Double;
import decimill.lang.DM_Object;
import decimill.lang.DM_Sample;
import decimill.stats.DecisionAnalysis;
import decimill.stats.VectorUtils;

/**
 * @author David Stefan
 */
public class StatsAdapter {

    public static Double mean(DM_Object o) throws StatsAdapterException {

        try {
            if (o instanceof DM_Double) {
                return (Double) o.cast(Double.class);
            } else if (o instanceof DM_Array) {
                DM_Array array = (DM_Array) o;
                double[] v = new double[array.size()];
                for (int i = 0; i < array.size(); i++) {
                    v[i] = (double) array.get(i).cast(Double.class);
                }
                return VectorUtils.mean(v);
            } else if (o instanceof DM_Sample) {
                DM_Sample sample = (DM_Sample) o;
                double[] v = new double[sample.size()];
                for (int i = 0; i < sample.size(); i++) {
                    v[i] = sample.get(i).getValue();
                }
                return VectorUtils.mean(v);
            }
            throw new StatsAdapterException("Couldn't compute mean of " + o.getClass() + ".");
        } catch (CastException e) {
            throw new StatsAdapterException(e.getMessage());
        }
    }

    public static Double evpi(DM_Array<DM_Array<DM_Double>> nbs) throws StatsAdapterException {

        double[][] matrix = new double[nbs.size()][];

        for (int i = 0; i < nbs.size(); i++) {
            try {
                DM_Object o = nbs.get(i);
                DM_Sample sample = o.toSample();
                matrix[i] = new double[sample.size()];
                matrix[i] = sample.cast(new double[sample.size()]);
            } catch (CastException e) {
                throw new StatsAdapterException(e.getMessage());
            }
        }

        return DecisionAnalysis.evpi(matrix);
    }
}
