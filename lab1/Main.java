/*
Class:      CSE 1322L
Section:    J03
Term:       Fall 2021
Instructor: Kendrick, Kaleigh
Name:       Kofi Hannam
Lab#:       1
*/

public class Main {
	// Assignment input
	public static char[][] make_forward() {
		char[][] pixel = new char[4][13];
		pixel[0][0]=' ';
		pixel[0][1]=' ';
		pixel[0][2]='_';
		pixel[0][3]='_';
		pixel[0][4]='_';
		pixel[0][5]='_';
		pixel[0][6]='_';
		pixel[0][7]='_';
		pixel[0][8]=' ';
		pixel[0][9]=' ';
		pixel[0][10]=' ';
		pixel[0][11]=' ';
		pixel[0][12]=' ';
		pixel[1][0]=' ';
		pixel[1][1]='/';
		pixel[1][2]='|';
		pixel[1][3]='_';
		pixel[1][4]='|';
		pixel[1][5]='|';
		pixel[1][6]='_';
		pixel[1][7]='\\';
		pixel[1][8]='\'';
		pixel[1][9]='.';
		pixel[1][10]='_';
		pixel[1][11]='_';
		pixel[1][12]=' ';
		pixel[2][0]='(';
		pixel[2][1]=' ';
		pixel[2][2]=' ';
		pixel[2][3]=' ';
		pixel[2][4]='_';
		pixel[2][5]=' ';
		pixel[2][6]=' ';
		pixel[2][7]=' ';
		pixel[2][8]=' ';
		pixel[2][9]='_';
		pixel[2][10]=' ';
		pixel[2][11]='_';
		pixel[2][12]='\\';
		pixel[3][0]='=';
		pixel[3][1]='\'';
		pixel[3][2]='-';
		pixel[3][3]='(';
		pixel[3][4]='_';
		pixel[3][5]=')';
		pixel[3][6]='-';
		pixel[3][7]='-';
		pixel[3][8]='(';
		pixel[3][9]='_';
		pixel[3][10]=')';
		pixel[3][11]='-';
		pixel[3][12]='\'';
		return pixel;
	}

	// Reverse ASCII Art
	// `array[i].length - 1 - j` allows us to traverse and set columns in reverse order
	public static char[][] make_mirror(char[][] array) {
		char[][] r_array = new char[4][13];

		for (int i = 0; i < array.length; i++) 
			for (int j = 0; j < array[i].length; j++)
				if (array[i][j] == '(')
					r_array[i][array[i].length-1-j] = ')';
				else if (array[i][j] == ')')
					r_array[i][array[i].length-1-j] = '(';
				else if (array[i][j] == '/')
					r_array[i][array[i].length-1-j] = '\\';
				else if (array[i][j] == '\\')
					r_array[i][array[i].length-1-j] = '/';
				else
					r_array[i][array[i].length-1-j] = array[i][j];
				
		return r_array;
	}

	public static void main(String[] args) {
		char[][] ascii_art = new char[4][13];
		char[][] ascii_art_mirror = new char[4][13];

		// Print ASCII Art
		ascii_art = make_forward();
		for (int i = 0; i < ascii_art.length; i++) {
			for (int j = 0; j < ascii_art[i].length; j++)
				System.out.print(ascii_art[i][j]);
			System.out.println();
		}

		// Print ASCII Art mirored
		ascii_art_mirror = make_mirror(ascii_art);
		for (int i = 0; i < ascii_art_mirror.length; i++) {
			for (int j = 0; j < ascii_art_mirror[i].length; j++)
				System.out.print(ascii_art_mirror[i][j]);
			System.out.println();
		}

		// Print ASCII Art colision
		for (int i = 0; i< ascii_art.length; i++) {
			for (int j = 0; j < ascii_art[i].length; j++) 
				System.out.print(ascii_art[i][j]);
			for (int j = 0; j < ascii_art_mirror[i].length; j++)
				System.out.print(ascii_art_mirror[i][j]);
			System.out.println();
		}
	}


}
