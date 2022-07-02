package Practicum09A;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {

    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        BigDecimal bd = new BigDecimal(bedrag);
        bd = bd.setScale(precisie, RoundingMode.HALF_UP);
        return bd.doubleValue() + "";
    }

}
