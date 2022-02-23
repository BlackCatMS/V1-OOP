package Practicum04;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;
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
        this.gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setPrijsPerDag(Auto prPd) {
        this.prijsPerDag = prPd.getPrijsPerDag();
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public double totaalPrijs() {
        return (aantalDagen * getPrijsPerDag()) / 100 * (100 - getKorting());
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
            info += "Autotype: " + getGehuurdeAuto();
        }

        if (huurder == null) {
            info += "\ner is geen huurder bekend";
        } else {
            info += "\n"+ getHuurder();
        }

        return info + "\naantal dagen: " + getAantalDagen() + ", en dat kost: €" + totaalPrijs();

    }
}
