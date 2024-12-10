package geometry2d;
import java.util.logging.*;


public class Rectangle implements Figure {
    private static final Logger logger = Logger.getLogger(Rectangle.class.getName());
    private double width;
    private double height;

    static {
        try {
            FileHandler fh = new FileHandler("figures.log", true);
            fh.setFormatter(new XMLFormatter());
            logger.addHandler(fh);
            logger.setLevel(Level.INFO);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be positive");
        }
        this.width = width;
        this.height = height;
        logger.info("Rectangle object created");
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}