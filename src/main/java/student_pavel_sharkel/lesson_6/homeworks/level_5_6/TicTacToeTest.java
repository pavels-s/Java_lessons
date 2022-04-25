package main.java.student_pavel_sharkel.lesson_6.homeworks.level_5_6;

public class TicTacToeTest {

    public static void main(String[] args) {
    TicTacToeTest ticTacToeTest = new TicTacToeTest();
    ticTacToeTest.testHorizontalTrue();
    ticTacToeTest.testHorizontalFalse();
    ticTacToeTest.testVerticalTrue();
    ticTacToeTest.testVerticalFalse();
    ticTacToeTest.testDiagonalTrue();
    ticTacToeTest.testDiagonalFalse();
    ticTacToeTest.testWin();
    ticTacToeTest.testWin2();
    ticTacToeTest.testDraw();
    ticTacToeTest.testDraw2();
    ticTacToeTest.testCreate();


    }
        public void testHorizontalTrue() {
            TicTacToe ticTacToe = new TicTacToe();

            int[][] field = {{0, 1, 0},
                             {1, 0, 0},
                             {1, 1, 1}};

            if (ticTacToe.isWinPositionForHorizontals(field, 1)) {
                System.out.println("Horizontal true test is OK");
            } else {
                System.out.println("Horizontal true test is FAILED");
            }

        }

    public void testHorizontalFalse() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{0, 1, 0},
                         {1, 0, 0},
                         {1, 0, 1}};

        if (ticTacToe.isWinPositionForHorizontals(field, 1)) {
            System.out.println("Horizontal false test is FAILED");
        } else {
            System.out.println("Horizontal false test is OK");
        }

    }

    public void testVerticalTrue() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{1, 1, 0},
                         {1, 0, 0},
                         {1, 0, 1}};

        if (ticTacToe.isWinPositionForVerticals(field, 1)) {
            System.out.println("Vertical true test is OK");
        } else {
            System.out.println("Vertical true test is FAILED");
        }

    }

    public void testVerticalFalse() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{0, 1, 0},
                         {1, 0, 0},
                         {1, 0, 1}};

        if (ticTacToe.isWinPositionForVerticals(field, 1)) {
            System.out.println("Vertical false test is FAILED");
        } else {
            System.out.println("Vertical false test is OK");
        }

    }

    public void testDiagonalTrue() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{1, 0, 0},
                         {1, 1, 0},
                         {1, 0, 1}};

        if (ticTacToe.isWinPositionForDiagonals(field, 1)) {
            System.out.println("Diagonal true test is OK");
        } else {
            System.out.println("Diagonal true test is FAILED");
        }

    }

    public void testDiagonalFalse() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{0, 1, 0},
                         {1, 0, 0},
                         {1, 0, 1}};

        if (ticTacToe.isWinPositionForDiagonals(field, 1)) {
            System.out.println("Diagonal false test is FAILED");
        } else {
            System.out.println("Diagonal false test is OK");
        }

    }

    public void testWin() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{1, 1, 0},
                         {0, 1, 0},
                         {1, 0, 1}};

        if (ticTacToe.isWinPosition(field, 1)) {
            System.out.println("Win test is OK");
        } else {
            System.out.println("Win test is FAILED");
        }

    }

    public void testWin2() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{0, 1, 1},
                         {0, 0, 1},
                         {1, 0, 1}};

        if (ticTacToe.isWinPosition(field, 1)) {
            System.out.println("Win2 test is OK");
        } else {
            System.out.println("Win2 test is FAILED");
        }

    }

    public void testDraw() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{0, 1, 1},
                         {1, 0, 0},
                         {1, 0, 1}};

        if (ticTacToe.isDrawPosition(field)) {
            System.out.println("Draw test is OK");
        } else {
            System.out.println("Draw test is FAILED");
        }

    }

    public void testDraw2() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {{0, 1, 1},
                         {1, -1, 0},
                         {1, 0, 1}};

        if (ticTacToe.isDrawPosition(field)) {
            System.out.println("Draw2 test is OK");
        } else {
            System.out.println("Draw2 test is FAILED");
        }

    }

    public void testCreate() {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] field = ticTacToe.createField();

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    continue;
                } else {
                    System.out.println("Create test is FAILED");
                }
            }

        }
        System.out.println("Create test is OK");
    }


}
