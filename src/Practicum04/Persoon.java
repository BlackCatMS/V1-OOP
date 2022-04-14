package Practicum04;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft) {
        naam = nm;
        leeftijd = lft;
    }
    public String toString() {
        return naam + "; Leeftijd " + leeftijd + " jaar.";
    }
}
