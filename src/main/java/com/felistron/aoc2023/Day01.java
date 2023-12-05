package com.felistron.aoc2023;

import java.io.FileNotFoundException;
import java.util.List;

public class Day01 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> input = Util.readInput("day01.txt");
        int out = part1(input);
        System.out.println(out);
    }

    public static int part1(List<String> input) {
        int result = 0;


        for (String line : input) {
            StringBuilder sb = new StringBuilder();

            char[] chars = line.toCharArray();

            for (char lChar : chars) {
                if (lChar >= 48 && lChar <= 57) {
                    sb.append(lChar);
                    break;
                }
            }

            for (int r = chars.length - 1; r >= 0; r--) {
                if (chars[r] >= 48 && chars[r] <= 57) {
                    sb.append(chars[r]);
                    break;
                }
            }

            result += Integer.parseInt(sb.toString());
        }

        return result;
    }
}