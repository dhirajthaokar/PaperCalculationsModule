package org.example;

public class CutPiece {
    private double length; // Length of the cut piece
    private double width;  // Width of the cut piece


    private double rem_length;

    private double rem_width;

    private String desc;

    public CutPiece(double length, double width) {
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
// Getters and setters


    public double getRem_length() {
        return rem_length;
    }

    public void setRem_length(double rem_length) {
        this.rem_length = rem_length;
    }

    public double getRem_width() {
        return rem_width;
    }

    public void setRem_width(double rem_width) {
        this.rem_width = rem_width;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "CutPiece{" +
                "length=" + length +
                ", width=" + width +
                ", rem_length=" + rem_length +
                ", rem_width=" + rem_width +
                ", desc='" + desc + '\'' +
                '}';
    }
}
