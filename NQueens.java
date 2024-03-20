import java.util.Scanner;

public class NQueens {

  static void printBoard(int[][] board) {
      int N = board.length; 
      for (int i = 0; i < N; i++) {
          for (int j = 0; j < N; j++) {
              System.out.print(board[i][j] + " ");
          }
          System.out.println();
      }
      System.out.println();
  }

  static boolean isSafe(int[][] board, int row, int col) {
      int N = board.length; 
      
      for (int i = 0; i < col; i++) {
          if (board[row][i] == 1) {
              return false;
          }
      }

      
      for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
          if (board[i][j] == 1) {
              return false;
          }
      }

      for (int i = row, j = col; i < N && j >= 0; i++, j--) {
          if (board[i][j] == 1) {
              return false;
          }
      }

      return true;
  }

  static boolean solveNQueens(int[][] board, int col) {
      int N = board.length; 
      if (col == N) {
          printBoard(board);
          return true;
      }

      boolean res = false;
      for (int i = 0; i < N; i++) {
          if (isSafe(board, i, col)) {
              board[i][col] = 1;
              res = solveNQueens(board, col + 1) || res;
              board[i][col] = 0;
          }
      }

      return res;
  }

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the size of the chessboard (N):");
      int N = scanner.nextInt();
      int[][] board = new int[N][N];

      if (!solveNQueens(board, 0)) {
          System.out.println("Solution does not exist.");
      }
      scanner.close();
  }
}