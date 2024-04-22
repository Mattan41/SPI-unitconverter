import org.example.providers.CentimeterToInch;
import org.example.providers.FeetToMeterConverter;
import org.example.providers.InchToCentimeter;
import org.example.providers.MeterToFeetConverter;
import org.example.service.Converter;

module org.example.providers {
    requires org.example.service;
    provides Converter with MeterToFeetConverter, FeetToMeterConverter, CentimeterToInch, InchToCentimeter;
}