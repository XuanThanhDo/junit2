import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        assertEquals(5, MathUtils.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, MathUtils.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, MathUtils.multiply(5, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, MathUtils.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.divide(10, 0);
        });
    }
}
