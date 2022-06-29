package Practicum09A;

public class Main {
    public static void main(String [] Args){
        System.out.println(Utils.euroBedrag(55.893256)); // Random number, auto precision
        System.out.println(Utils.euroBedrag(3.14159)); // Given number, auto precision
        System.out.println(Utils.euroBedrag(3.14159, 1)); // Given number, .1 precision
        System.out.println(Utils.euroBedrag(3.14159, 2)); // Given number, .01 precision
        System.out.println(Utils.euroBedrag(3.14159, 0)); // Given number, no precision
        System.out.println(Utils.euroBedrag(0.417452986, 6)); // Random number, .000001 precision

    }
}
