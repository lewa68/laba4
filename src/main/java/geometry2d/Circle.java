package geometry2d;
import java.util.logging.*;

public class Circle implements Figure {
    private double radius;
    private static final Logger logger = Logger.getLogger(Circle.class.getName());
    static {
        try {
            FileHandler fh = new FileHandler("figures.log", true);
            fh.setFormatter(new XMLFormatter());
            logger.addHandler(fh);
            logger.setLevel(Level.SEVERE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
        logger.severe("Circle object created");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}