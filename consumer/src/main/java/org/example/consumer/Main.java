package org.example.consumer;

import org.example.service.converterName;
import org.example.service.Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import static org.example.consumer.inputReader.inputIntChoice;

public class Main {
    public static void main(String[] args) {

        ServiceLoader<Converter> loader = ServiceLoader.load(Converter.class);
        List<Converter> converters = getConverters(loader);

        System.out.println("Choose a converter:");

        String converterMenu = getConverterMenu(converters);
        int choice = inputIntChoice((converterMenu), converters);
        useConverter(choice, converters);
    }

    private static List<Converter> getConverters(ServiceLoader<Converter> loader) {
        List<Converter> converters = new ArrayList<>();
        for (Converter converter : loader) {
            converters.add(converter);
        }
        return converters;
    }

    private static void useConverter(int choice, List<Converter> converters) {
        if (choice >= 1 && choice <= converters.size()) {
            Converter converter = converters.get(choice - 1);
            System.out.println(converter.inputPrompt());
            int input = inputReader.inputInt("");
            System.out.println(converter.convert(input));
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    private static String getConverterMenu(List<Converter> converters) {
        StringBuilder convertMenu = new StringBuilder();

        for (int i = 0; i < converters.size(); i++) {
            String className = converters.get(i).getClass().getAnnotation(converterName.class).value();

            convertMenu.append(i + 1).append(". ").append(className).append("\n");
        }

        return convertMenu.toString();
    }
}