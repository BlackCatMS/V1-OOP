package Practicum08;

abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr){
        this.type = tp;
        this.nieuwprijs = pr;
        this.bouwjaar = jr;
    }

    public boolean equals(Object obj){
        if(obj instanceof Voertuig){
            if(((Voertuig) obj).equals(this.type) && ((Voertuig) obj).bouwjaar == this.bouwjaar){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return "Voertuig: " + this.type + " met bouwjaar " + this.bouwjaar + " heeft een waarde van: €" + this.huidigeWaarde() + ".";
    }
}
