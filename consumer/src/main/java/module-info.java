import org.example.service.Converter;

module org.example.consumer {
    requires org.example.service;
    uses Converter;
}