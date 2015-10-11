package decimill;

import decimill.adapters.statistics.StatsAdapter;
import decimill.adapters.statistics.StatsAdapterException;
import decimill.lang.*;
import decimill.model.*;
import decimill.parser.CompilerException;
import decimill.stats.Histogram;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStreamRewriter;

/**
 * @author David Stefan
 */
public class Rewriter {

    public final TokenStreamRewriter rewriter;

    public Rewriter(TokenStreamRewriter rewriter) {
        this.rewriter = rewriter;
    }

    public void rewriteModelNode(ParserRuleContext context, Model model, Node node) {
        rewriter.insertBefore(context.start.getTokenIndex() - 1, "<span class=\"model-node\" data-modelid=\"" + model.getId() + "\"data-nodeid=\"" + node.getId() + "\">");
        rewriter.insertAfter(context.stop.getTokenIndex() + 1, "</span>");
    }

    public void rewriteQueryInline(ParserRuleContext context, DM_Object value) {
        rewriter.insertBefore(context.start.getTokenIndex() - 1, print(value));
        rewriter.delete(context.start.getTokenIndex() - 1, context.stop.getTokenIndex() + 1);
    }

    public void rewriteQueryBlock(ParserRuleContext context, DM_Object value) {
        rewriter.insertBefore(context.start.getTokenIndex(), "\r" + print(value));
        rewriter.delete(context.start.getTokenIndex(), context.stop.getTokenIndex());
    }

    private String print(DM_Object o) {

        if (o instanceof DM_Integer) {
            return print((DM_Integer) o);
        }

        if (o instanceof DM_Double) {
            return print((DM_Double) o);
        }

        if (o instanceof DM_Array) {
            return print((DM_Array) o);
        }

        if (o instanceof DM_Sample) {
            return print((DM_Sample) o);
        }

        if (o instanceof DM_Map) {
            return print((DM_Map) o);
        }

        return o.toString();
    }

    public String print(DM_Integer value) {
        DecimalFormat df = new DecimalFormat("###,###");
        return df.format(roundToSignificantDigits(value.getValue(), 3));
    }

    public String print(DM_Double value) {

        DecimalFormat df = new DecimalFormat("###,###.#####");

        double d = value.getValue();
        return df.format(roundToSignificantDigits(d, 3));
    }

    public String print(DM_Array array) {

        String str = "{";

        for (int i = 0; i < array.size(); i++) {
            str += print(array.get(i));
            str += i == array.size() - 1 ? "" : ", ";
        }
        return str + "}";
    }

    public String print(DM_Sample array) {

        DecimalFormat df = new DecimalFormat("###,###.############");

        try {
            double mean = StatsAdapter.mean(array);
            double[] v = new double[array.size()];

            for (int i = 0; i < array.size(); i++) {
                v[i] = (double) array.get(i).cast(Double.class);
            }

            DM_SampleInfo sample = new DM_SampleInfo();

            Histogram hist = Histogram.build(v);
            sample.set("mean", mean);
            sample.set("hist", hist);

            return "<span class=\"sample\" data-gson='" + MapSerializer.toJson(sample.getData()) + "'>" + df.format(roundToSignificantDigits(mean, 3)) + "</span>";

        } catch (StatsAdapterException | CastException e) {
            throw new CompilerException(e.getMessage());
        }
    }

    public String print(ArrayList<Double> values) {
        return values.get(0).toString();
    }

    public String print(DM_Map o) {

        DM_Map info = (DM_Map) o;
        String json = MapSerializer.toJson(info.getData());
        String title = info.get("title").toString();

        return "<div class=\"chart\" data-gson='" + json + "'></div>"
                + "<div class=\"chart-title\">" + title + "</div>";
    }

    public static double roundToSignificantDigits(double value, int numberOfDigits) {

        if (value == 0) {
            return 0;
        }

        final double d = Math.ceil(Math.log10(value < 0 ? -value : value));
        final int power = numberOfDigits - (int) d;

        final double magnitude = Math.pow(10, power);
        final long shifted = Math.round(value * magnitude);

        BigDecimal magnitudeDB = BigDecimal.valueOf(magnitude);
        BigDecimal shiftedBD = BigDecimal.valueOf(shifted);
        
        return shiftedBD.divide(magnitudeDB).doubleValue();
    }

    public String getText() {
        return rewriter.getText();
    }
}
