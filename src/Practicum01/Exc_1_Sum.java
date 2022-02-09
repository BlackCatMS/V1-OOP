package Practicum01;

public class Exc_1_Sum {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 40; i++) {
            total = total + i;
            System.out.println("Current total number at count " + i + ": " + total);
        }
    }
}
