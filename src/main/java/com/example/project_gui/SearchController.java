package com.example.project_gui;
import classes.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchController {
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;
    @FXML private TextField idTextField;
    @FXML private Button searchBtn;private int id;
    @FXML private Button removeBtn;
    public void Search(ActionEvent event) throws IOException {
        id = Integer.parseInt(idTextField.getText());
        int i= Librarian.searchMember(id);
        FXMLLoader loader= new FXMLLoader (getClass().getResource("SearchUser2.fxml"));
        root=loader.load();SearchController2 searchController2 = loader.getController();
        searchController2.displayData(Library.persons.get(i).getFIRSTNAME(),Library.persons.get(i).getLASTNAME(),Library.persons.get(i).getEmail());
        stage = (Stage)searchBtn.getScene().getWindow();
        scene=new Scene(root);stage.setScene(scene);}
    public void switchToInitialLibrarian(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("InitialLibrarian.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void removeUser(ActionEvent e) throws IOException{
        id = Integer.parseInt(idTextField.getText());
        Library.persons.remove(id);
    }
}
