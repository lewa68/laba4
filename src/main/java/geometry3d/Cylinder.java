package geometry3d;
import geometry2d.*;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import java.util.logging.LogRecord;

public class Cylinder {
    private static final Logger logger = Logger.getLogger(Cylinder.class.getName());
    private Figure base;
    private double height;
    static {
        try {
            FileHandler fh = new FileHandler("cylinder.log", true);
            fh.setFormatter(new SimpleFormatter() {
                @Override
                public String format(LogRecord record) {
                    return record.getLevel() + " " + record.getMillis() + " " + record.getMessage() + "\n";
                }
            });
            logger.addHandler(fh);
            logger.setLevel(Level.FINEST);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Cylinder(Figure base, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        this.base = base;
        this.height = height;
        logger.finest("Cylinder object created");
    }

    public double volume() {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "base=" + base +
                ", height=" + height +
                ", volume=" + volume() +
                '}';
    }
}