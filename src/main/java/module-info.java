module com.example.empresaseguridad {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.empresaseguridad to javafx.fxml;
    exports com.example.empresaseguridad;
}