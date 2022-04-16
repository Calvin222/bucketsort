import java.util.Arrays;

public class Main {
    public static double[] sort(double[] input) {
        var maxOpt = Arrays.stream(input).max();
        if (maxOpt.isEmpty()) {
            return input;
        }
        return input;
    }
}
