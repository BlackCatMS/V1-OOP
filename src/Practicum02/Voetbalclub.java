package Practicum02;

public class Voetbalclub {
    private String name;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String nm) {
        // Simpele if-statements die controleren of de values van nm null of leeg zijn.
        // Wanneer het beide niet null of niet leeg is, wordt de ingevoerde naam opgeslagen onder private String name.
        if (nm == null) {
            this.name = "FC";
        } else if (nm.equals("")) {
            this.name = "FC";
        } else {
            this.name = nm;
        }
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + (aantalGelijk * 1) + (aantalVerloren * 0);
    }

    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public String toString() {
        return name + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }

    public String getClubName() {
        return name;
    }

    public void setClubName(String club) {
        this.name = club;
    }
}