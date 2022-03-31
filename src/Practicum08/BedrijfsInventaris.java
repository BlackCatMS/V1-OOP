package Practicum08;

import java.util.ArrayList;

public class BedrijfsInventaris{
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen = new ArrayList<>();

    public BedrijfsInventaris(String nm, double bud){
        bedrijfsnaam = nm;
        budget = bud;
    }

    public void schafAan(Goed g){
        if(!this.alleGoederen.contains(g) && this.budget >= g.huidigeWaarde()){
            this.budget -= g.huidigeWaarde();
            alleGoederen.add(g);
        }
    }

    public String toString(){
        String s = "Alle goederen in het inventaris:\n";
        for (Goed g : alleGoederen){
            s += g.toString() + "\n";
        }
        return s;
    }
}
