package Class04;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar baasje;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }

    public String getNaam() {
        return naam;
    }

    public String getRas()  {
        return ras;
    }

    public void setBaasje(Eigenaar baasje) {
        this.baasje = baasje;
    }

    public Eigenaar getBaasje() {
        return this.baasje;
    }

    public String toString() {
        if (baasje != null) {
            return naam + ", de " + ras + ", weegt " + gewicht + " kg." + "\nEn de eigenaar is " + baasje;
        }
        return naam + ", de " + ras + ", weegt " + gewicht + " kg." + "\nEn de eigenaar is niet bekend";
    }
}
