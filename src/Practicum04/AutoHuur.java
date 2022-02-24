package Practicum04;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

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

    public double totaalPrijs() {
        if (gehuurdeAuto == null) {
            return 0.0;
        } else if (huurder == null) {
            return 0.0;
        } else {
            return (aantalDagen * gehuurdeAuto.getPrijsPerDag()) / 100 * (100 - huurder.getKorting());
        }
    }

    public String toString() {
        String info = "";
        if (gehuurdeAuto == null) {
            info += "er is geen auto bekend";

        } else {
            info += "Autotype: " + gehuurdeAuto;
        }

        if (huurder == null) {
            info += "\ner is geen huurder bekend";
        } else {
            info += "\n"+ huurder;
        }

        return info + "\naantal dagen: " + aantalDagen + ", en dat kost: €" + totaalPrijs();

    }
}
