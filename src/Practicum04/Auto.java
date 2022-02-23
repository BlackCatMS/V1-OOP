package Practicum04;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd) {
        type = tp;
        prijsPerDag = prPd;
    }

    public void setPrijsPerDag(double prPd) {
        this.prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setType(String tp) {
        this.type = tp;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
}
