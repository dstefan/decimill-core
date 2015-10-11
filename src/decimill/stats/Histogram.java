package decimill.stats;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;

/**
 * @author David Stefan
 */
public class Histogram {

    private final int[] bins;
    private final double[] values;
    
    public Histogram(int[] bins, double[] values) {
        this.bins = bins;
        this.values = values;
    }
    
    public static Histogram build(double[] v) {
        
        DescriptiveStatistics ds = new DescriptiveStatistics(v);
        
        double n = v.length;
        double min = new Min().evaluate(v);
        double max = new Max().evaluate(v);

        double q1 = ds.getPercentile(25);
        double q3 = ds.getPercentile(75);
        double iqr = q3 - q1;
        double h = 2 * iqr * Math.pow(n, -1.0 / 3.0);
        
        //int binsNum = (int) ((max - min) / h);
        int binsNum = 10;
        double binWidth = (max - min) / binsNum;
        
        double values[] = new double[binsNum];
        int bins[] = new int[binsNum];

        // Compute each bin's frequency
        for (int i = 0; i < n; i++) {
            double x = v[i];
            for (int j = 0; j < binsNum; j++) {
                double binMin = min + j * binWidth;
                double binMax = min + (j + 1) * binWidth;
                if (x >= binMin && x < binMax) {
                    bins[j]++;
                    break;
                }
            }
            if (x == max) {
                bins[binsNum - 1]++;
            }
        }
        
        // Compute bins' representative values
        for (int i = 0; i < bins.length; i++) {
            
            double lb = min + i * binWidth;
            double ub = min + (i + 1) * binWidth;
            double mid = lb + (ub - lb) / 2;
            
            values[i] = mid;
        }
        
        return new Histogram(bins, values);
    }
    
    public int[] getBins() {
        return bins;
    }
    
    public double[] getValues() {
        return values;
    }
}
