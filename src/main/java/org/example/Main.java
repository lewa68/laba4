package org.example;

import geometry2d.java.*;
import geometry3d.*;

public class Main {
    public static void main(String[] args) {
        try {
            Figure circle = new Circle(5);
            System.out.println(circle);

            Figure rectangle = new Rectangle(4, 6);
            System.out.println(rectangle);

            Cylinder cylinder = new Cylinder(circle, 10);
            System.out.println(cylinder);

            // Протестировать обработку некорректных данных
            Figure invalidCircle = new Circle(-5); // Ожидается InvalidDimensionException
            Figure invalidRectangle = new Rectangle(4, -6); // Ожидается InvalidDimensionException
            Cylinder invalidCylinder = new Cylinder(rectangle, -10); // Ожидается InvalidDimensionException
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}