package Practicum04;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft) {
        naam = nm;
        leeftijd = lft;
    }

    public String getName() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String toString() {
        return "en heeft huisbaas " + naam + "; Leeftijd " + leeftijd + " jaar.";
    }
}
