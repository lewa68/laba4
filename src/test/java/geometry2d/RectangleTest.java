package geometry2d;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50.0, rectangle.area(), 0.0000000001);
    }

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(30.0, rectangle.perimeter(), 0.0000000001);
    }

    @Test
    public void testToString() {
        Rectangle rectangle = new Rectangle(5, 10);
        String expected = "Rectangle{width=5.0, height=10.0, area=50.0, perimeter=30.0}";
        assertEquals(expected, rectangle.toString());
    }

    @Test
    public void testNegativeWidth() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Rectangle rectangle = new Rectangle(-5, 10);
        });
        assertEquals("Width and height must be positive", exception.getMessage());
    }

    @Test
    public void testNegativeHeight() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Rectangle rectangle = new Rectangle(5, -10);
        });
        assertEquals("Width and height must be positive", exception.getMessage());
    }

    @Test
    public void testZeroWidth() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Rectangle rectangle = new Rectangle(0, 10);
        });
        assertEquals("Width and height must be positive", exception.getMessage());
    }

    @Test
    public void testZeroHeight() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Rectangle rectangle = new Rectangle(5, 0);
        });
        assertEquals("Width and height must be positive", exception.getMessage());
    }
}