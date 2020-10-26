package com.company.models;

public class Square {
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateSquare() {
        double area = this.side * this.side;
        return area;
    }
}
