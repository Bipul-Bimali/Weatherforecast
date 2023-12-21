module com.example.forecast_apk {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.sql;


    opens com.example.forecast_apk to javafx.fxml;
    exports com.example.forecast_apk;
}