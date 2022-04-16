import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testSortEmpty() {
        var expected = new double[0];
        var input = new double[0];
        Assertions.assertArrayEquals(expected, Main.sort(input));
    }

    @Test
    public void testSort1Item() {
        var expected = new double[]{1.9f};
        var input = new double[]{1.9f};
        Assertions.assertArrayEquals(expected, Main.sort(input));
    }

}
