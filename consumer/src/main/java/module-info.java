import org.example.service.Converter;

module org.example.consumer {
    requires org.example.service;
    requires org.example.providers;
    uses Converter;
}