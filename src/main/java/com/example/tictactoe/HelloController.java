package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;

/**
 * controller for main menu
 */
public class HelloController {

    @FXML
    private Button menuArticlesButton;

    @FXML
    private Button menuFlashCardsButton;

    @FXML
    private Button BackButton1;

    @FXML
    private Button menuFlashCardsButton2;

    int r = 0;

    @FXML
    void initialize() {
    }


    /**
     * @param ev
     */
    @FXML
    private void clickButton1(ActionEvent ev){
        menuArticlesButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ChooseGame.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        r = 10;
    }

    /**
     * Click for move to next scene
     */
    @FXML
    private void clickButton2(){
        menuFlashCardsButton.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GameField.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setResizable(true);
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * Click for move to next scene
     */
    @FXML
    private void ClickBackButton1(){
        BackButton1.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MainMenu.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * Click for move to next scene
     */
    @FXML
    private void ClickSingleButton(){
        menuFlashCardsButton2.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ChooseSinglRegim.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * Click for move to next scene
     */
    @FXML
    private void ClickExitButton(){
        System.exit(0);
    }
}
