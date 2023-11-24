package org.example;

public class PaperRoll {
    private double length=18; // Length of the large paper roll
    private double width=23;  // Width of the large paper roll

    public PaperRoll(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "PaperRoll{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}


