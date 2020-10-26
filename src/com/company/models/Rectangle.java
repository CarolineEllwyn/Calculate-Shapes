package com.company.models;

public class Rectangle {
    private double high;
    private double length;


    public Rectangle(double high, double length) {
        this.high = high;
        this.length = length;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public double calculateRectangle(double high, double length) {
        double area = high * length;
        return area;
    }
}
