package Practicum04;

public class Huis {
    private String adres;
    private int bouwjaar;
    private String huisbaas;
    private int leeftijd;

    public Huis(String adr, int bwjr) {
        adres = adr;
        bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb) {
        huisbaas = hb.getName();
        leeftijd = hb.getLeeftijd();
    }

    public String getHuisbaas() {
        return huisbaas + "; Leeftijd " + leeftijd + " jaar";
    }

    public String toString() {
        return "Huis " + adres + " is gebouwd in " + bouwjaar;
    }
}
