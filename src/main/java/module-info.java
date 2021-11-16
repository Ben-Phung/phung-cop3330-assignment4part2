module com.example.phungcop3330assignment4part2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.phungcop3330assignment4part2 to javafx.fxml;
    exports com.example.phungcop3330assignment4part2;
}