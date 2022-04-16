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

    @Test
    public void testSort2Items() {
        var expected = new double[]{1.9f, 18.12f};
        var input = new double[]{18.12f, 1.9f};
        Assertions.assertArrayEquals(expected, Main.sort(input));
    }
    @Test
    public void testSort2ItemsInARow() {
        var expected = new double[]{1.7f, 1.9f};
        var input = new double[]{1.7f, 1.9f};
        Assertions.assertArrayEquals(expected, Main.sort(input));
    }

    @Test
    public void testSort2ItemsInARowNotSorted() {
        var expected = new double[]{1.7f, 1.9f};
        var input = new double[]{1.9f, 1.7f};
        Assertions.assertArrayEquals(expected, Main.sort(input));
    }
    @Test
    public void testSort7Items() {
        var expected = new double[]{1.7f, 1.9f, 2.1f, 2.2f, 2.3f, 4.3f, 8.1f};
        var input = new double[]{1.9f, 1.7f, 4.3f, 2.3f, 2.2f, 2.1f, 8.1f};
        Assertions.assertArrayEquals(expected, Main.sort(input));
    }
}
