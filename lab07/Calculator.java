/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        7
*/

// 2021-09-19

class Calculator implements CalcOp {
  @Override
  public float add(float a, float b) {
    return a + b;
  }

  @Override
  public float subtract(float a, float b) {
    return a - b;
  }

  @Override
  public float multiply(float a, float b) {
    return a * b;
  }

  @Override
  public float divide(float a, float b) {
    return a / b;
  }
}
