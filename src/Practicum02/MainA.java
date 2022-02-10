package Practicum02;

public class MainA {
    public static void main(String[] arg) {
        Pool z1 = new Pool(2.0, 5.5, 1.5);
        System.out.println("WIDTH: " + z1.getWidth());
        System.out.println("LENGTH: " + z1.getLength());
        System.out.println("DEPTH: " + z1.getDepth());
        System.out.println("CALCULATED VOLUME: " + z1.volume());
        System.out.println();

        Pool z2 = new Pool( );
        z2.setWidth(2.5);
        z2.setLength(100.0);
        z2.setDepth(2.0);
        double vol = z2.volume();
        System.out.println("PROPERTIES OF POOL: "+z2.toString());
        System.out.println("CALCULATED VOLUME: " + z2.volume());
    }
}
