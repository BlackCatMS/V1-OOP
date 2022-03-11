package Practicum06;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        int currentYear = LocalDate.now().getYear();

        if (releaseJaar == currentYear) {
            return nieuwprijs;
        } else {
            double currentPrice = 0;

            for (int i = 0; i < releaseJaar; i++)
                currentPrice = nieuwprijs * 0.7;
            return currentPrice;
        }

    }

    @Override
    public boolean equals(Object andereObject) {
        if (andereObject.equals(naam)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return naam + ", uitgegeven in " + releaseJaar + "; Nieuwprijs: €" + String.format("%.2f", nieuwprijs) +
                ", nu voor €" + String.format("%.2f", huidigeWaarde());
    }

}
