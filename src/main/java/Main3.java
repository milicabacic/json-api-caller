import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main3 {

	public static void main(String[] args) {
	
		try(FileReader filereader = new FileReader("niz_objekata.json")) {

			Gson gson = new Gson();

			Type typeList = new TypeToken<List<CurrentWeather>>() {}.getType();

			List<CurrentWeather> weather = gson.fromJson(filereader, typeList);

			for (CurrentWeather cw : weather) {
				System.out.println(cw);
			}

		}catch (Exception e) {
			e.printStackTrace();

		}

	}

}
