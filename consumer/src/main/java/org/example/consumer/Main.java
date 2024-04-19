package org.example.consumer;

import org.example.service.Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.StringJoiner;

import static org.example.consumer.inputReader.inputIntChoice;

public class Main {
    public static void main(String[] args) {

        ServiceLoader<Converter> loader = ServiceLoader.load(Converter.class);

        List<Converter> converters = new ArrayList<>();
        for (Converter converter : loader) {
            converters.add(converter);

        }


        System.out.println("Choose a converter:");

        String converterMenu = getConverterMenu(converters);
        int choice = inputIntChoice((converterMenu));

        
        switch (choice) {
            case 1 -> useConverter(converters.get(0));
            case 2 -> useConverter(converters.get(1));
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }

    private static String getConverterMenu(List<Converter> converters) {
        StringBuilder convertMenu = new StringBuilder();

        for (int i = 0; i < converters.size(); i++) {
            String className = converters.get(i).getClass().getName();
            String shortClassName = className.substring(className.lastIndexOf(".") + 1);
            convertMenu.append(i+1).append(". ").append(shortClassName).append("\n");
        }

        return convertMenu.toString();
    }

    private static void useConverter(Converter converter) {

        System.out.println(converter.inputPrompt());
        int input = inputReader.inputInt("");
        System.out.println(converter.convert(input));


    }
}
