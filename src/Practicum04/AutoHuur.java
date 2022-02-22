package Practicum04;

public class AutoHuur {
    private int aantalDagen;
    private String huurder;
    private String gehuurdeAuto;
    private double prijsPerDag;
    private double korting;

    public AutoHuur() {
    }

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA.getType();
    }

    public String getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        this.huurder = k.getNaam();
    }

    public String getHuurder() {
        return huurder;
    }

    public void setPrijsPerDag(Auto pr) {
        this.prijsPerDag = pr.getPrijsPerDag();
    }

    public double totaalPrijs() {
        return aantalDagen * prijsPerDag;
    }

    public void setKorting(Klant kP) {
        this.korting = kP.getKorting();
    }

    public double getKorting() {
        return korting;
    }

    public String toString() {
        String info = "";
        if (gehuurdeAuto == null) {
            info += "er is geen auto bekend";
        } else {
            info += "Autotype: " + gehuurdeAuto + " met prijs per dag " + prijsPerDag;
        }

        if (huurder == null) {
            info += "\ner is geen huurder bekend";
        } else {
            info += "\nop naam van: " + huurder + " (korting: " + korting + "%)";
        }

        return info + "\naantal dagen: " + aantalDagen + " en dat kost: €" + totaalPrijs();

    }
}
