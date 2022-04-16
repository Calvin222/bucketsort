import java.util.Arrays;

public class Main {
    public static double[] sort(double[] input) {
        var maxOpt = Arrays.stream(input).max();
        if (maxOpt.isEmpty()) {
            return input;
        }
        var max = maxOpt.getAsDouble();
        var n = input.length;
        var divider = (max + 1) / n;
        var buckets = new double[10][n];
        var bucketsMarker = new int[10];
        Arrays.fill(bucketsMarker, 0);

        for (int i = 0; i < input.length; i++) {
            var j = (Integer) Math.round((float) (input[i] / divider));
            buckets[j][bucketsMarker[j]] = input[i];
            bucketsMarker[j] += 1;
        }
        return input;
    }
}
