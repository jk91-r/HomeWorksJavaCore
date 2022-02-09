import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println(WeatherResponse.getCityID());
        System.out.println(WeatherResponse.getForecastsOfDay(WeatherResponse.getCityID()));
    }
}
