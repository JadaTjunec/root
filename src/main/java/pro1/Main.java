package pro1;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Path inputPath = Paths.get(System.getProperty("user.dir"), "input");
        Path outputPath = Paths.get(System.getProperty("user.dir"), "output");

        try {

            File inputDir = inputPath.toFile();
            File[] files = inputDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".csv"));

            if (files == null) return;

            for (File file : files) {
                List<String> lines = Files.readAllLines(file.toPath());
                List<String> outputLines = new ArrayList<>();

                for (String line : lines) {
                    if (line.trim().isEmpty()) continue;

                    String[] parts = line.split("[,;:=]");
                    if (parts.length < 2) continue;

                    String id = parts[0].trim();
                    String rawScore = parts[1].trim();

                    Fraction score = Fraction.parse(rawScore);


                    outputLines.add(id + ";" + score.toString());
                }


                Files.write(outputPath.resolve(file.getName()), outputLines);
            }
            System.out.println("Zpracování dokončeno. Soubory jsou v /output.");

        } catch (IOException e) {
            System.err.println("Chyba při práci se soubory: " + e.getMessage());
        }
    }
}