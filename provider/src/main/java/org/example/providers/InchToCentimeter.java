package org.example.providers;

import org.example.service.Converter;
import org.example.service.ConverterName;

@ConverterName("Inch To Centimeter")
public class InchToCentimeter implements Converter {

    @Override
    public String inputPrompt() {
        return "input inch: ";
    }

    public String convert(int input) {
        return input + " inch is equal to " + input * 2.54 + " centimeter";
    }
}
