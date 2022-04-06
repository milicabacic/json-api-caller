import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main4 {

	public static void main(String[] args) {

		try(FileWriter file = new FileWriter("rucni_upis.json")) {
			
			JsonObject weatherObj = new JsonObject();
			
			weatherObj.addProperty("place", "Belgrade");
			weatherObj.addProperty("observation_time", "11:52 PM");
			weatherObj.addProperty("tempearture", 11.3);
			weatherObj.addProperty("wind_speed", 4.21);
			weatherObj.addProperty("pressure", 1019);
			weatherObj.addProperty("feelslike", 10.2);
			weatherObj.addProperty("visibility", 9.8);
			weatherObj.addProperty("uv_index", 3.5);
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			gson.toJson(weatherObj,file);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
