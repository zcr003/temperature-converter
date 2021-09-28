package edu.cnm.deepdive;

import java.util.Scanner;

public class TemperatureConverter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Please enter a temperature in Celsius degrees");
      double celsius = scanner.nextDouble();
      double fahrenheit = convertC2F(celsius);
      System.out.println(fahrenheit);
    }
  }

  public static double convertC2F(double celsius) {
    return 9 * celsius / 5 + 32;
  }

}
