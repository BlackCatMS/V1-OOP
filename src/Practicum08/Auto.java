package Practicum08;

import Practicum09.Utils;

import java.time.LocalDate;

public class Auto extends Voertuig{
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        super(tp, pr, jr);
        kenteken = kt;
    }

    public double huidigeWaarde(){
        int jarenOud = LocalDate.now().getYear() - super.bouwjaar;
        return Double.parseDouble(Utils.euroBedrag(1*Math.pow(0.7, jarenOud) * nieuwprijs));
    }

    public boolean equals(Object obj){
        if (obj instanceof Auto){
            if(((Auto) obj).kenteken.equals(this.kenteken)){
                return true;
            }
        }
        return false;
    }
}
