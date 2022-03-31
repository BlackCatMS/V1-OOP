package Practicum08;

import java.time.LocalDate;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr){
        type = tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }

    public double huidigeWaarde(){
        int jarenOud = LocalDate.now().getYear() - productieJaar;
        return 1*Math.pow(0.6, jarenOud) * aanschafPrijs;
    }

    public boolean equals(Object obj){
        if(obj instanceof Computer){
            if(((Computer) obj).macAdres.equals(this.macAdres)){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return "Computer: " + this.type + " heeft een waarde van €" + this.huidigeWaarde();
    }
}
