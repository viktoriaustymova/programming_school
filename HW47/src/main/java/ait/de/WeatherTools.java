package ait.de;

public class WeatherTools {
    public static String getWindDescription(double windSpeed, boolean isGusty){
        String description = " ";
        if (windSpeed>=0 && windSpeed<1) description = "Calm";
        if (windSpeed>=1 && windSpeed<=5) description = "Light Air";
        if (windSpeed>=6 && windSpeed<=11) description = "Light Air Breeze";
        if (windSpeed>=12 && windSpeed<=19) description = "Gentle Breeze";
        if (windSpeed>=20 && windSpeed<=28) description = "Moderate Breeze";
        if (windSpeed>=29 && windSpeed<=38) description = "Fresh Breeze";
        if(isGusty) description = "Gusty " + description;
        return description + " with speed of " + (int)windSpeed + " km";
    }
}
