module com.example.calculatorjavafxv2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatorjavafxv2 to javafx.fxml;
    exports com.example.calculatorjavafxv2;
}