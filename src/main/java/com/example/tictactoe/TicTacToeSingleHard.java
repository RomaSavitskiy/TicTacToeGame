package com.example.tictactoe;


//исправление ошибок

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
import java.util.Random;

/**
 * Game process of easy game
 */
public class TicTacToeSingleHard {

    @FXML
    private Button button30;

    @FXML
    private Button button31;

    @FXML
    private Button button32;

    @FXML
    private Button button33;

    @FXML
    private Button button34;

    @FXML
    private Button button35;

    @FXML
    private Button button36;

    @FXML
    private Button button37;

    @FXML
    private Button button38;

    @FXML
    private Text winnerText2;

    @FXML
    private Button BackButtonHard ;


    private static final char DOT_EMPTY = 0; // Символ пустых ячеек
    private static final char DOT_X = 'X'; // Символ
    private static final char DOT_O = 'O'; // Символ
    private static char[][] map = new char[5][5]; // Матрица карты
    private static final int SIZE = 3; // Размер поля
    private static Random random = new Random();

    ArrayList<Button> buttons3;

    /**
     * initialization
     */
    public void initialize() {
        buttons3 = new ArrayList<>(Arrays.asList(button30, button31, button32,button33,button34,button35,button36,button37,button38));

    }

    /**
     * Metods human turn
     */

    @FXML
    public void ClickButton30(){
        button30.setText("X");
        button30.setDisable(true);
        map[0][0] = 'X';
        Start();

    }

    @FXML
    public void ClickButton31(){
        button31.setText("X");
        button31.setDisable(true);
        map[0][1] = 'X';
        Start();
    }

    @FXML
    public void ClickButton32(){
        button32.setText("X");
        button32.setDisable(true);
        map[0][2] = 'X';
        Start();
    }
    @FXML
    public void ClickButton33(){
        button33.setText("X");
        button33.setDisable(true);
        map[1][0] = 'X';
        Start();
    }

    @FXML
    public void ClickButton34(){
        button34.setText("X");
        button34.setDisable(true);
        map[1][1] = 'X';
        Start();
    }

    @FXML
    public void ClickButton35(){
        button35.setText("X");
        button35.setDisable(true);
        map[1][2] = 'X';
        Start();
    }

    @FXML
    public void ClickButton36(){
        button36.setText("X");
        button36.setDisable(true);
        map[2][0] = 'X';
        Start();
    }

    @FXML
    public void ClickButton37(){
        button37.setText("X");
        button37.setDisable(true);
        map[2][1] = 'X';
        Start();
    }

    @FXML
    public void ClickButton38(){
        button38.setText("X");
        button38.setDisable(true);
        map[2][2] = 'X';
        Start();
    }

    public void Start() {
// Ход человека
        if (isEndGame(DOT_X)) {
//winerText3.setText("X won!");
            buttons3.forEach(button ->{
                button.setDisable(true);
            });
//winner3 = 1;
            return;
        }
        computerTurn(); // Ход компьютера
        gg();
        if (isEndGame(DOT_O)) {
            buttons3.forEach(button ->{
                button.setDisable(true);
            });
            return;
        }
    }



    /**
     * Metods of computer turn
     */
    @FXML
    public void computerTurn() {
// System.out.println("Компьютер сделал ход, теперь Ваш ход.");
// Находим выйгрышный ход компьютера
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = DOT_O;
                    if (checkWin(DOT_O, map))
                        return;
                    if (!checkWin(DOT_O, map)) {
                        map[i][j] = DOT_EMPTY;

                    }
                }
            }
        }
//Блокируем выигрышный ход человека
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X, map)) {
                        map[i][j] = DOT_O;

                        return;
                    }
                    if (!checkWin(DOT_X, map)) {
                        map[i][j] = DOT_EMPTY;
                    }
                }
            }
        }
//Если центральная клетка свободна мы её занимаем
        System.out.println(map[1][1]);
        if (map[1][1] == DOT_EMPTY) {
            map[1][1] = DOT_O;
            return;
        }


//Занимает правую нижнюю клетку
        if (map[1][2] == DOT_X && map[2][1] == DOT_X && map[2][2] == DOT_EMPTY || map[1][2] == DOT_X && map[2][0] == DOT_X) {
            map[2][2] = DOT_O;
            System.out.println("Правая нижняя клетка");
            return;
        }
//Занимаем левую нижнюю клетку
        if (map[1][0] == DOT_X && map[2][1] == DOT_X && map[2][0] == DOT_EMPTY || map[1][0] == DOT_X && map[2][2] == DOT_X && map[2][0] == DOT_EMPTY) {
            map[2][0] = DOT_O;
            System.out.println("Левая нижняя клетка");
            return;
        }
