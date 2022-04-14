package Practicum04;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm) {
        naam = nm;
    }

    public void setKorting(double kP) {
        this.kortingsPercentage = kP;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public String toString() {
        return "op naam van: " + naam + " (korting: " + kortingsPercentage + "%)";
    }
}
