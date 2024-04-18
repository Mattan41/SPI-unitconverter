package org.example.providers;

import org.example.service.Converter;


public class MeterToFeetConverter implements Converter {
    @Override
    public String convert(int input) {
        return input + " meters is equal to " + input * 3.28084 + "in feet";
    }

}
