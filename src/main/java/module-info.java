module com.perscolars.sqll {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.perscolars.sqll to javafx.fxml;
    exports com.perscolars.sqll;
}