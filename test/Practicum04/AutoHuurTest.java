package Practicum04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class AutoHuurTest {

    // Testgeval 1: De totaalprijs wordt correct berekend bij een huurder met een gehuurde auto, met & zonder korting
    @Test
    public void checkRenterWithoutDiscountProcess() {
        System.out.println("Running test: Renter without discount.");
        AutoHuur huur1 = new AutoHuur();
        Klant klant1 = new Klant("Willem");
        klant1.setKorting(0.0);
        huur1.setHuurder(klant1);

        Auto auto1 = new Auto("Pagani Zonda", 500);
        huur1.setGehuurdeAuto(auto1);
        huur1.setAantalDagen(5);
        assertEquals(2500, huur1.totaalPrijs(), "Expected the cost to be 2500 (5 * 500, no discount)");
        System.out.println("Test passed: Renter without discount.\n");
    }

    @Test
    public void checkRenterWithDiscountProcess() {
        System.out.println("Running test: Renter with discount.");
        AutoHuur huur2 = new AutoHuur();
        Klant klant2 = new Klant("Machlon");
        klant2.setKorting(25.0);
        huur2.setHuurder(klant2);

        Auto auto2 = new Auto("Opel Karl", 20);
        huur2.setGehuurdeAuto(auto2);
        huur2.setAantalDagen(10);
        assertEquals(150, huur2.totaalPrijs(), "Expected the cost to be 150 (10 * 20, 25% discount)");
        System.out.println("Test passed: Renter with discount.\n");
    }

    // Testgeval 2: String output wordt correct verwerkt
    @Test
    public void checkCorrectProcessOfStringOutput() {
        System.out.println("Running test: String output is processed correctly.");
        AutoHuur huur3 = new AutoHuur();
        Klant klant3 = new Klant("Patryk");
        klant3.setKorting(10.0);
        huur3.setHuurder(klant3);

        Auto auto3 = new Auto("Ferrari 458 Pista", 100);
        huur3.setGehuurdeAuto(auto3);
        huur3.setAantalDagen(5);
        assertEquals("Autotype: Ferrari 458 Pista met prijs per dag: 100.0\nop naam van: Patryk (korting: 10.0%)\naantal dagen: 5, en dat kost: €450.0",
                huur3.toString(),"The toString function did not process the data correctly.");
        System.out.println("Test passed: toString output processes correctly.\n");
    }

    // Testgeval 3: Geen huurder, geen auto
    @Test
    public void checkReturnsNoRenterNoCar() {
        System.out.println("Running test: Data processing with: No renter, no car.");
        AutoHuur huur4 = new AutoHuur();

        assertEquals("er is geen auto bekend\ner is geen huurder bekend\naantal dagen: 0, en dat kost: €0.0",
                huur4.toString(), "The toString function did not process the data correctly.");
        System.out.println("Test passed: toString output processes correctly with arguments: No renter, no car.\n");
    }

    // Testgeval 4: Geen huurder, wel een auto
    @Test
    public void checkReturnsNoRenterOneCar() {
        System.out.println("Running test: Data processing with: No renter, one car.");
        AutoHuur huur5 = new AutoHuur();

        Auto auto5 = new Auto("McLaren 720s", 250);
        huur5.setGehuurdeAuto(auto5);
        huur5.setAantalDagen(5);
        assertEquals("Autotype: McLaren 720s met prijs per dag: 250.0\ner is geen huurder bekend\naantal dagen: 5, en dat kost: €0.0",
                huur5.toString(), "The toString function did not process the data correctly.");
        System.out.println("Test passed: toString output processes correctly with arguments: No renter, one car.\n");
    }

    // Testgeval 5: Wel een huurder, geen auto
    @Test
    public void checkReturnsOneRenterNoCar() {
        System.out.println("Running test: Data processing with: One renter, no car.");
        AutoHuur huur6 = new AutoHuur();
        Klant klant6 = new Klant("Stephen");
        klant6.setKorting(5.0);
        huur6.setHuurder(klant6);

        assertEquals("er is geen auto bekend\nop naam van: Stephen (korting: 5.0%)\naantal dagen: 0, en dat kost: €0.0",
                huur6.toString(), "The toString function did not process the data correctly.");
        System.out.println("Test passed: toString output processes correctly with arguments: One renter, no car.\n");

    }

}