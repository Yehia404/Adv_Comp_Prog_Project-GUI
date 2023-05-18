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

public class SearchBookController {
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML private Parent root;
    @FXML private TextField bookName;
    @FXML private Button searchBtn;
    @FXML private Button returnBtn;
    public void searchBook(ActionEvent event) throws IOException {
        int i= Person.searchBook(bookName.getText());
        FXMLLoader loader= new FXMLLoader (getClass().getResource("SearchBook2.fxml"));
        root=loader.load();
        SearchBookController2 searchBookController2 = loader.getController();
        searchBookController2.displayData(Library.books.get(i).getName(),Library.books.get(i).getAuthor(),Library.books.get(i).getIsBooked());
        stage = (Stage)searchBtn.getScene().getWindow();
        scene=new Scene(root);stage.setScene(scene);}
    public void switchToNextPage(ActionEvent event) throws IOException {
        Parent root;
        if (Library.loggedIn.getTYPE() == 'l') {
            root = FXMLLoader.load(getClass().getResource("InitialLibrarian.fxml"));
            stage = (Stage) returnBtn.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if (Library.loggedIn.getTYPE() == 'r') {
            root = FXMLLoader.load(getClass().getResource("InitialReader.fxml"));
            stage = (Stage) returnBtn.getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);stage.show();}}}
