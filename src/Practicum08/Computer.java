package Practicum08;

import Practicum09A.Utils;

import java.time.LocalDate;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        type = tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }

    public double huidigeWaarde() {
        int jarenOud = LocalDate.now().getYear() - productieJaar;
        return Double.parseDouble(Utils.euroBedrag(1 * Math.pow(0.6, jarenOud) * aanschafPrijs));
    }

    public boolean equals(Object obj) {
        if(obj instanceof Computer) {
            Computer newPC = (Computer) obj;

            if(this.macAdres.equals(newPC.macAdres) &&
               this.type == newPC.type &&
               this.aanschafPrijs == newPC.aanschafPrijs &&
               this.productieJaar == newPC.productieJaar) {
                   return true;
            }
        }
        return false;
    }

    public String toString() {
        return "Computer: " + this.type + " heeft een waarde van €" + this.huidigeWaarde();
    }
}
