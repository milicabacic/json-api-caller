import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main1 {

	public static String ACCESS_KEY = " ";
	public static String BASE_URL = "http://api.weatherstack.com/";
	
	
	public static void main(String[] args) {
		
		try {
			URL url = new URL(BASE_URL+"current?access_key=" +ACCESS_KEY+ "&query=Belgrade");
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");

			BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			JsonObject jsonWeather = gson.fromJson(reader, JsonObject.class);
			
			CurrentWeather weather = new CurrentWeather();
			
			weather.setPlace(jsonWeather.get("location").getAsJsonObject().get("name").getAsString());
			weather.setObservation_time(jsonWeather.get("current").getAsJsonObject().get("observation_time").getAsString());
			weather.setTemperature(jsonWeather.get("current").getAsJsonObject().get("temperature").getAsDouble());
			weather.setWind_speed(jsonWeather.get("current").getAsJsonObject().get("wind_speed").getAsDouble());
			weather.setPressure(jsonWeather.get("current").getAsJsonObject().get("pressure").getAsDouble());
			weather.setFeelslike(jsonWeather.get("current").getAsJsonObject().get("feelslike").getAsDouble());
			weather.setVisibility(jsonWeather.get("current").getAsJsonObject().get("visibility").getAsDouble());
			weather.setUv_index(jsonWeather.get("current").getAsJsonObject().get("uv_index").getAsDouble());

			System.out.println(weather);
			reader.close();

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
