import java.io.FileWriter;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main2 {

	public static void main(String[] args) {
		
		CurrentWeather weather1 = new CurrentWeather();
		
		weather1.setPlace("Belgrade");
		weather1.setObservation_time("11:50 AM");
		weather1.setTemperature(10.3);
		weather1.setWind_speed(3.2);
		weather1.setPressure(1011);
		weather1.setFeelslike(8.0);
		weather1.setVisibility(11.5);
		weather1.setUv_index(4.5);
		
		CurrentWeather weather2 = new CurrentWeather();
		
		weather2.setPlace("Novi Sad");
		weather2.setObservation_time("10:45 AM");
		weather2.setTemperature(12.0);
		weather2.setWind_speed(4.1);
		weather2.setPressure(1003);
		weather2.setFeelslike(11.0);
		weather2.setVisibility(11.0);
		weather2.setUv_index(4.0);
		
		CurrentWeather weather3 = new CurrentWeather();
		
		weather3.setPlace("Nis");
		weather3.setObservation_time("8:30 PM");
		weather3.setTemperature(17.0);
		weather3.setWind_speed(1.1);
		weather3.setPressure(1017);
		weather3.setFeelslike(16.0);
		weather3.setVisibility(12.0);
		weather3.setUv_index(5.0);
		
		CurrentWeather weather4 = new CurrentWeather();
		
		weather4.setPlace("Kragujevac");
		weather4.setObservation_time("4:30 PM");
		weather4.setTemperature(22.0);
		weather4.setWind_speed(1.7);
		weather4.setPressure(1016);
		weather4.setFeelslike(23.0);
		weather4.setVisibility(14.0);
		weather4.setUv_index(5.5);
		
		CurrentWeather[] weather = {weather1, weather2, weather3, weather4};
		
		try(PrintWriter out = new PrintWriter(new FileWriter("niz_objekata.json"))) {

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			out.print(gson.toJson(weather));

		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
