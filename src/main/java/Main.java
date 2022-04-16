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
        var result = new double[n];
        var bucketsMarker = new int[10];
        Arrays.fill(bucketsMarker, 0);

        for (int i = 0; i < input.length; i++) {
            var j = (Integer) Math.round((float) (input[i] / divider));
            buckets[j][bucketsMarker[j]] = input[i];
            bucketsMarker[j] += 1;
        }
        var resultCounter = 0;
        for (int i = 0; i < buckets.length; i++) {
            innerSort(buckets[i], bucketsMarker[i]);
            for (int j = 0; j < bucketsMarker[i]; j++) {
                if (resultCounter < result.length) {
                    result[resultCounter++] = buckets[i][j];
                }
            }
        }
        return result;
    }

    private static void innerSort(double[] array, int nbItems) {
        var sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < nbItems - 1; i++) {
                if (array[i] > array[i + 1]) {
                    var tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                    sorted = false;
                }
            }
        }
    }
}

