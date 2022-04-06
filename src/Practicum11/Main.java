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

//        System.out.println("Please insert the destination file below: ");
//        String destName = keyboardScanner.nextLine() + ".txt";
//        System.out.println("Destination file: " + destName);
//        Path p2 = Path.of(destName);
//        Files.createFile(p2);
//        System.out.println(p2.toAbsolutePath() + "\n");

        List<String> USDContent = Files.readAllLines(p1.toAbsolutePath());
        for (String line : USDContent) {
            System.out.println(line);
            String[] s = line.split(":");

        }



    }
}
