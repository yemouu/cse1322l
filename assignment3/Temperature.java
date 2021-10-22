/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 3
*/

// 2021-09-09

public class Temperature {
  private double temperatureInF;

  public Temperature() {
    temperatureInF = 72;
  }

  public Temperature(double newTemperature, char unit) {
    switch (unit) {
      case 'c':
        temperatureInF = convertCToF(newTemperature);
        break;
      case 'f':
        temperatureInF = newTemperature;
        break;
      case 'k':
        temperatureInF = convertCToF(convertKToC(newTemperature));
        break;
    }
  }

  public double convertCToF(double celsius) {
    return (9.0 / 5.0) * celsius + 32;
  }

  public double convertFToC(double fahrenheit) {
    return (fahrenheit - 32) * (5.0 / 9.0);
  }

  public double convertKToC(double kelvin) {
    return kelvin - 273.15;
  }

  public double convertCToK(double celsius) {
    return celsius + 273.15;
  }

  public double getTempInF() {
    return temperatureInF;
  }

  public double getTempInC() {
    return convertFToC(temperatureInF);
  }

  public double getTempInK() {
    return convertCToK(convertFToC(temperatureInF));
  }
}
