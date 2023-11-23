module com.example.forecast_apk {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.forecast_apk to javafx.fxml;
    exports com.example.forecast_apk;
}