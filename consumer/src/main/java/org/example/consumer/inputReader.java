package org.example.consumer;

import org.example.service.Converter;

import java.util.List;
import java.util.Scanner;

public class inputReader {

    private static final Scanner scanner = new Scanner(System.in);

    public static int inputIntChoice(String prompt, List<Converter> converters) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value < 0 || value > converters.size()) {
                    System.out.println("Invalid input. Please try again.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    public static int inputInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

}

