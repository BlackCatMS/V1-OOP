package Practicum09;

import java.text.NumberFormat;

public class Utils {

    private static double bedrag;
    private static int precisie;

    public static String euroBedrag(double bedrag) {
        Utils.bedrag = bedrag;

        return "€" + bedrag;
    }

    public static String euroBedrag (double bedrag, int precisie) {
        Utils.bedrag = bedrag;
        Utils.precisie = precisie;

        NumberFormat nf = NumberFormat.getInstance();
        StringBuilder number = new StringBuilder();
        for (int i = precisie; i < Double.toString(bedrag).length(); ++i) {
            number.append(i);
        }
        return "€" + number;
    }
}
