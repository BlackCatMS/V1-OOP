package Practicum02;

public class Pool {
    private double width;
    private double length;
    private double depth;

    public Pool(double width, double length, double depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    public Pool() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double volume() {
        return width * length * depth;
    }

    public String toString() {
        return "This pool is " + width + " metres wide, " + length + " metres long, and " + depth + " metres deep.";
    }
}
