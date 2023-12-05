package com.felistron.aoc2023;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {
    public static List<String> readInput(String filename) throws FileNotFoundException {
        URL url = ClassLoader.getSystemClassLoader().getResource(filename);

        if (url == null) throw new FileNotFoundException("El archivo no existe: " + filename);

        File file = new File(url.getPath());

        Scanner scanner = new Scanner(file);
        scanner.useDelimiter(" ");

        List<String> lines = new ArrayList<>();

        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }

        scanner.close();

        return lines;
    }
}
