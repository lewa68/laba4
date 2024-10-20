package geometry3d;
import geometry2d.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CylinderTest {

    @Test
    public void testVolume() {
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(circle, 10);
        assertEquals(785.3981633974483, cylinder.volume(), 0.0000000001);
    }

    @Test
    public void testToString() {
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(circle, 10);
        String expected = "Cylinder{base=Circle{radius=5.0, area=78.53981633974483, perimeter=31.41592653589793}, height=10.0, volume=785.3981633974483}";
        assertEquals(expected, cylinder.toString());
    }

    @Test
    public void testNegativeHeight() {
        Circle circle = new Circle(5);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Cylinder cylinder = new Cylinder(circle, -10);
        });
        assertEquals("Height must be positive", exception.getMessage());
    }

    @Test
    public void testZeroHeight() {
        Circle circle = new Circle(5);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Cylinder cylinder = new Cylinder(circle, 0);
        });
        assertEquals("Height must be positive", exception.getMessage());
    }
}
