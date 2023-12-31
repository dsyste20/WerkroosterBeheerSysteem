module com.anakarina.demowerkroosterbeheersysteem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.anakarina.demowerkroosterbeheersysteem to javafx.fxml;
    exports com.anakarina.demowerkroosterbeheersysteem;
}