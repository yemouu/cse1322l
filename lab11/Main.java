/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        11
*/

// 2021-10-30

import java.util.Scanner;

public class Main {
  public static int timeToSeconds(String time) throws InvalidTimeException {
    int hours, minutes, seconds;
    String[] timeArray = new String[3];

    timeArray = time.split(":", 3);

    try {
      hours = Integer.parseInt(timeArray[0]);
      minutes = Integer.parseInt(timeArray[1]);
      seconds = Integer.parseInt(timeArray[2]);
    } catch (ArrayIndexOutOfBoundsException e) {
      throw new InvalidTimeException("Time must be formatted in HH:MM:SS\n");
    } catch (NumberFormatException e) {
      throw new InvalidTimeException("Time must be formatted in HH:MM:SS\n");
    }

    if (hours > 24) throw new InvalidTimeException("Hours must be below 24");
    else if (hours < 0) throw new InvalidTimeException("Hours must be 0 or greater");
    else if (minutes >= 60) throw new InvalidTimeException("Minutes must be below 60");
    else if (minutes < 0) throw new InvalidTimeException("Minutes must be 0 or greater");
    else if (seconds >= 60) throw new InvalidTimeException("Seconds must be below 60");
    else if (seconds < 0) throw new InvalidTimeException("Seconds must be 0 or greater");

    return (hours * 3600) + (minutes * 60) + seconds;
  }

  public static void main(String[] args) {
    int firstTime, secondTime;
    Scanner input = new Scanner(System.in);

    try {
      System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
      firstTime = timeToSeconds(input.nextLine());

      System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
      secondTime = timeToSeconds(input.nextLine());

      System.out.println("Difference in seconds: " + (secondTime - firstTime));
    } catch (InvalidTimeException e) {
      System.out.println(e);
    }
  }
}
