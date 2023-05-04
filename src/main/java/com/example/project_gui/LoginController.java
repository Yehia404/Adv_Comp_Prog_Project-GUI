package com.example.project_gui;

import classes.Library;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private StackPane rootPane;

    private String Email;

    private String Password;
    private ActionEvent e;
    private char t;

    public void switchToNextPage(ActionEvent event) throws IOException {

        Parent root;
        System.out.println(t);
        if (t=='l'){
            root = FXMLLoader.load(getClass().getResource("InitialLibrarian.fxml"));
            stage = (Stage)loginButton.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else if(t=='r') {
           root= FXMLLoader.load(getClass().getResource("InitialReader.fxml"));
            stage = (Stage)loginButton.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }




    @FXML
    private void handleLogin() throws IOException {

        Email = usernameField.getText();
        Password = passwordField.getText();

        t = Library.checkPassword(Email, Password);
        System.out.println(t);
        switchToNextPage(e);

    }
}