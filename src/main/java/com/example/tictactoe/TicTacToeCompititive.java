package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

/**
 * Game process of compititive game
 */
public class TicTacToeCompititive implements Initializable {


    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Text winnerText;

    @FXML
    private Button BackButton2;


    private int playerTurn = 0;

    ArrayList<Button> buttons;

    int winner = 0;

    /**
     *
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        buttons = new ArrayList<>(Arrays.asList(button0, button1, button2,button3,button4,button5,button6,button7,button8));

        buttons.forEach(button ->{
            setupButton(button);
            button.setFocusTraversable(false);
        });

    }

    /**
     *
     * @param button
     */
    private void setupButton(Button button) {
        button.setOnMouseClicked(mouseEvent -> {
            setPlayerSymbol(button);
            button.setDisable(true);
            checkIfGameIsOver();
        });
    }

    /**
     *
     * @param button
     */
    public void setPlayerSymbol(Button button){
        if(playerTurn % 2 == 0){
            button.setText("X");
            playerTurn++;
        } else{
            button.setText("O");
            playerTurn++;
        }

    }

    /**
     *
     * @param event
     */
    @FXML
    void restartGame(ActionEvent event) {
        buttons.forEach(this::resetButton);
        winnerText.setText("Tic-Tac-Toe");
        playerTurn = 0;
        winner = 0;
    }

    /**
     *
     * @param button
     */
    public void resetButton(Button button){
        button.setDisable(false);
        button.setText("");
    }

    /**
     * Checking the completion of the game
     */
    public void checkIfGameIsOver(){
        for (int a = 0; a < 8; a++) {
            String line;
            switch (a) {
                case 0:
                    line = button0.getText() + button1.getText() + button2.getText();
                    break;
                case 1:
                    line = button3.getText() + button4.getText() + button5.getText();
                    break;
                case 2:
                    line = button6.getText() + button7.getText() + button8.getText();
                    break;
                case 3:
                    line = button0.getText() + button4.getText() + button8.getText();
                    break;
                case 4:
                    line = button2.getText() + button4.getText() + button6.getText();
                    break;
                case 5:
                    line = button0.getText() + button3.getText() + button6.getText();
                    break;
                case 6:
                    line = button1.getText() + button4.getText() + button7.getText();
                    break;
                case 7:
                    line = button2.getText() + button5.getText() + button8.getText();
                    break;
                default:
                    line = null;
                    break;
            }

//X winner
            if (line.equals("XXX")) {
                winnerText.setText("X won!");
                buttons.forEach(button ->{
                    setupButton(button);
                    button.setDisable(true);
                });
                winner = 1;
            }

//O winner
            if (line.equals("OOO")) {
                winnerText.setText("O won!");
                buttons.forEach(button ->{
                    setupButton(button);
                    button.setDisable(true);
                });
                winner = 1;

            }

            if(playerTurn == 9 && winner == 0){
                winnerText.setText("TIE!");
            }

        }
    }

    /**
     *
     * @param ev
     */
    @FXML
    private void ClickBackButton2(ActionEvent ev){
        BackButton2.getScene().getWindow().hide();
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


}
