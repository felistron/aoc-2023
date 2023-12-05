package com.felistron.aoc2023;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Day01Test {
    private List<String> input;

    @BeforeEach
    void setUp() throws FileNotFoundException {
        input = Util.readInput("day01-test.txt");
    }

    @Test
    void part1() {
        int actual = Day01.part1(input);
        int expected = 142;
        assertEquals(expected, actual);
    }
}