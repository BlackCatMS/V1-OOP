package Practicum08;

import Practicum09A.Utils;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        framenummer = fnr;
    }

    public double huidigeWaarde() {
        int jarenOud = LocalDate.now().getYear() - super.bouwjaar;
        return Double.parseDouble(Utils.euroBedrag(1 * Math.pow(0.9, jarenOud) * nieuwprijs));
    }

    public boolean equals(Object obj) {
        if(obj instanceof Fiets) {
            Fiets newFiets = (Fiets) obj;

            if(this.framenummer == newFiets.framenummer &&
               this.nieuwprijs == newFiets.nieuwprijs &&
               this.bouwjaar == newFiets.bouwjaar) {
                   return true;
            }
        }
        return false;
    }
}
