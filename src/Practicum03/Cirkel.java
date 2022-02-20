package Practicum03;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y) {
        radius = rad;
        xPositie = x;
        yPositie = y;

        if (rad <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
    }

    public String toString() {
        return "Cirkel (" + xPositie + ", " + yPositie + ") met radius: " + radius;
    }
}
