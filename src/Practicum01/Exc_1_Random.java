package Practicum01;

public class Exc_1_Random {
    public static void main(String[] args) {
        int count = 1;
        while (count < 11) {
            System.out.println("Random number " + count + ": " + Math.random());
            count++;
        }
    }
}
