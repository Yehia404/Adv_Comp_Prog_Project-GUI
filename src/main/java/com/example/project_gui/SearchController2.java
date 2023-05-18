package com.example.project_gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchController2 {
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;
    @FXML Label firstLabel;
    @FXML Label lastLabel;
    @FXML Label emailLabel;
    public void displayData(String firstName, String lastName, String Email){
    firstLabel.setText("First Name: "+ firstName);lastLabel.setText("Last Name: "+ lastName);emailLabel.setText("Email: "+ Email);}
    public void switchToSearchUser(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SearchUser.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);stage.setScene(scene);stage.show();}
    public void switchToInitialLibrarian(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("InitialLibrarian.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);stage.setScene(scene);stage.show();}}
