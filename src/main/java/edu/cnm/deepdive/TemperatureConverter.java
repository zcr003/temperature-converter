package edu.cnm.deepdive;

import java.util.Scanner;

public class TemperatureConverter {

  private static final double CELSIUS_FAHRENHEIT_SCALE_FACTOR = 1.8;
  private static final int CELSIUS_FAHRENHEIT_SCALE_OFFSET = 32;

  public static void main(String[] args) {
    /*Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Please enter a temperature in Celsius degrees");
      double celsius = scanner.nextDouble();
      double fahrenheit = convertC2F(celsius);
      System.out.println(fahrenheit);
    }*/
    for (String arg : args) {
      double f = Double.parseDouble(arg);
      System.out.println(convertF2C(f));
    }
  }

  public static double convertC2F(double celsius) {
    return CELSIUS_FAHRENHEIT_SCALE_FACTOR * celsius + CELSIUS_FAHRENHEIT_SCALE_OFFSET;
  }

  public static double convertF2C(double fahrenheit) {
    return (fahrenheit - CELSIUS_FAHRENHEIT_SCALE_OFFSET) / CELSIUS_FAHRENHEIT_SCALE_FACTOR;
  }

}
