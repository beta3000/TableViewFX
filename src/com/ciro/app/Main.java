package com.ciro.app;

import com.ciro.app.controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        mainWindow();
    }

    public void mainWindow(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view/MainView.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();

            MainController mainController = fxmlLoader.getController();
            mainController.setMain(this,primaryStage);
            Scene scene = new Scene(anchorPane);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
