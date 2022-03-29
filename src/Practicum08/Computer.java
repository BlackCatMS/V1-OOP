package Practicum08;

public class Computer implements Goed {

    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }

    public double huidigeWaarde() {

    }

    public boolean equals(Object obj) {

    }

    public String toString() {
        return "placeholder";
    }

}
