/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 5
*/

public class BasicGame implements IMove {
	private int x, y;
	private Board myBoard;

	public BasicGame() {
		myBoard = new Board4x4();
		x = y = 2;
		myBoard.theBoard[x][y] = 'P';
	}

	public BasicGame(String size) {
		switch(size) {
			case "Small":
				myBoard = new Board4x4();
				x = y = 2;
				break;
			case "Big":
				myBoard = new Board8x8();
				x = y = 4;
				break;
			default:
				System.out.println("Invalid size");
				break;
		}

		myBoard.theBoard[x][y] = 'P';
	}

	@Override
	public boolean moveUp() {
		if ((x - 1) >= 0) {
			myBoard.theBoard[x][y] = ' ';
			myBoard.theBoard[--x][y] = 'P';
			return true;
		} else {
			System.out.println("You can't go there!");
			return false;
		}
	}

	@Override
	public boolean moveDown() {
		if ((x + 1) < myBoard.getHeight()) {
			myBoard.theBoard[x][y] = ' ';
			myBoard.theBoard[++x][y] = 'P';
			return true;
		} else {
			System.out.println("You can't go there!");
			return false;
		}
	}

	@Override
	public boolean moveLeft() {
		if ((y - 1) >= 0) {
			myBoard.theBoard[x][y] = ' ';
			myBoard.theBoard[x][--y] = 'P';
			return true;
		} else {
			System.out.println("You can't go there!");
			return false;
		}
	}

	@Override
	public boolean moveRight() {
		if ((y + 1) < myBoard.getWidth()) {
			myBoard.theBoard[x][y] = ' ';
			myBoard.theBoard[x][++y] = 'P';
			return true;
		} else {
			System.out.println("You can't go there!");
			return false;
		}
	}

	@Override
	public String toString() {
		return myBoard.toString();
	}
}
