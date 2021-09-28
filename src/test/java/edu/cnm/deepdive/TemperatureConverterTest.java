package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

  static final double FAHRENHEIT_TOLERANCE = .001;
  static final double CELSIUS_TOLERANCE = 0.0005;

  static final double[] celsiusTemperatures = {-40, 0, 100, 50};
  static final double[] fahrenheitTemperatures = {-40, 32, 212, 122};

  @Test
  void convertC2F() {
    for (int i = 0; i < celsiusTemperatures.length; i++) {
      double celsius = celsiusTemperatures[i];
      double expectedFahrenheit = fahrenheitTemperatures[i];
      double actualFahrenheit = TemperatureConverter.convertC2F(celsius);
      assertEquals(expectedFahrenheit, actualFahrenheit, FAHRENHEIT_TOLERANCE);
    }
  }

}