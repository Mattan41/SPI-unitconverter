package org.example.providers;

import org.example.service.Converter;
import org.example.service.converterName;

@converterName("Feet To Meter")
public class FeetToMeterConverter implements Converter {

    @Override
    public String inputPrompt() {
        return "input foot: ";
    }

    @Override
    public String convert(int input) {
        return input + " feet is equal to " + input * 0.3048 + " meters";
    }
}
