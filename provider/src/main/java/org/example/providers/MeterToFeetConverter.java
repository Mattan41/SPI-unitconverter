package org.example.providers;

import org.example.service.Converter;
import org.example.service.ConverterName;

@ConverterName("Meter To Feet")
public class MeterToFeetConverter implements Converter {

    @Override
    public String inputPrompt() {
        return "input meter: ";
    }

    @Override
    public String convert(int input) {
        return input + " meters is equal to " + input * 3.28084 + " feet";
    }

}
