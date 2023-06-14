package ait.de;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WeatherToolsTest {
    @DisplayName("getWeatherTools tests")
    @ParameterizedTest
    @CsvSource({
            "0,true,'Gusty Calm with speed of 0 km'",
            "0,false,'Calm with speed of 0 km'",
            "4,true,'Gusty Light Air with speed of 4 km'",
            "4,false,'Light Air with speed of 4 km'",
            "10, true,'Gusty Light Air Breeze with speed of 10 km'",
            "10, false,'Light Air Breeze with speed of 10 km'",
            "14, true,'Gusty Gentle Breeze with speed of 14 km'",
            "14, false,'Gentle Breeze with speed of 14 km'",
            "21, true,'Gusty Moderate Breeze with speed of 21 km'",
            "21, false,'Moderate Breeze with speed of 21 km'",
            "30, true, 'Gusty Fresh Breeze with speed of 30 km'",
            "30, false,'Fresh Breeze with speed of 30 km'",
    })
    public void describeWeatherTools_test(double windSpeed,boolean isGusty, String description) {
        assertEquals(
                description,
                WeatherTools.getWindDescription(windSpeed,isGusty)
        );
    }
}