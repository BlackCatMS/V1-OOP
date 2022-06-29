package Practicum08;

public class Main {
    public static void main(String [] args) {
        BedrijfsInventaris bedrijf = new BedrijfsInventaris("Hogeschool Utrecht", 1000000);

        Computer laptop1 = new Computer("Razer Blade 14", "00:0C:6E:D2:11:E6", 1000, 2020);
        Computer laptop2 = new Computer("Samsung Book 14", "00:0C:6E:D2:11:E6", 1000, 2019);
        Computer otherLaptop = new Computer("Porsche Book 1", "00:0E:6E:D2:11:E6", 1200, 2021);

        Auto auto1 = new Auto("Opel Karl", 20000, 2019, "7SGP45");
        Auto auto2 = new Auto("Opel Karl", 20000, 2019, "7SGP45");
        Auto otherAuto = new Auto("Pininfarina Battista", 750000, 2022, "7TV320");

        Fiets fiets1 = new Fiets("Cortina Foss", 200, 2019, 123);
        Fiets fiets2 = new Fiets("Cortina Foss", 200, 2019, 123);
        Fiets otherFiets = new Fiets("Amslod Eton E-MD-600", 800, 2021, 777);
        Fiets teDureFiets = new Fiets("Ribble CGR SL", 250000, 2022, 100);

        bedrijf.schafAan(laptop1);
        bedrijf.schafAan(laptop2);
        bedrijf.schafAan(otherLaptop);

        bedrijf.schafAan(auto1);
        bedrijf.schafAan(auto2);
        bedrijf.schafAan(otherAuto);

        bedrijf.schafAan(fiets1);
        bedrijf.schafAan(fiets2);
        bedrijf.schafAan(otherFiets);
        bedrijf.schafAan(teDureFiets);

        System.out.println(bedrijf);
    }
}
