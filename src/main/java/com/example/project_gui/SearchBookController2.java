package com.example.project_gui;

import classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchBookController2 {
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;

    @FXML
    Label bookLabel;
    @FXML
    Label authorLabel;
    @FXML
    Label bookedLabel;


    public void displayData(String bookName, String Author, boolean Booked){
        bookLabel.setText("Book Name: "+ bookName);
        authorLabel.setText("Author : "+ Author);
        bookedLabel.setText("Booked: "+ Booked);
    }
    public void switchToSearchBook(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SearchBook.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void rentBook(ActionEvent event) throws IOException{
        if (bookedLabel.getText().equals("Booked: false")){
            bookedLabel.setText("Booked: True");


        }



    }
    public void switchToInitialLibrarian(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("InitialLibrarian.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
