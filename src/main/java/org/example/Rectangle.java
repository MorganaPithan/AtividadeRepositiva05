package org.example;

public class Rectangle implements GeometricShapes{
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (base + height);
    }
}
