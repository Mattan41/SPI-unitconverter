package org.example.consumer;

import org.example.providers.FeetToMeterConverter;
import org.example.providers.MeterToFeetConverter;
import org.example.service.Converter;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {

        ServiceLoader<Converter> loader = ServiceLoader.load(Converter.class);

        System.out.println("Choose a converter:");

        int choice = org.example.consumer.inputReader.inputIntChoice("1. Convert Meter To Feet\n2. Convert Feet To Meter");

        switch (choice) {
            case 1 -> useConverter(loader, MeterToFeetConverter.class);
            case 2 -> useConverter(loader, FeetToMeterConverter.class);
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void useConverter(ServiceLoader<Converter> loader, Class<? extends Converter> converterClass) {
        for (Converter converter : loader) {
            if (converterClass.isInstance(converter)) {
                System.out.println(converter.inputPrompt());
                int input = org.example.consumer.inputReader.inputInt("");
                System.out.println(converter.convert(input));
                break;
            }
        }
    }
}
