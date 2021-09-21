/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 5
*/

// 2021-09-20

public abstract class Board {
	private int rows, columns;
	public char[][] theBoard;

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;

		theBoard = new char[rows][columns];
	}

	public char getCell(int x, int y) {
		return theBoard[x][y];
	}

	public int getWidth() {
		return columns;
	}

	public int getHeight() {
		return rows;
	}

	public void initializeBoard(char symbol) {
		for (int row = 0; row < rows; row++)
			for (int column = 0; column < columns; column++)
				theBoard[row][column] = symbol;
	}

	@Override
	public String toString() {
		String board = "";
		for (int i = 0; i < (2 * rows + 1); i++)
			board += "-";
		board += "\n";

		for (int row = 0; row < rows; row++) {
			board += "|";

			for (int column = 0; column < columns; column++)
				board += theBoard[row][column] + "|";
			board += "\n";

			for (int i = 0; i < (2 * rows + 1); i++)
				board += "-";
			board += "\n";
		}

		return board;
	}
}
