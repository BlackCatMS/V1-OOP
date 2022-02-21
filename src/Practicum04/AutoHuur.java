package Practicum04;

public class AutoHuur {
    private int aantalDagen;
    private String autoType;

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

    public String getGehuurdeAuto() {
        return autoType;
    }

    public Auto setGehuurdeAuto() {
        autoType = Auto.getType();
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
