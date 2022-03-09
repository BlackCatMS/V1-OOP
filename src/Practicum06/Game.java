package Practicum06;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        return nieuwprijs;
    }

    public boolean equals(Object andereObject) {
        return false;
    }

    public String toString() {
        return naam + ", uitgegeven in " + releaseJaar + "; Nieuwprijs: €" + nieuwprijs;
    }

}
