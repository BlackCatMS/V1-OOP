package Practicum04;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft) {
        naam = nm;
        leeftijd = lft;
    }

    public Persoon() {

    }

    public String getName() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String toString() {
        return naam + "; Leeftijd " + leeftijd + " jaar.";
    }
}
