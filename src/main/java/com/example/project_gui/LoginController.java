package com.example.project_gui;

import classes.Library;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    private Stage stage;
    private Scene scene;

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

    public void initialize() {

        loginButton.setOnAction((ActionEvent e) -> {
            try {
                handleLogin();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });


    }

    @FXML
    private void handleLogin() throws IOException {

        Email = usernameField.getText();
        Password = passwordField.getText();

        char t = Library.checkPassword(Email, Password);
        if (t == 'L') {
            SceneSwitcher.getInstance().switchToInitialLibrarian(new ActionEvent());

        } else if (t == 'R'){
            SceneSwitcher.getInstance().switchToInitialReader(new ActionEvent());


        } else {
            SceneSwitcher.getInstance().switchToLogin(new ActionEvent());

        }
    }
}