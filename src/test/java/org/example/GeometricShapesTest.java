package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GeometricShapesTest {

    @Test
    void SquareAreaTest() {
        //side = 5 result = 25
        Square square = new Square(5);
        assertEquals(25, square.calculateArea());
    }

    @Test
    void SquarePerimeterTest() {
        //side = 7 result = 28
        Square square = new Square(7);
        assertEquals(28, square.calculatePerimeter());
    }

    @Test
    void TriangelAreaTest() {
        //base = 10 height = 6 result = 30
        Triangle triangle = new Triangle(5,5,5,10,6);
        assertEquals(30, triangle.calculateArea());
    }

    @Test
    void TriangelPerimeterTest() {
        //side1 = 5 side2 = 5 side3 = 5 result = 15
        Triangle triangle = new Triangle(5,5,5,10,6);
        assertEquals(15, triangle.calculatePerimeter());
    }

    @Test
    void RectangleAreaTest() {
        //base = 8 height = 7 result = 56
        Rectangle rectangle = new Rectangle(8, 7);
        assertEquals(56, rectangle.calculateArea());
    }

    @Test
    void RectanglePerimeterTest() {
        //base = 7 height = 8 result = 30
        Rectangle rectangle = new Rectangle(7, 8);
        assertEquals(30, rectangle.calculatePerimeter());
    }

    @Test
    void CombinedShapesTest() {
        Square square = new Square(5);//25
        Rectangle rectangle = new Rectangle(8, 7);//56
        Triangle triangle = new Triangle(3, 4,5,10,6);//30

        List<GeometricShapes> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(rectangle);
        shapes.add(triangle);

        CombinedShapes combinedShapes = new CombinedShapes(shapes);
        double totalArea = combinedShapes.calculateCombinedArea();
        assertEquals(111, totalArea);
    }
}