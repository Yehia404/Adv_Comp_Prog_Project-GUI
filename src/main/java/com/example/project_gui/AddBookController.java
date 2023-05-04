package com.example.project_gui;


import classes.Book;
import classes.Librarian;
import classes.Library;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class AddBookController {

    private Stage stage;
    private Scene scene;

    private Parent root;

    @FXML
    private TextField bookNameField;

    @FXML
    private TextField authorNameField;
        public void switchToInitialLibrarian(ActionEvent event) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("InitialLibrarian.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void addBook(ActionEvent event) throws IOException {
        Librarian.addBook(new Book(bookNameField.getText(), authorNameField.getText()));
        bookNameField.clear();

        authorNameField.clear();

    }
}
