package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

  static final double[] celsiusTemperatures = {-40, 0, 100};
  static final double[] fahrenheitTemperatures = {-40, 32, 212};

  @Test
  void convertC2F() {
    for (int i = 0; i < celsiusTemperatures.length; i++) {
      double celsius = celsiusTemperatures[i];
      double expectedFahrenheit = fahrenheitTemperatures[i];
      double actualFahrenheit = TemperatureConverter.convertC2F(celsius);
      assertEquals(expectedFahrenheit, actualFahrenheit);
    }
  }

}