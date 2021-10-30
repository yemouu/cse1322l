import java.util.Random;

class Maze {
  public final int dimension = 15;
  public int start_x = dimension / 2;
  public int start_y = dimension / 2;

  char[][] theMaze = new char[dimension][dimension];

  public Maze() {
    for (int i = 0; i < dimension; i++) {
      for (int j = 0; j < dimension; j++) {
        theMaze[i][j] = ' ';
      }
    }

    initializeMaze();
  }

  private void initializeMaze() {
    Random myRand = new Random();

    // Put in random walls
    for (int i = 0; i < dimension; i++) {
      for (int j = 0; j < dimension; j++) {
        if (myRand.nextInt(10) >= 7) {
          theMaze[i][j] = 'X';
        }
      }
    }

    // Pick a random goal
    int goal_x = myRand.nextInt(dimension - 1);
    int goal_y = myRand.nextInt(dimension - 1);
    theMaze[goal_x][goal_y] = 'C';

    // Place the starting position
    theMaze[start_x][start_y] = 'M';
  }

  @Override
  public String toString() {
    String final_return_string = "";

    for (int i = 0; i < dimension; i++) {
      for (int k = 0; k < dimension; k++) {
        final_return_string += "----";
      }
      final_return_string += "\n| ";
      for (int j = 0; j < dimension; j++) {
        final_return_string += theMaze[i][j] + " | ";
      }
      final_return_string += "\n";
    }
    for (int k = 0; k < dimension; k++) {
      final_return_string += "----";
    }
    final_return_string += "\n\n";
    return final_return_string;
  }
}
