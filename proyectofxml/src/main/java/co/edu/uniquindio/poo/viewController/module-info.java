module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    
    opens co.edu.uniquindio.poo to javafx.fxml;
    opens co.edu.uniquindio.poo.ViewController to javafx.fxml;
    exports co.edu.uniquindio.poo.app;
}