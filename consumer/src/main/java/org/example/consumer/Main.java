package org.example.consumer;

import org.example.service.Converter;

import java.io.IOException;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        ServiceLoader<Converter> loader = ServiceLoader.load(Converter.class);
    //todo: choose input/output parameter
        System.out.println("enter meters: "); // todo: get prompt from Converter that is used

        int input = Integer.parseInt(scanner.nextLine());

        for (Converter converter : loader) {
            System.out.println(converter.convert(input));
        }

        System.out.println(loader.iterator().next().convert(input));


    }
}
