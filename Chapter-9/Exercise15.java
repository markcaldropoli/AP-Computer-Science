import java.awt.Color;

public class Exercise15
{
  public static void main(String [] args) {
    int row = 3, col = 4;
    Color[][] board = new Color[row][col];
    char[][] charboard = new char[row][col];
    fillCheckerboard(board);
    for(int r = 0; r < board.length; r++) {
      for(int c = 0; c < board[0].length; c++) {
        if(board[r][c] == Color.WHITE) {
          charboard[r][c] = '.';
        } else {
          charboard[r][c] = 'x';
        }
      }
    }
    int temp = 0;
    for(int i = 0; i < charboard.length; i++) {
      for(int j = 0; j < charboard[0].length; j++) {
        if(temp == 4 || temp == 8) {
          System.out.println();
        }
        System.out.print(charboard[i][j]);
        temp++;
      }
    }
  }
  
  public static void fillCheckerboard(Color[][] board) {
    int row = board.length;
    int col = board[0].length;
    for(int r = 0; r < row; r++) {
      for(int c = 0; c < col; c += 2) {
        if(r != 0 && board[r-1][c] == Color.WHITE) {
          board[r][c+1] = Color.WHITE;
        } else {
          board[r][c] = Color.WHITE;
        }
      }
    }
    
    row = board.length;
    col = board[0].length;
    for(int r = 0; r < row; r++) {
      for(int c = 0; c < col; c++) {
        if(board[r][c] != Color.WHITE) {
          board[r][c] = Color.BLACK;
        }
      }
    }
  }
}
