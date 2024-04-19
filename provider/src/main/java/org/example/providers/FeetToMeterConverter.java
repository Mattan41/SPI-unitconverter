package org.example.providers;

import org.example.service.Converter;

@converterName(value = "Feet To Meter")
public class FeetToMeterConverter implements Converter {

    @Override
    public String inputPrompt() {
        return "input feet: ";
    }

    @Override
    public String convert(int input) {
        return input + " feet is equal to " + input * 0.3048 + " meters";
    }
}
