import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


import java.io.IOException;

public class WeatherResponse {
    static OkHttpClient okHttpClient = new OkHttpClient();
    static ObjectMapper objectMapper = new ObjectMapper();


    public static String getCityID() throws IOException {

    HttpUrl detectCityID = new HttpUrl.Builder()
            .scheme("http")
            .host("dataservice.accuweather.com")
            .addPathSegment("locations")
            .addPathSegment("v1")
            .addPathSegment("cities")
            .addPathSegment("search")
            .addQueryParameter("apikey","S7iN2g0LwydxLdWl0dylWkLZ4Cq3QtCQ")
            .addQueryParameter("q","Moscow")
            .build();

    Request request = new Request.Builder()
            .addHeader("Accept","application/json")
            .url(detectCityID)
            .build();

    Response response = okHttpClient.newCall(request).execute();

    String jsonOfCities = response.body().string();
    String cityID = objectMapper.readTree(jsonOfCities).get(0).at("/Key").asText();

        return cityID;
    }

    public static String getForecastsOfDay(String cityID) throws IOException {
        HttpUrl detectForecastsOfDay = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("1day")
                .addPathSegment("294021")
                .addQueryParameter("apikey", "S7iN2g0LwydxLdWl0dylWkLZ4Cq3QtCQ")
                .build();

        Request request = new Request.Builder()
                .addHeader("Accept", "application/json")
                .url(detectForecastsOfDay)
                .build();

        Response response = okHttpClient.newCall(request).execute();

        String jsonOfDaily = response.body().string();
        String dateForecasts = objectMapper.readTree(jsonOfDaily).get("Headline").at("/EffectiveDate").asText();
        String dailyForecasts = objectMapper.readTree(jsonOfDaily).get("Headline").at("/Text").asText();

        return dateForecasts + dailyForecasts;


    }

}
