package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Weather Forecast Test Suite")
public class WeatherForecastTestSuite {

    private static int testCounter = 0;
    @Mock
    private Temperatures temperaturesMock;

    public Map<String, Double> testingData() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Kraków", 26.2);
        temperaturesMap.put("Wrocław", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdańsk", 26.1);

        return temperaturesMap;
    }

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }


    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Nested
    @DisplayName("Weather Forecast Tests With Mock")
    class  WeatherForecastTestsWithMock {

        @Test
        void testCalculateForecastWithMock() {
            //Given
            when(temperaturesMock.getTemperatures()).thenReturn(testingData());
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            Assertions.assertEquals(5, quantityOfSensors);
        }

        @Test
        void testAverageTemperaturesWithMock() {
            //Given
            when(temperaturesMock.getTemperatures()).thenReturn(testingData());
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            double average = weatherForecast.averageTemperatures();

            //Then
            Assertions.assertEquals(25.56, average, 0.001);
        }

        @Test
        void testMedianTemperatureWithMock() {
            //Given
            when(temperaturesMock.getTemperatures()).thenReturn(testingData());
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            double median = weatherForecast.medianTemperatures();

            //Then
            Assertions.assertEquals(25.5, median);
        }
    }
}
