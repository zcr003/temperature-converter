package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

  @Test
  void convertC2F() {
    double celsius = -40;
    double expectedFahrenheit = -40;
    double actualFahrenheit = TemperatureConverter.convertC2F(celsius);
    if (expectedFahrenheit != actualFahrenheit) {
      fail();
    }
  }
}