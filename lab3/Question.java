/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        3
*/

// 2021-08-25

public class Question {
  private String question;
  private String answer;
  private int difficulty;

  public Question(String question, String answer, int difficulty) {
    this.question = question;
    this.answer = answer;
    this.difficulty = difficulty;
  }

  public String get_question() {
    return question;
  }

  public String get_answer() {
    return answer;
  }

  public int get_difficulty() {
    return difficulty;
  }

  public void set_question(String question) {
    this.question = question;
  }

  public void set_answer(String answer) {
    this.answer = answer;
  }

  public void set_difficulty(int difficulty) {
    this.difficulty = difficulty;
  }
}
