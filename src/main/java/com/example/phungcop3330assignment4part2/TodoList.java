/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Ben Phung
 */

package com.example.phungcop3330assignment4part2;

import javafx.beans.property.SimpleStringProperty;

import java.io.Serializable;

public class TodoList implements Serializable {

    private SimpleStringProperty title;

    private SimpleStringProperty desc;

    private SimpleStringProperty date;


    public TodoList(String title, String desc, String date) {
        this.title = new SimpleStringProperty(title);
        this.date = new SimpleStringProperty(date);
        this.desc = new SimpleStringProperty(desc);
    }

    public String getTitle() {
        return title.get();
    }

    public void getTitle(String title) {
        this.title = new SimpleStringProperty(title);
    }

    public String getDescription() {
        return desc.get();
    }

    public void getDescription(String desc) {
        this.desc = new SimpleStringProperty(desc);
    }

    public String getDate() {
        return date.get();
    }

    public void getDate(String date) {
        this.date = new SimpleStringProperty(date);
    }
}


