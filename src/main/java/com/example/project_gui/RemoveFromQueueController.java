package com.example.project_gui;

import classes.Librarian;
import classes.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RemoveFromQueueController {
    @FXML private Stage stage;
    @FXML private Scene scene;
    @FXML private Label toplabel;
    @FXML private TextField bookName;
    @FXML private TextField User;
    @FXML private Button removeBtn;
    @FXML private Button returnToMain;
    private int Userid;private int book;
    public void SearchUserBook() {
        Userid = Librarian.searchMember(Integer.parseInt(User.getText()));
        book = Person.searchBook(bookName.getText());
        if (Librarian.searchMember(Userid) == -1) {
            toplabel.setText("User not found");} else if (book == -1) {toplabel.setText("Book not found");}}
    public void Remove(ActionEvent event) throws IOException {
        SearchUserBook();
        if (Userid >= 0 && book >=0) {Librarian.removeUserFromQueue(Userid, bookName.getText());}}

    public void switchToInitialLibrarian(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("InitialLibrarian.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();}}










