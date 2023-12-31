package com.anakarina.demowerkroosterbeheersysteem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 1024, 600);
        scene.getStylesheets().add(HelloApplication.class.getResource("stylesheets/homescreen.css").toString());


        FlowPane sidebar = new FlowPane();
        sidebar.setId("sidebar");
        sidebar.prefHeightProperty().bind(scene.heightProperty());
        sidebar.maxHeightProperty().bind(scene.heightProperty());
        sidebar.setOrientation(Orientation.VERTICAL);


        stage.setTitle("Werkrooster Beheer System");
        stage.setScene(scene);
        stage.show();

        root.getChildren().addAll(sidebar);
    }

    public static void main(String[] args) {
        launch();
    }
}