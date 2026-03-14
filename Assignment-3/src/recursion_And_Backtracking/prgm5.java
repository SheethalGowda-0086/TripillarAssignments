package recursion_And_Backtracking;

public class prgm5 {
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        System.out.println("Solutions for 4-Queens:");
        solveNQueens(board, 0);
    }

    public static boolean isSafe(int[][] board, int row, int col, int n) {
        for(int i = 0; i < row; i++)
            if(board[i][col] == 1) return false;

        for(int i=row, j=col; i>=0 && j>=0; i--, j--)
            if(board[i][j]==1) return false;

        for(int i=row, j=col; i>=0 && j< n; i--, j++)
            if(board[i][j]==1) return false;

        return true;
    }

    public static void printBoard(int[][] board) {
        for(int[] row : board){
            for(int val : row) System.out.print(val + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static boolean solveNQueens(int[][] board, int row) {
        int n = board.length;
        if(row == n) {
            printBoard(board);
            return true;
        }

        boolean res = false;
        for(int col = 0; col < n; col++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 1;
                res = solveNQueens(board, row + 1) || res;
                board[row][col] = 0; // backtrack
            }
        }
        return res;
    }
}

