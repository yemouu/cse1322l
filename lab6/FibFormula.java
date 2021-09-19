/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        6
*/

// 2021-09-19

class FibFormula implements FindFib {
	@Override
	public int calculate_fib(int n) {
		return (int) ((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n))
		              / Math.sqrt(5));
	}
}
