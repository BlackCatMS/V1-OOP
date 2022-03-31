package Practicum08;

public class Main {
    public static void main(String [] args){
        BedrijfsInventaris hogeschool = new BedrijfsInventaris("Hogeschool Utrecht", 10000000);

        Computer gamePC = new Computer("Razer Blade 14", "00:0C:6E:D2:11:E6", 1000, 2020);
        Computer officePC = new Computer("Samsung Book 14", "00:0C:6E:D2:11:E6", 1000, 2019);
        Computer verschillendePC = new Computer("Porsche Book 1", "00:0c:6E:D2:11:E6", 1200, 2021);

        Auto auto1 = new Auto("Opel Karl", 20000, 2019, "7SGP45");
        Auto auto2 = new Auto("Opel Karl", 20000, 2019, "7SGP45");
        Auto verschillendeAuto = new Auto("Pininfarina Battista", 750000, 2022, "7TV320");

        Fiets fiets1 = new Fiets("Cortina Foss", 200, 2019, 123);
        Fiets fiets2 = new Fiets("Cortina Foss", 200, 2019, 123);
        Fiets verschillendeFiets = new Fiets("Amslod Eton E-MD-600", 800, 2021, 777);
        Fiets dureFiets = new Fiets("Ribble CGR SL", 1700, 2022, 100);

        hogeschool.schafAan(gamePC);
        hogeschool.schafAan(officePC);
        hogeschool.schafAan(verschillendePC);

        hogeschool.schafAan(auto1);
        hogeschool.schafAan(auto2);
        hogeschool.schafAan(verschillendeAuto);

        hogeschool.schafAan(fiets1);
        hogeschool.schafAan(fiets2);
        hogeschool.schafAan(verschillendeFiets);
        hogeschool.schafAan(dureFiets);

        System.out.println(hogeschool);
    }
}
