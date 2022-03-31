package Practicum08;

import java.time.LocalDate;

public class Fiets extends Voertuig{
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr){
        super(tp, pr, jr);
        framenummer = fnr;
    }

    public double huidigeWaarde(){
        int jarenOud = LocalDate.now().getYear() - super.bouwjaar;
        return 1*Math.pow(0.9, jarenOud) * nieuwprijs;
    }

    public boolean equals(Object obj){
        if(obj instanceof Fiets){
            if(((Fiets) obj).framenummer == this.framenummer){
                return true;
            }
        }
        return false;
    }
}
