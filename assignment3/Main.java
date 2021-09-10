/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 3
*/

// 2021-09-09

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double answer, celsius, fahrenheit, kelvin;
		Scanner input = new Scanner(System.in);
		Temperature temperature;

		System.out.println("What is the current temperature in fahrenheit");
		answer = input.nextDouble();

		fahrenheit = answer;
		temperature = new Temperature(fahrenheit, 'f');

		if (answer >= 80) {
			System.out.println("What is the current humidity percentage (0-100)");
			answer = input.nextDouble();

			if (answer >= 40) {
				fahrenheit = calculateHeatIndex(fahrenheit, answer);
				temperature = new Temperature(fahrenheit, 'f');
			}

			celsius = temperature.getTempInC();
			kelvin = temperature.getTempInK();

			System.out.println("The current Heat Index is: " + fahrenheit + "f and "
			                   + celsius + "c and " + kelvin + "k");
		} else if (answer <= 50) {
			System.out.println("What is the current wind speed in mph");
			answer = input.nextDouble();

			if (answer >= 3) {
				fahrenheit = calculateWindChill(fahrenheit, answer);
				temperature = new Temperature(fahrenheit, 'f');
			}

			celsius = temperature.getTempInC();
			kelvin = temperature.getTempInK();

			System.out.println("The current Wind Chill is: " + fahrenheit + "f and "
			                   + celsius + "c and " + kelvin + "k");
		} else {
			celsius = temperature.getTempInC();
			kelvin = temperature.getTempInK();

			System.out.println("There is currently no HeatIndex nor WindChill. "
			                   + "The temperature you entered" + "is " + fahrenheit
			                   + "f and " + celsius + "c and " + kelvin + "k");
		}
	}

	public static double calculateHeatIndex(double temperature, double humidity) {
		final double c1 = -42.379, c2 = 2.04901523, c3 = 10.14333127, c4 = -0.22475541,
		             c5 = -0.00683783, c6 = -0.05481717, c7 = 0.0012274, c8 = 0.00085282,
		             c9 = -0.00000199;

		return c1 + (c2 * temperature)
		       + (c3 * humidity)
		       + (c4 * temperature * humidity)
		       + (c5 * Math.pow(temperature, 2))
		       + (c6 * Math.pow(humidity, 2))
		       + (c7 * Math.pow(temperature, 2) * humidity)
		       + (c8 * temperature * Math.pow(humidity, 2))
		       + (c9 * Math.pow(temperature, 2) * Math.pow(humidity, 2));
	}

	public static double calculateWindChill(double temperature, double windSpeed) {
		return 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16))
		       + (0.4275 * temperature* Math.pow(windSpeed, 0.16));
	}
}
