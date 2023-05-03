package com.example.project_gui;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;

public class SceneSwitcher {


    private static SceneSwitcher instance = new SceneSwitcher();

    private Stage stage;
    private Scene scene;

    private SceneSwitcher() {}

    public static SceneSwitcher getInstance() {
        return instance;
    }

    public void setPrimaryStage(Stage stage) {
        this.stage = stage;
    }

    public void switchToInitialLibrarian(ActionEvent event) {
        try {
            Parent LibrarianRoot = FXMLLoader.load(getClass().getResource("InitialLibrarian.fxml"));
            Scene LibrarianScene = new Scene(LibrarianRoot);
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(LibrarianScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToInitialReader(ActionEvent event) {
        try {
            Parent readerRoot = FXMLLoader.load(getClass().getResource("InitialReader.fxml"));
            Scene readerScene = new Scene(readerRoot);
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(readerScene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void switchToLogin(ActionEvent event) {
        try {
            Parent loginRoot = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene loginScene = new Scene(loginRoot);
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(loginScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}