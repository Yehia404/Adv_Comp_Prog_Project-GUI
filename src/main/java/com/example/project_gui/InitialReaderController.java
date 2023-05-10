package com.example.project_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class InitialReaderController {

    private Stage stage;

    private Scene scene;
    private Parent root;

    @FXML
    Button searchBtn;
    public void switchToSearchBookFromReader(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SearchBook.fxml"));
        stage =(Stage)searchBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
