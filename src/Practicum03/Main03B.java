package Practicum03;

public class Main03B {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);

        /*
        Beredenering weghalen try-except block bij het creëren van een nieuwe cirkel met een radius van ≤ 0
        De code zal hoogstwaarschijnlijk wel succesvol compileren, maar tijdens het uitvoeren van het programma
        zal het mislopen en stopt het programma bij het creëren van cirkel c2.

        Realisatie:
        Na het verwijderen van het try-except block, compileert de code wel, maar ontstaat er een
        IllegalArgumentException, omdat er in Cirkel.java een if-statement is die controleert of de radius ≤ 0 is.
        Als ook die if-statement weggehaald wordt, dan compileert de code naar behoren, en worden de waardes van c2
        "Cirkel (c2) (10, 10) met radius: 0"
         */
    }
}
