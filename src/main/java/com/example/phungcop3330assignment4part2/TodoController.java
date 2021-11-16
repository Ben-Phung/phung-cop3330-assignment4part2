/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Ben Phung
 */

package com.example.phungcop3330assignment4part2;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import java.time.LocalDate;

public class TodoController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addTodo;

    @FXML
    private ListView<String> completedView;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Button delete;

    @FXML
    private TextField descField;

    @FXML
    private Button markComplete;

    @FXML
    private TextField titleField;

    @FXML
    private ListView<String> todoView;


    String title;
    String desc;
    String date;
    String all;

    @FXML
    void addItem(MouseEvent event) {
        title = titleField.getText();
        desc = descField.getText();
        LocalDate tDate = datePicker.getValue();
        date = tDate.toString();
        all = String.join(" ", title, desc, date);
        todoView.getItems().add(all);
    }

    @FXML
    void deleteItem(MouseEvent event) {
        String selected = todoView.getSelectionModel().getSelectedItem();
        String cSelected = completedView.getSelectionModel().getSelectedItem();
        todoView.getItems().remove(selected);
        completedView.getItems().remove(cSelected);
    }

    @FXML
    void markComplete(MouseEvent event){
        String selected = todoView.getSelectionModel().getSelectedItem();
        completedView.getItems().add(selected);
        todoView.getItems().remove(selected);
    }

    @FXML
    void updateItem(MouseEvent event){
        String selected = todoView.getSelectionModel().getSelectedItem();
        title = titleField.getText();
        desc = descField.getText();
        LocalDate tDate = datePicker.getValue();
        date = tDate.toString();
        all = String.join(" ", title, desc, date);
        todoView.getItems().add(all);
        todoView.getItems().remove(selected);
    }

    @FXML
    void initialize() {
        assert addTodo != null : "fx:id=\"addTodo\" was not injected: check your FXML file 'TodoList.fxml'.";
        assert completedView != null : "fx:id=\"completedView\" was not injected: check your FXML file 'TodoList.fxml'.";
        assert datePicker != null : "fx:id=\"datePicker\" was not injected: check your FXML file 'TodoList.fxml'.";
        assert delete != null : "fx:id=\"delete\" was not injected: check your FXML file 'TodoList.fxml'.";
        assert descField != null : "fx:id=\"descField\" was not injected: check your FXML file 'TodoList.fxml'.";
        assert markComplete != null : "fx:id=\"markComplete\" was not injected: check your FXML file 'TodoList.fxml'.";
        assert titleField != null : "fx:id=\"titleField\" was not injected: check your FXML file 'TodoList.fxml'.";
        assert todoView != null : "fx:id=\"todoView\" was not injected: check your FXML file 'TodoList.fxml'.";

    }
}