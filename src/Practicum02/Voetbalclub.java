package Practicum02;

public class Voetbalclub {
    private String name;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String nm) {
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
        return aantalGewonnen * 3 + aantalGelijk;
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