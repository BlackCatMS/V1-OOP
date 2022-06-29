package Practicum08;

import Practicum09A.Utils;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        kenteken = kt;
    }

    public double huidigeWaarde() {
        int jarenOud = LocalDate.now().getYear() - super.bouwjaar;
        return Double.parseDouble(Utils.euroBedrag(1 * Math.pow(0.7, jarenOud) * nieuwprijs));
    }

    public boolean equals(Object obj) {
        if (obj instanceof Auto) {
            Auto newAuto = (Auto) obj;

            if(this.kenteken.equals(newAuto.kenteken) && this.nieuwprijs == newAuto.nieuwprijs && this.bouwjaar == newAuto.bouwjaar) {
                return true;
            }
        }
        return false;
    }
}
