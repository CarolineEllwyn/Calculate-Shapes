package com.company.models;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radie) {
        this.radius = radie;
    }

    public double calculateCircle(double radius) {
        double area = radius * radius * Math.PI;
        return area;
    }
}
