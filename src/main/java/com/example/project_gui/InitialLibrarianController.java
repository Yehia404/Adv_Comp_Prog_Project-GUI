package com.example.project_gui;

import classes.Library;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class InitialLibrarianController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button logOutBtn;

    public void switchToAddBook(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddBook.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAddUser(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddUser.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToRemoveFromQueue(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RemoveFromQueue.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSearchUser(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SearchUser.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSearchBook(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SearchBookLib.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToLogin(ActionEvent event) throws  IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage =(Stage) logOutBtn.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        Library.loggedIn = null;

    }

}
