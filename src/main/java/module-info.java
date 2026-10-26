module com.carl.lab09_carl {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.carl.lab09_carl to javafx.fxml;
    exports com.carl.lab09_carl;
}
