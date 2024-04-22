package org.example.providers;

import org.example.service.Converter;
import org.example.service.ConverterName;

@ConverterName("Centimeter To Inch")
public class CentimeterToInch implements Converter {
    @Override
    public String inputPrompt() {
        return "input centimeter: ";
    }

    @Override
    public String convert(int input) {
        return input + " centimeter is equal to " + input / 2.54 + " inch";
    }
}
