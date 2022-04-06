
public class CurrentWeather {
	
	
	private String place;

	
	private String observation_time;
	
	
	private double temperature;
	
	
	private double wind_speed;
	
	
	private double pressure;
	
	
	private double feelslike;
	
	
	private double visibility;
	
	
	private double uv_index;

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getObservation_time() {
		return observation_time;
	}

	public void setObservation_time(String observation_time) {
		this.observation_time = observation_time;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getWind_speed() {
		return wind_speed;
	}

	public void setWind_speed(double wind_speed) {
		this.wind_speed = wind_speed;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getFeelslike() {
		return feelslike;
	}

	public void setFeelslike(double feelslike) {
		this.feelslike = feelslike;
	}

	public double getVisibility() {
		return visibility;
	}

	public void setVisibility(double visibility) {
		this.visibility = visibility;
	}

	public double getUv_index() {
		return uv_index;
	}

	public void setUv_index(double uv_index) {
		this.uv_index = uv_index;
	}

	@Override
	public String toString() {
		return "CurrentWeather [place=" + place + ", observation_time=" + observation_time + ", temperature="
				+ temperature + ", wind_speed=" + wind_speed + ", pressure=" + pressure + ", feelslike=" + feelslike
				+ ", visibility=" + visibility + ", uv_index=" + uv_index + "]";
	}
	
	
}
