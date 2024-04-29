package org.example;

import java.util.List;

public class CombinedShapes {
    private List<GeometricShapes> shapes;

    public CombinedShapes(List<GeometricShapes> shapes) {
        this.shapes = shapes;
    }

    public double calculateCombinedArea() {
        double totalArea = 0;
        for(GeometricShapes shape : shapes){
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
