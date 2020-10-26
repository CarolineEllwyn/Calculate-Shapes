package com.company;

import com.company.models.Circle;
import com.company.models.Rectangle;
import com.company.models.RightAngleTriangle;
import com.company.models.Square;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Run until user inputs 0
        boolean valid = true;
        do {
            System.out.println("1. Calculate area of a Square");
            System.out.println("2. Calculate area of a Rectangular");
            System.out.println("3. Calculate area of a Circle");
            System.out.println("4. Calculate area of a Right-angled Triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            Scanner choose = new Scanner(System.in);

            int choice = choose.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("God Bye!");
                    System.exit(0);
                    valid = false;
                    break;
                case 1:
                    System.out.println("Enter length of one side: ");
                    double side = choose.nextDouble();
                    Square calculateSquare = new Square(side);
                    System.out.println("Square: " + calculateSquare.calculateSquare());
                    break;
                case 2:
                    System.out.println("Enter height: ");
                    double height = choose.nextDouble();
                    System.out.println("Enter length: ");
                    double length = choose.nextDouble();
                    Rectangle calculateRectangle = new Rectangle(height, length);
                    System.out.println("Rectangulare: " + calculateRectangle.calculateRectangle(height, length));
                    break;
                case 3:
                    System.out.println("Enter the radius: ");
                    double radius = choose.nextDouble();
                    Circle calculateCircle = new Circle(radius);
                    System.out.println("Circle: " + calculateCircle.calculateCircle(radius));
                    break;
                case 4:
                    System.out.println("Enter the height: ");
                    double triangleHeight = choose.nextDouble();
                    System.out.println("Enter the base: ");
                    double triangleBase = choose.nextDouble();
                    RightAngleTriangle calculateRightAngleTriangle = new RightAngleTriangle(triangleHeight, triangleBase);
                    System.out.println("Triangle: " + calculateRightAngleTriangle.calculateRightAngleTriangle(triangleHeight, triangleBase));
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (valid);

    }


}

