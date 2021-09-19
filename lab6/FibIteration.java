/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Lab#:        6
*/

// 2021-09-19

class FibIteration implements FindFib {
	@Override
	public int calculate_fib(int n) {
		int fib, current, previous, next;

		if ((n == 1) || (n == 2))
			return 1;

		next = 0;
		current = previous = 1;
		for (int i = 0; i < n-2; i++) {
			next = current + previous;
			previous = current;
			current = next;
		}

		return next;
	}
}
