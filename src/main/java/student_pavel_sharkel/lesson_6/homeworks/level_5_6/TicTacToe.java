package main.java.student_pavel_sharkel.lesson_6.homeworks.level_5_6;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

        public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
            for (int i = 0; i < field.length; i++) {
                if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
                    return true;
                }
            }
            return false;
        }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) && (field[2][i] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {

            if ((field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][2] == playerToCheck)) {
                return true;
            } else if ((field[0][2] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][0] == playerToCheck)) {
                return true;
            } else return false;

    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        TicTacToe ticTacToe = new TicTacToe();  // зачем тут создавать инстанцию класса?
        if (ticTacToe.isWinPositionForVerticals(field, playerToCheck)) {
            return true;
        } else if (ticTacToe.isWinPositionForHorizontals(field, playerToCheck)) {
            return true;
        } else if (ticTacToe.isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        } else return false;
    }

    public boolean isDrawPosition(int[][] field) {
            TicTacToe ticTacToe = new TicTacToe();   // зачем тут создавать инстанцию класса?


			// Эту вложенность if + for читать почти не возможно!
                if ((!ticTacToe.isWinPositionForVerticals(field, 1)) && (!ticTacToe.isWinPositionForVerticals(field, 0))) {
                        if ((!ticTacToe.isWinPositionForHorizontals(field, 1)) && (!ticTacToe.isWinPositionForHorizontals(field, 0))) {
                            if ((!ticTacToe.isWinPositionForDiagonals(field, 1)) && (!ticTacToe.isWinPositionForDiagonals(field, 0))) {
                                for (int i = 0; i < field.length; i++) {
                                    for (int j = 0; j < field[i].length; j++) {
                                        if (field[i][j] != -1) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                }
            return false;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                     field[i][j] = -1;
                }
            }
            return field;
    }

    public Move getNextMove() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number 0 to 2 :");
        int firstNumber = in.nextInt();
        System.out.println("Enter second number 0 to 2 :");
        int secondNumber = in.nextInt();
        Move move = new Move(firstNumber, secondNumber);

        return move;
    }

    public void printFieldToConsole(int[][] field) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + ", ");
                }
                System.out.println();
            }
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

}
