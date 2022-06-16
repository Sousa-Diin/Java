module com.example.primeirofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primeirofx to javafx.fxml;
    exports com.example.primeirofx;
}