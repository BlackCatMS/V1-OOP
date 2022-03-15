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
        int yearDiff = LocalDate.now().getYear() - releaseJaar;

        if (yearDiff > 0) {
            double currentPrice = this.nieuwprijs;

            for (int i = 0; i < yearDiff; i++) {
                currentPrice *= 0.7;
            }
            return currentPrice;
        } else {
            return nieuwprijs;
        }

    }

    @Override
    public boolean equals(Object andereObject) {

        if (andereObject instanceof Game) {
            Game g = (Game) andereObject;
            if (this.naam.equals(g.naam) && this.releaseJaar == g.releaseJaar) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + String.format("%.2f", nieuwprijs) +
                " nu voor: €" + String.format("%.2f", huidigeWaarde());
    }

}
