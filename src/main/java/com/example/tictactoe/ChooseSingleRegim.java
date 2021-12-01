package com.example.tictactoe;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**\
 * Choose level game of single type
 */
public class ChooseSingleRegim {


    @FXML
    private Button BackButton3;

    @FXML
    private Button ChooseSingleRegimButton1;

    @FXML
    private Button ChooseSingleRegimButtonHard;

    @FXML
    private Button ChooseSingleRegimMedium;

    @FXML
    void initialize() {
    }

    /**
     * Click button to new scene
     */
    @FXML
    private void ClickBackButton3(){
        BackButton3.getScene().getWindow().hide();
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
    }

    /**
     * Click button to new scene
     */
    @FXML
    private void ChooseSingleRegimClickEasy(){
        ChooseSingleRegimButton1.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GameField2.fxml"));
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
     * Click button to new scene
     */
    @FXML
    private void ChooseSingleRegimClickHard(){
        ChooseSingleRegimButtonHard.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GameFieldSingleHard.fxml"));
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


    @FXML
    private void ChooseSingleRegimClickMedium(){
        ChooseSingleRegimMedium.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GameFieldMedium.fxml"));
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
}
