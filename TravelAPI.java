package TravelAPI;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class TravelAPI {

	public static void main(String[] args) {
        try {
            System.out.println(FlightInfo("eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiI0IiwianRpIjoiYzU2ZTMzYjk0MjY3MzhjMjljMzRkODc3MmI5Yzg3NGIzNDZhMTAxZDRhYzE0MjBmOGU3NTBhMjkwMjhlMWYzNjI3N2U1Yjc0M2U3YjZlZmUiLCJpYXQiOjE2NTAwMjU4ODYsIm5iZiI6MTY1MDAyNTg4NiwiZXhwIjoxNjgxNTYxODg2LCJzdWIiOiIyNzA0Iiwic2NvcGVzIjpbXX0.m_ArS_Bt8g6ZW8vIYV8QBJVu_6W-KMzvfaq6D8XTBqAS47QIsc6v0AkXzeXXns_IsD2BD8_QyNIwcWgU5hj-qw"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public static String FlightInfo(String APIKey, String APIType, String loc) throws Exception {
		//setup the url for the api from the api is from postman
		URL url = new URL("");
		
		//casting
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		
		http.setRequestMethod("POST");
		http.setDoOutput(true);
		http.setRequestProperty("Content-Type", "application/json");
		http.setRequestProperty("Content-Length", "0");
		
		
		JsonElement root = JsonParser.parseReader(new InputStreamReader(http.getInputStream()));
        JsonElement main = root.getAsJsonObject().get("main");
        
        http.disconnect();
        
		//restAssured is used to test the api
        return main.getAsJsonObject().get("temp").toString();
	}
    
    public static String ParseStandings(JsonElement data) {
        JsonElement MRData = data.getAsJsonObject().get("MRData");
        JsonElement StandingsTable = MRData.getAsJsonObject().get("StandingsTable");
        JsonElement StandingsLists = StandingsTable.getAsJsonObject().get("StandingsLists");
        JsonElement DriverStandings = StandingsLists.getAsJsonArray().get(0).getAsJsonObject().get("DriverStandings");
        JsonElement Positions = DriverStandings.getAsJsonArray().get(0);
        JsonElement Driver = Positions.getAsJsonObject().get("Driver");
        String DriverName = Driver.getAsJsonObject().get("givenName") + " " + Driver.getAsJsonObject().get("familyName");
        return DriverName.replaceAll("\"", "");
    }	
}
