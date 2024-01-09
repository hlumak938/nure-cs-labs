module org.example.lab3_cp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab3_cp to javafx.fxml;
    exports org.example.lab3_cp;
}