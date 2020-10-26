package com.company.models;

public class RightAngleTriangle {
    private double height;
    private double base;

    public RightAngleTriangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calculateRightAngleTriangle(double height, double base) {
        double area = height * (base / 2);
        return area;
    }
}