// Ход по диагоналям, если занята центральная клетка
        if (map[1][1] == DOT_X) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) {
                        map[i][j] = DOT_X;
                        if (checkDiagonalComputerTurn(DOT_X)) {
                            System.out.println("Диагонали X " + checkDiagonalComputerTurn(DOT_X));
                            map[i][j] = DOT_O;
                            return;
                        }
                        if (!checkDiagonalComputerTurn(DOT_X)) {
                            map[i][j] = DOT_EMPTY;
                        }
                    }
                }
            }
        }
// Проверка на 2 шага вперёд по СТОЛБЦАМ, чтобы в столбце были: 1 клетка со знаком компьютера и 2 свободные
        if (map[0][2] == DOT_X || map[2][0] == DOT_X || map[0][0] == DOT_X || map[2][2] == DOT_X) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) {
                        map[i][j] = DOT_O;
                        if (checkVerticalComputerTurn(DOT_O)) {
                            System.out.println("Столбцы O " + checkVerticalComputerTurn(DOT_O));
                            return;
                        }
                        if (!checkVerticalComputerTurn(DOT_O)) {
                            map[i][j] = DOT_EMPTY;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = DOT_O;
                    if (checkDiagonalComputerTurn(DOT_O)) {
                        System.out.println("Диагонали O " + checkDiagonalComputerTurn(DOT_O));
                        map[i][j] = DOT_O;
                        return;
                    }
                    if (!checkDiagonalComputerTurn(DOT_O)) {
                        map[i][j] = DOT_EMPTY;
                    }
                }
            }
        }

        if (map[1][1] == DOT_O && map[0][0] != DOT_X && map[0][2] != DOT_X && map[2][0] != DOT_X && map[2][2] != DOT_X) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) {
                        map[i][j] = DOT_O;
                        if (checkDiagonalComputerTurn(DOT_O)) {
                            System.out.println("Диагонали O " + checkDiagonalComputerTurn(DOT_O));
                            return;
                        }
                        if (!checkDiagonalComputerTurn(DOT_O)) {
                            map[i][j] = DOT_EMPTY;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = DOT_O;
                    if (checkLineComputerTurn(DOT_O)) {
                        System.out.println("Строки O " + checkLineComputerTurn(DOT_O));
                        return;
                    }
                    if (!checkLineComputerTurn(DOT_O)) {
                        map[i][j] = DOT_EMPTY;
                    }
                }
            }
        }
