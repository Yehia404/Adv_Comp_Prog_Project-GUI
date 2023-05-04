package com.example.project_gui;

import classes.Librarian;
import classes.Library;
import classes.Reader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddUserController {

    private Stage stage;
    private Scene scene;

    private Parent root;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField userTypeField;

    @FXML
    private TextField cellPhoneField;

    @FXML
    private TextField passwordField;


    public void switchToInitialLibrarian(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("InitialLibrarian.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void addUser(ActionEvent event) throws IOException {
        if (userTypeField.getText().toLowerCase().charAt(0) == 'l') {
            Librarian.addUser(new Librarian(passwordField.getText(), userTypeField.getText(), firstNameField.getText(), lastNameField.getText(),
                    addressField.getText(), Integer.parseInt(cellPhoneField.getText()), emailField.getText()));

        }else if (userTypeField.getText().toLowerCase().charAt(0) == 'r'){
            Librarian.addUser(new Reader(passwordField.getText(), userTypeField.getText(), firstNameField.getText(), lastNameField.getText(),
                    addressField.getText(), Integer.parseInt(cellPhoneField.getText()), emailField.getText()));

        }else {
            System.out.println("unidentified type of user");
        }
        passwordField.clear();
        userTypeField.clear();
        firstNameField.clear();
        lastNameField.clear();
        addressField.clear();
        cellPhoneField.clear();
        emailField.clear();
    }
}
