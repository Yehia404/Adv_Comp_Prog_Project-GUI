package com.example.project_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class InitialReaderController {

    private Stage stage;

    private Scene scene;
    private Parent root;

    public void switchToSearchBookFromReader(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SearchBookFromReader.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
