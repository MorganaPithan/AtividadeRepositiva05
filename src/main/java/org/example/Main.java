package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shape;
        System.out.println("Welcome to the area and perimeter calculator");
        do {
            System.out.println("Choose the geometric shape you want to calculate");
            System.out.println("1 - Square");
            System.out.println("2 - Triangle");
            System.out.println("3 - Rectangle");
            System.out.println("4 - Combined areas");
            System.out.println("5 - Exit");
            shape = scanner.nextInt();

            switch (shape) {
                case 1 -> {
                    System.out.println("Enter the value of the side of the square:");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    System.out.println("Area: " + square.calculateArea());
                    System.out.println("Perimeter: " + square.calculatePerimeter());
                }
                case 2 -> {
                    System.out.println("Enter the value of the three sides of the triangle:");
                    double side1 = scanner.nextDouble();
                    double side2 = scanner.nextDouble();
                    double side3 = scanner.nextDouble();
                    System.out.println("Enter the value of the base and height of the triangle:");
                    double base = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    Triangle triangle = new Triangle(side1, side2, side3, base, height);
                    System.out.println("Area: " + triangle.calculateArea());
                    System.out.println("Perimeter: " + triangle.calculatePerimeter());
                }
                case 3 -> {
                    System.out.println("Enter the value of the base and height of the rectangle:");
                    double baseR = scanner.nextDouble();
                    double heightR = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(baseR, heightR);
                    System.out.println("Area: " + rectangle.calculateArea());
                    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
                }
                case 4 -> {
                    System.out.println("Enter the value of the side of the square:");
                    double sideS = scanner.nextDouble();
                    Square squareCombined = new Square(sideS);
                    System.out.println("Enter the value of the base and height of the triangle:");
                    double baseT = scanner.nextDouble();
                    double heightT = scanner.nextDouble();
                    Triangle triangleCombined = new Triangle(0, 0, 0, baseT, heightT);
                    System.out.println("Enter the value of the base and height of the rectangle:");
                    double baseC = scanner.nextDouble();
                    double heightC = scanner.nextDouble();
                    Rectangle rectangleCombined = new Rectangle(baseC, heightC);
                    List<GeometricShapes> shapes = new ArrayList<>();
                    shapes.add(squareCombined);
                    shapes.add(triangleCombined);
                    shapes.add(rectangleCombined);
                    CombinedShapes combinedShapes = new CombinedShapes(shapes);
                    double totalArea = combinedShapes.calculateCombinedArea();
                    System.out.println("Combined areas: " + totalArea);
                }
                case 5 -> {
                    System.out.println("Bye!");
                }
                default -> System.out.println("Invalid option!!");
            }
        } while (shape != 5);
    }
}