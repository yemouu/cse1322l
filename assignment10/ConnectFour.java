/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 10
*/

// 2021-10-30

public class ConnectFour {
  private char[][] board = new char[6][7];
  private String currentTurn;
  private char nextToken;

  public ConnectFour() {
    for (int row = 0; row < board.length; row++)
      for (int column = 0; column < board[row].length; column++) board[row][column] = ' ';

    currentTurn = "Red";
    nextToken = 'R';
  }

  public String getCurrentTurn() {
    return currentTurn;
  }

  public void nextTurn() {
    switch (currentTurn) {
      case "Red":
        currentTurn = "Yellow";
        nextToken = 'Y';
        break;
      case "Yellow":
        currentTurn = "Red";
        nextToken = 'R';
        break;
    }
  }

  public int nextAvailablePosition(int column) {
    for (int row = 5; row >= 0; row--) if (board[row][column] == ' ') return row;

    return -1;
  }

  public void dropPiece(int column) throws ColumnFull {
    int row = nextAvailablePosition(column);
    if (row == -1) throw new ColumnFull("Column " + column + " is full.");

    board[row][column] = nextToken;
  }

  @Override
  public String toString() {
    String to_return = "  0   1   2   3   4   5   6";
    for (int i = 0; i < 6; i++) {
      to_return += "\n-----------------------------\n";
      to_return += "| ";
      for (int j = 0; j < 7; j++) {
        to_return += board[i][j] + " | ";
      }
    }
    to_return += "\n-----------------------------\n";
    return to_return;
  }
}
