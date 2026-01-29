package fr.groupe20.projet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    private final int WINDOW_WIDTH = 1280;
    private final int WINDOW_HEIGHT = 720;

    @Override
    public void start(Stage stage) {
        Pane root = new Pane();

        Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
        stage.setTitle("Projet");
        stage.setScene(scene);
        stage.show();
    }
}
