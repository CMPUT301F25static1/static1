package com.example.static1;

public class Heart extends Shape {
    private double size;

    public Heart(int x, int y, double size) {
        super(x, y);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}