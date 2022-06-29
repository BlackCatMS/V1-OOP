package Practicum11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;


/*
Herkansing: Wanneer het bronbestand niet bestaat, moet de user een nieuwe mogelijkheid krijgen om het bronbestand opnieuw
in te voeren.
Herkansing: Exception handling bij koerswaardeinvoer, zodra er niet een Double ingevoerd wordt, krijgt de gebruiker een
nieuwe poging, of gaat het programma uit van de koerswaarde: 1 USD = 0.918720 EUR
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboardScanner = new Scanner(System.in);

        Path p1 = null;
        String originName = "";
        boolean originFileExists = false;

        while (originFileExists == false) {
            System.out.println("Please insert the origin file below:");
            originName = keyboardScanner.nextLine() + ".txt";
            p1 = Path.of("src/Practicum11/" + originName);
            if (new File(String.valueOf(p1)).exists()) {
                originFileExists = true;
                break;
            }
            System.out.println("That file doesn't exist, please try again!");
        }

        Path p2 = null;
        String destName = "";
        boolean destFileExists = false;

        while (destFileExists == false) {
            System.out.println("\nPlease insert the destination file below:");
            destName = keyboardScanner.nextLine() + ".txt";
            p2 = Path.of("src/Practicum11/" + destName);
            if (!new File(String.valueOf(p2)).exists()) {
                Files.createFile(p2);
                System.out.println("File " + destName + " created!");
                break;
            }
            else {
                System.out.println("That file already exists!");
            }
        }

        boolean validValue = false;
        double exchangeRate = 0.918720; // Pre-defined value of EUR in USD

        while (validValue == false) {
            System.out.println("Please insert the current value of EUR in USD:");
            try {
                exchangeRate = Double.parseDouble(keyboardScanner.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input: That's not a number!");
                System.out.println("Defaulting to exchange rate: 1 USD / " + exchangeRate + " EUR");
                break;
            }
        }

        List<String> USDContent = Files.readAllLines(p1.toAbsolutePath());

        if (Files.exists(p2)) {
            BufferedWriter output = Files.newBufferedWriter(p2);
            String flow = "";
            for (String line : USDContent) {
                String[] s = line.split(" : ");
                String dollarPrice = s[s.length - 1];
                Double EURPrice = Double.parseDouble(dollarPrice) * exchangeRate;

                flow += s[s.length - 2] + " : " + String.format("%.2f", EURPrice) + "\n";

            }
            output.write(flow);
            output.close();
            System.out.println("Conversion success! The converted prices are located at " + destName);
        }
    }
}
