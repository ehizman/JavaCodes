package chapter18;

public class EightQueens {
    private static final char[][] board = new char[8][8];
    private static int numberOfQueens = 8;
    public static  void puzzleSolver(){
        findCorrectPositionToPlaceQueen(0);
    }

    private static void findCorrectPositionToPlaceQueen(int currentColumn) {
        int appropriateRow = findAppropriateRowOnThisColumn(currentColumn);
        System.out.println("apprRow" + appropriateRow);

        if (appropriateRow == -1){
            return;
        }
        if (!checkDiagonals(appropriateRow, currentColumn)){
            board[appropriateRow][currentColumn] = 'Q';
            System.out.println("Inserted Queen");
            numberOfQueens--;
            markCheckSquares(appropriateRow, currentColumn);
        }
        currentColumn++;

        if (numberOfQueens > 0 && currentColumn < board[appropriateRow].length){
            findCorrectPositionToPlaceQueen(currentColumn);
        }
    }

    private static boolean checkDiagonals(int appropriateRow, int currentColumn) {
        return checkNorthEast(appropriateRow, currentColumn) || checkNorthWest(appropriateRow, currentColumn) || checkSouthEast(appropriateRow, currentColumn) || checkSouthWest(appropriateRow, currentColumn);
    }

    private static boolean checkSouthWest(int appropriateRow, int currentColumn) {
        boolean isChecked =  false;
        while(appropriateRow >= 0 && currentColumn < board[appropriateRow].length){
            if (board[appropriateRow][currentColumn] == 'Q'){
                isChecked = true;
                break;
            }
            appropriateRow--;
            currentColumn++;
        }
        return isChecked;
    }

    private static boolean checkSouthEast(int appropriateRow, int currentColumn) {
        boolean isChecked =  false;
        while(appropriateRow <  board.length && currentColumn < board[appropriateRow].length){
            if (board[appropriateRow][currentColumn] == 'Q'){
                isChecked = true;
                break;
            }
            appropriateRow++;
            currentColumn++;
        }
        return isChecked;
    }

    private static boolean checkNorthWest(int appropriateRow, int currentColumn) {
        boolean isChecked =  false;
        while(appropriateRow >= 0 && currentColumn >= 0){
            if (board[appropriateRow][currentColumn] == 'Q'){
                isChecked = true;
                break;
            }
            appropriateRow--;
            currentColumn--;
        }
        return isChecked;
    }

    private static boolean checkNorthEast(int appropriateRow, int currentColumn) {
        boolean isChecked = false;
        while(appropriateRow < board.length && currentColumn >= 0){
            if (board[appropriateRow][currentColumn] == 'Q'){
                isChecked = true;
                break;
            }
            appropriateRow++;
            currentColumn--;
        }
        return isChecked;
    }

    private static int findAppropriateRowOnThisColumn(int column) {
        for (int row = 0; row < board.length; row++) {
           if (board[row][column] != '*' && board[row][column] != 'Q'){
               return row;
           }
        }
        return -1;
    }

    private static void markCheckSquares(int row, int column) {
        for (int i = 0; i < board[row].length; i++) {
            if (i == column) {
                continue;
            }
            board[row][i] = '*';
        }

        for (int i = 0; i < board.length; i++) {
            if (i == row){
                continue;
            }
            board[i][column] = '*';
        }
        row++;
        column++;
        while(row < board.length && column < board[row].length){
            board[row][column] = '*';
            row++;
            column++;
        }
    }

    public static void main(String[] args) {
        puzzleSolver();
        for (char[] chars : board) {
            for (char aChar : chars) {
                System.out.print(aChar+"  ");
            }
            System.out.println();
        }
    }
}
