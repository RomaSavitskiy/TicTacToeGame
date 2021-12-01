package com.example.tictactoe;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Game process of easy game
 */
public class TicTacToeSingleMedium{

    @FXML
    private Button BackButtonMedium;

    @FXML
    private Button button40;

    @FXML
    private Button button41;

    @FXML
    private Button button42;

    @FXML
    private Button button43;

    @FXML
    private Button button44;

    @FXML
    private Button button45;

    @FXML
    private Button button46;

    @FXML
    private Button button47;

    @FXML
    private Button button48;

    @FXML
    private Text WinnerTextMedium;

    int x;

    ArrayList<Button> buttons4;

    int playerTurn = 0;

    int winner4 = 0;

    int[] ListButtons = new int[] {0,0,0,0,0,0,0,0,0};

    /**
     * initialization
     */
    public void initialize() {
        buttons4 = new ArrayList<>(Arrays.asList(button40, button41, button42,button43,button44,button45,button46,button47,button48));

    }

    /**
     * Human turn metods
     */
    @FXML
    public void ClickButton40(){
        button40.setText("X");
        playerTurn++;
        button40.setDisable(true);
        ListButtons[0] = 1;
        if(playerTurn == 5){
            checkIfGameIsOver();
        }
        if(playerTurn < 5) {
            SetComputerSymbol();
        }
    }

    @FXML
    public void ClickButton41(){
        button41.setText("X");
        playerTurn++;
        button41.setDisable(true);
        ListButtons[1] = 1;
        if(playerTurn == 5){
            checkIfGameIsOver();
        }
        if(playerTurn < 5) {
            SetComputerSymbol();
        }
    }

    @FXML
    public void ClickButton42(){
        button42.setText("X");
        playerTurn++;
        button42.setDisable(true);
        ListButtons[2] = 1;
        if(playerTurn == 5){
            checkIfGameIsOver();
        }
        if(playerTurn < 5) {
            SetComputerSymbol();
        }
    }

    @FXML
    public void ClickButton43(){
        button43.setText("X");
        playerTurn++;
        button43.setDisable(true);
        ListButtons[3] = 1;
        if(playerTurn == 5){
            checkIfGameIsOver();
        }
        if(playerTurn < 5) {
            SetComputerSymbol();
        }
    }


    @FXML
    public void ClickButton44(){
        button44.setText("X");
        playerTurn++;
        button44.setDisable(true);
        ListButtons[4] = 1;
        if(playerTurn == 5){
            checkIfGameIsOver();
        }
        if(playerTurn < 5) {
            SetComputerSymbol();
        }
    }

    @FXML
    public void ClickButton45(){
        button45.setText("X");
        playerTurn++;
        button45.setDisable(true);
        ListButtons[5] = 1;
        if(playerTurn == 5){
            checkIfGameIsOver();
        }
        if(playerTurn < 5) {
            SetComputerSymbol();
        }
    }


    @FXML
    public void ClickButton46(){
        button46.setText("X");
        playerTurn++;
        button46.setDisable(true);
        ListButtons[6] = 1;
        if(playerTurn == 5){
            checkIfGameIsOver();
        }
        if(playerTurn < 5) {
            SetComputerSymbol();
        }
    }

    @FXML
    public void ClickButton47(){
        button47.setText("X");
        playerTurn++;
        button47.setDisable(true);
        ListButtons[7] = 1;
        if(playerTurn == 5){
            checkIfGameIsOver();
        }
        if(playerTurn < 5) {
            SetComputerSymbol();
        }
    }


    @FXML
    public void ClickButton48(){
        button48.setText("X");
        playerTurn++;
        button48.setDisable(true);
        ListButtons[8] = 1;
        if(playerTurn == 5){
            checkIfGameIsOver();
        }
        if(playerTurn < 5) {
            SetComputerSymbol();
        }
    }