// рандомный ход
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (isCellValid(x, y, DOT_O));
        map[x][y] = DOT_O;

    }

    /**
     * Проверка на валидность хода
     * @return признак валидности хода
     */
    private static boolean isCellValid(int x, int y, char playerSymbol) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            if (playerSymbol != DOT_O) System.out.println("Вы ввели некорректные координаты клетки!");
            return false;
        }
        if (map[y][x] == DOT_EMPTY) return true;
        if (playerSymbol != DOT_O) System.out.println("Вы ввели координаты занятой клетки!");
        return false;
    }

    /**
     * Метод проверки игры на завершение
     *
     * @param playerSymbol сомвол, которым играет текущий игрок
     * @return boolean - признак завершения игры
     */
    public boolean isEndGame(char playerSymbol) {
        boolean result = false;
        if (checkWin(playerSymbol, map)) {
            winnerText2.setText(playerSymbol + " " + "WIN");
            result = true;
        }
        if (isMapFull() && !checkWin(playerSymbol, map)) {
            winnerText2.setText("DRAW");
            result = true;
        }

        return result;
    }

    /**
     * Проверка на 100%-ю заполненность поля
     *
     * @return boolean признак наличия свободных ячеек
     */
    public static boolean isMapFull() {
        boolean result = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == 0)
                    result = false;
            }
        }
        return result;
    }

    /**
     * Проверка выйгрышных
     комбинаций компьтера, или человека
     *
     * @param playerSymbol символ игрока, или компьютера для проверки
     * @return true or false
     */
    private static boolean checkWin(char playerSymbol, char[][] map) {
        if (map[0][0] == map[0][1] && map[0][0] == map[0][2] && map[0][0] == playerSymbol){
            return true;
        }
        if (map[0][0] == map[1][0] && map[0][0] == map[2][0] && map[0][0] == playerSymbol){
            return true;
        }
        if (map[0][0] == map[1][1] && map[0][0] == map[2][2] && map[0][0] == playerSymbol){
            return true;
        }
        if (map[0][1] == map[1][1] && map[0][1] == map[2][1] && map[0][1] == playerSymbol){
            return true;
        }

        if (map[0][2] == map[1][2] && map[0][2] == map[2][2] && map[0][2] == playerSymbol){
            return true;
        }
        if (map[0][2] == map[1][1] && map[0][2] == map[2][0] && map[0][2] == playerSymbol){
            return true;
        }
        if (map[1][0] == map[1][1] && map[1][0] == map[1][2] && map[1][0] == playerSymbol){
            return true;
        }
        if (map[2][0] == map[2][1] && map[2][0] == map[2][2] && map[2][0] == playerSymbol){
            return true;
        }
        return false;
    }

    /**
     * Делаем проверку ближайших символов по вертикали для хода компьтера
     *
     * @param playerSymbol Символ игрока.
     * @return результат проверки.
     */
    private static boolean checkVerticalComputerTurn(char playerSymbol) {
        int emptyCellVertical, singCellVertical;
        for (int x = 0; x < SIZE; x++) {
            emptyCellVertical = 0;
            singCellVertical = 0;
            for (int y = 0; y < SIZE; y++) {
                if (map[y][x] == playerSymbol)
                    singCellVertical++;
                else if (map[y][x] == DOT_EMPTY)
                    emptyCellVertical++;
                if ((singCellVertical == SIZE - 1) && (emptyCellVertical == SIZE - 2))
                    return true;

            }
        }
        return false;
    }

    /**
     * Делаем проверку ближайших символов по диагонали для хода компьтера
     *
     * @param playerSymbol Символ игрока.
     * @return результат проверки.
     */
    private static boolean checkDiagonalComputerTurn(char playerSymbol) {
        int emptyCellDiagonalA = 0, singCellDiagonalA = 0, emptyCellDiagonalB = 0, singCellDiagonalB = 0;
        for (int x = 0; x < SIZE; x++) {
            if (map[x][x] == playerSymbol)
                singCellDiagonalA++;
            else if (map[x][x] == DOT_EMPTY)
                emptyCellDiagonalA++;
            if ((singCellDiagonalA == SIZE - 1) && (emptyCellDiagonalA == SIZE - 2))
                return true;
            if (map[x][SIZE - 1 - x] == playerSymbol)
                singCellDiagonalB++;
            else if (map[x][SIZE - 1 - x] == DOT_EMPTY)
                emptyCellDiagonalB++;
            if ((singCellDiagonalB == SIZE - 1) && (emptyCellDiagonalB == SIZE - 2))
                return true;
        }
        return false;
    }

    private static boolean checkLineComputerTurn(char playerSymbol) {
        int emptyCellLine, singCellLine;
        for (int x = 0; x < SIZE; x++) {
            emptyCellLine = 0;
            singCellLine = 0;
            for (int y = 0; y < SIZE; y++) {
                if (map[x][y] == playerSymbol)
                    singCellLine++;
                else if (map[x][y] == DOT_EMPTY)
                    emptyCellLine++;
                if ((singCellLine == SIZE - 1) && (emptyCellLine == SIZE - 2))
                    return true;
            }
        }
        return false;

    }

    private void gg(){
        if (map[0][0] == 'O'){
            button30.setText("O");
            button30.setDisable(true);
        }
        if (map[0][1] == 'O'){
            button31.setText("O");
            button31.setDisable(true);
        }
        if (map[0][2] == 'O'){
            button32.setText("O");
            button32.setDisable(true);
        }
        if (map[1][0] == 'O'){
            button33.setText("O");
            button33.setDisable(true);
        }
        if (map[1][1] == 'O'){
            button34.setText("O");
            button34.setDisable(true);
        }
        if (map[1][2] == 'O'){
            button35.setText("O");
            button35.setDisable(true);
        }
        if (map[2][0] == 'O'){
            button36.setText("O");
            button36.setDisable(true);
        }
        if (map[2][1] == 'O'){
            button37.setText("O");
            button37.setDisable(true);
        }
        if (map[2][2] == 'O'){
            button38.setText("O");
            button38.setDisable(true);
        }

    }

    /**
     * Click back button
     */
    @FXML
    private void ClickBackButtonHard(){
        BackButtonHard.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ChooseSinglRegim.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Parent root =
                loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }


    /**
     * Click reset button
     */
    public void ClickResetButtonHard(){
        for(int i = 0; i < SIZE; i++ ){
            for(int j = 0; j <SIZE; j++){
                map[i][j] = 0;
            }
            button30.setText(" ");
            button31.setText(" ");
            button32.setText(" ");
            button33.setText(" ");
            button34.setText(" ");
            button35.setText(" ");
            button36.setText(" ");
            button37.setText(" ");
            button38.setText(" ");
            button30.setDisable(false);
            button31.setDisable(false);
            button32.setDisable(false);
            button33.setDisable(false);
            button34.setDisable(false);
            button35.setDisable(false);
            button36.setDisable(false);
            button37.setDisable(false);
            button38.setDisable(false);
            winnerText2.setText("Tic-Tac-Toe");

        }
    }
}
