
module vallegrande.edu.pe.guiaproductos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens vallegrande.edu.pe.guiaproductos to javafx.fxml;
    opens vallegrande.edu.pe.guiaproductos.controller to javafx.fxml;

    exports vallegrande.edu.pe.guiaproductos;
    exports vallegrande.edu.pe.guiaproductos.controller;
}