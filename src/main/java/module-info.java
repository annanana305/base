module au.edu.unsw.infs2605.FoodMenu {
    requires javafx.baseEmpty;
    requires javafx.base;
    requires javafx.fxmlEmpty;
    requires javafx.fxml;
    requires javafx.controlsEmpty;
    requires javafx.controls;
    requires javafx.graphicsEmpty;
    requires javafx.graphics;

    opens au.edu.unsw.infs2605.FoodMenu to javafx.fxml;
    exports au.edu.unsw.infs2605.FoodMenu;
}