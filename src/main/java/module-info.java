module com.example.nepali5yearcalendar {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.nepali5yearcalendar.controller to javafx.fxml;
    exports com.example.nepali5yearcalendar;
}