package Practicum05;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen = new ArrayList<>();

    public Klas(String kC){
        klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l) {
        deLeerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling ll : deLeerlingen) {
            if (ll.getNaam().equals(nm)) {
                ll.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return(deLeerlingen);
    }

    public int aantalLeerlingen() {
        return getLeerlingen().size();
    }

    public String toString() {
        String info = "In klas " + klasCode + " zitten de volgende leerlingen:\n";

        for (Leerling ll : getLeerlingen()) {
            info += ll + "\n";
        }
        return info;
    }

}
