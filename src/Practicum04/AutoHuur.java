package Practicum04;

public class AutoHuur {
    private int aantalDagen;

    public AutoHuur() {
    }

    public void setAantalDagen(int aD) {
        aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
    }

    public Auto getGehuurdeAuto() {
        return auto;
    }

    public void setHuurder(Klant k) {
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        return totaalPrijs;
    }

    public String toString() {
        return "placeholder";
    }
}
