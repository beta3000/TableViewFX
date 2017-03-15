package com.ciro.app.controller;

import com.ciro.app.Main;
import com.ciro.app.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class MainController {

    private Main main;
    private Stage primaryStage;

    //Views
    @FXML
    private TableView<Person> tableView;
    @FXML
    private TableColumn<Person,String> firstNameColumn;
    @FXML
    private TableColumn<Person,String> lastNameColumn;
    @FXML
    private TableColumn<Person,String> ageColumn;

    private ObservableList<Person> persoList = FXCollections.observableArrayList();

    public void setMain(Main main, Stage primaryStage) {
        this.main = main;
        this.primaryStage = primaryStage;
        setTableData();
        tableView.setItems(persoList);
    }

    private void setTableData(){
        persoList.add(new Person("Charly","Brown","1"));
        persoList.add(new Person("Charly","Brown","2"));
        persoList.add(new Person("Charly","Brown","3"));
        persoList.add(new Person("Charly","Brown","4"));
        persoList.add(new Person("Charly","Brown","5"));
        persoList.add(new Person("Charly","Brown","6"));
        persoList.add(new Person("Charly","Brown","7"));
    }

    public void initialize(){
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("lastName"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("age"));
    }

    public void closeWindow(){
        primaryStage.close();
    }
}
