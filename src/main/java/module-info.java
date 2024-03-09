module com.zustik.todolistapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zustik.todolistapp to javafx.fxml;
    exports com.zustik.todolistapp;
}