module com.example.ijpowerballlotterynumberpicker2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ijpowerballlotterynumberpicker2 to javafx.fxml;
    exports com.example.ijpowerballlotterynumberpicker2;
}