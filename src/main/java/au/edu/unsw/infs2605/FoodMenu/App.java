package au.edu.unsw.infs2605.FoodMenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Food Menu App");
        Scene scene = new Scene(loadFXML("Dish"), 640, 480);
        stage.setScene(scene);
        stage.show();
        
        Dish testDish = new Dish("Hamburger", "bread", 15.0, "pick-up");
        System.out.println(testDish);
        System.out.println("Added");
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}