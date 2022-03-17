package Practicum06;

import java.util.ArrayList;

public class Persoon {

    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<Game>();

    public Persoon(String nm, double bud){
        this.naam = nm;
        this.budget = bud;
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (g.huidigeWaarde() < budget && !mijnGames.contains(g)) {
            budget = budget - g.huidigeWaarde();
            mijnGames.add(g);
            return true;
        }
        return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (mijnGames.contains(g) && !koper.mijnGames.contains(g)) {
            if (koper.getBudget() > g.huidigeWaarde()) {
                budget += g.huidigeWaarde();
                koper.koop(g);
                this.mijnGames.remove(g);
                return true;
            }
        }
        return false;
    }

    public Game zoekGameOpNaam(Game nm) {
        if (mijnGames.contains(nm)) {
            return nm;
        }
        else {
            return null;
        }
    }

    @Override
    // Ook hier gelt hetzelfde: De string-conversie kan niet een double van 59.99 omzetten naar 59,99
    public String toString() {
        String info = naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:";

        for (Game item : mijnGames) {
            info += "\n" + item.toString();
        }
        return info;
    }
}
