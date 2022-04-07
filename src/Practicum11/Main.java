package Practicum11;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboardScanner = new Scanner(System.in);

        System.out.println("Please insert the origin file below: ");
        String originName = keyboardScanner.nextLine() + ".txt";
        System.out.println("Origin file: " + originName);
        Path p1 = Path.of("src/Practicum11/" + originName);
        System.out.println(p1.toAbsolutePath() + "\n");

        System.out.println("Please insert the destination file below: ");
        String destName = keyboardScanner.nextLine() + ".txt";
        System.out.println("Destination file: " + destName);
        Path p2 = Path.of("src/Practicum11/"+ destName);
        Files.createFile(p2);
        System.out.println(p2.toAbsolutePath() + "\n");

        System.out.println("Please insert the current value of EUR in USD:");
        Double tradeValue = Double.parseDouble(keyboardScanner.nextLine());

        List<String> USDContent = Files.readAllLines(p1.toAbsolutePath());

        if (Files.exists(p2)) {
            BufferedWriter output = Files.newBufferedWriter(p2);
            String flow = "";
            for (String line : USDContent) {
                String[] s = line.split(" : ");
                String dollarPrice = s[s.length - 1];
                Double EURPrice = Double.parseDouble(dollarPrice) * tradeValue;

                flow += s[s.length-2] + " : " + String.format("%.2f", EURPrice) + "\n";

            }
            output.write(flow);
            output.close();
            System.out.println("Conversion success! The converted prices are located at " + p2);
        }



    }
}
