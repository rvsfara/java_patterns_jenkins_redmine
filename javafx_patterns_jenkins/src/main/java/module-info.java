module com.rvsfara.javafx_patterns_jenkins {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.rvsfara.javafx_patterns_jenkins to javafx.fxml;
    exports com.rvsfara.javafx_patterns_jenkins;
}