    /**
     * Cumputer set symbol in button
     */
    public void SetComputerSymbol(){
        if (ListButtons[4] == 0) {
            button44.setText("O");
            button44.setDisable(true);;
            ListButtons[4] = 1;
            return;
        }

//Проверка верхней строки
        if(ListButtons[0] == 'O' && ListButtons[2] == 'O'){
            ListButtons[1] = 1;
            button41.setText("O");
            button41.setDisable(true);
        }
        if(ListButtons[0] == 'O' && ListButtons[1] == 'O'){
            ListButtons[2] = 1;
            button42.setText("O");
            button42.setDisable(true);
        }

//Проверка средней строки
        if(ListButtons[3] == 'O' && ListButtons[4] == 'O'){
            ListButtons[5] = 1;
            button45.setText("O");
            button45.setDisable(true);
        }
        if(ListButtons[4] == 'O' && ListButtons[5] == 'O'){
            ListButtons[3] = 1;
            button43.setText("O");
            button43.setDisable(true);
        }

//Проверка нижней строки
        if(ListButtons[6] == 'O' && ListButtons[7] == 'O'){
            ListButtons[8] = 1;
            button48.setText("O");
            button48.setDisable(true);
        }
        if(ListButtons[7] == 'O' && ListButtons[8] == 'O'){
            ListButtons[6] = 1;
            button46.setText("O");
            button46.setDisable(true);
        }

//Проверка левого столбца
        if(ListButtons[0] == 'O' && ListButtons[3] == 'O'){
            ListButtons[6] = 1;
            button46.setText("O");
            button46.setDisable(true);
        }
        if(ListButtons[3] == 'O' && ListButtons[6] == 'O'){
            ListButtons[0] = 1;
            button40.setText("O");
            button40.setDisable(true);
        }
        if(ListButtons[0] == 'O' && ListButtons[6] == 'O'){
            ListButtons[3] = 1;
            button43.setText("O");
            button43.setDisable(true);
        }

//Проверка среднего столбца
        if(ListButtons[1] == 'O' && ListButtons[4] == 'O'){
            ListButtons[7] = 1;
            button47.setText("O");
            button47.setDisable(true);
        }
        if(ListButtons[1] == 'O' && ListButtons[7] == 'O'){
            ListButtons[4] = 1;
            button44.setText("O");
            button44.setDisable(true);
        }
        if(ListButtons[4] == 'O' && ListButtons[7] == 'O'){
            ListButtons[1] = 1;
            button41.setText("O");
            button41.setDisable(true);
        }



        while(ListButtons[x] == 1){
            x = (int) (Math.random() * 9);
        }
        if(x==0){
            button40.setText("O");
            button40.setDisable(true);
            ListButtons[0] = 1;
            checkIfGameIsOver();
        }
        if(x==1){
            button41.setText("O");
            button41.setDisable(true);
            ListButtons[1] = 1;
            checkIfGameIsOver();
        }
        if(x==2){
            button42.setText("O");
            button42.setDisable(true);
            ListButtons[2] = 1;
            checkIfGameIsOver();
        }
        if(x==3){
            button43.setText("O");
            button43.setDisable(true);
            ListButtons[3] = 1;
            checkIfGameIsOver();
        }
        if(x==4){
            button44.setText("O");
            button44.setDisable(true);
            ListButtons[4] = 1;
            checkIfGameIsOver();
        }
        if(x==5){
            button45.setText("O");
            button45.setDisable(true);
            ListButtons[5] = 1;
            checkIfGameIsOver();
        }
        if(x==6){
            button46.setText("O");
            button46.setDisable(true);
            ListButtons[6] = 1;
            checkIfGameIsOver();
        }
        if(x==7){
            button47.setText("O");
            button47.setDisable(true);
            ListButtons[7] = 1;
            checkIfGameIsOver();
        }
        if(x==8){
            button48.setText("O");
            button48.setDisable(true);
            ListButtons[8] = 1;
            checkIfGameIsOver();
        }
    }

    /**
     * Reset button
     */
    public void ResetButtonMedium(){
        buttons4.forEach(button ->{
            button.setDisable(false);
            button.setText("");
        });

        for(int i = 0; i < 9; i++){
            ListButtons[i] = 0;
        }
        playerTurn = 0;
        winner4 = 0;
        WinnerTextMedium.setText("Tic-Tac-Toe");
    }

    /**
     * Checking the completion of the game
     */
    public void checkIfGameIsOver(){
        for (int a = 0; a < 8; a++) {
            String line;
            switch (a) {
                case 0:
                    line = button40.getText() + button41.getText() + button42.getText();
                    break;
                case 1:
                    line = button43.getText() + button44.getText() + button45.getText();
                    break;
                case 2:
                    line = button46.getText() + button47.getText() + button48.getText();
                    break;
                case 3:
                    line = button40.getText() + button44.getText() + button48.getText();
                    break;
                case 4:
                    line = button42.getText() + button44.getText() + button46.getText();
                    break;
                case 5:
                    line = button40.getText() + button43.getText() + button46.getText();
                    break;
                case 6:
                    line = button41.getText() + button44.getText() + button47.getText();
                    break;
                case 7:
                    line = button42.getText() + button45.getText() + button48.getText();
                    break;
                default:
                    line = null;
                    break;
            }

//X winner
            if (line.equals("XXX")) {
                WinnerTextMedium.setText("X won!");
                buttons4.forEach(button ->{
                    button.setDisable(true);
                });
                winner4 = 1;
            }

//O winner
            if (line.equals("OOO")) {
                WinnerTextMedium.setText("O won!");
                buttons4.forEach(button ->{
                    button.setDisable(true);
                });
                winner4 = 1;
            }

            if(playerTurn == 5 && winner4 == 0){
                WinnerTextMedium.setText("DRAW!");
                buttons4.forEach(button ->{
                    button.setDisable(true);
                });
            }

        }
    }

    /**
     * back button
     */
    @FXML
    private void ClickBackBackButtonMedium(){
        BackButtonMedium.getScene().getWindow().hide();
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
}
