package Practicum09A;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utils {
    private static int counter;

    private static String afronden(double bedrag, int precisie){
        counter+=1;
        BigDecimal bd = new BigDecimal(bedrag);
        bd = bd.setScale(precisie, RoundingMode.HALF_UP);
        return bd.doubleValue() + "";
    }

    public static String euroBedrag(double bedrag) {
        return afronden(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        return afronden(bedrag, precisie);
    }

    public static int getCounter(){
        return counter;
    }
}
