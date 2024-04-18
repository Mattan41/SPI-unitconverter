package org.example.providers;

import org.example.service.Converter;

public class FeetToMeterConverter implements Converter {

//    public FeetToMeterConverter() {
//        System.out.println("\nFeet To Meter Converter instantiated");
//    }

    @Override
    public String inputPrompt() {
        return "input feet: ";
    }

    @Override
    public String convert(int input) {
        return input + " feet is equal to " + input * 0.3048 + " meters";
    }
}
