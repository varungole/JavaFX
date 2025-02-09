package org.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        stage.setScene(scene);
        Image icon = new Image("download.png");
        stage.setTitle("Stage Demo Program");
        stage.getIcons().add(icon);
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("YOU CANT ESCAPE UNTIL YOU PRESS q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}