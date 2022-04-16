package TravelAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TravelAPIsTest {

	public String loadFromFile(String path) throws IOException {
        return new String(Files.readAllBytes(
                Paths.get(path)));
    }
	
	@Test
    public void ParseStandingsTest() {
        String data = "";
        try {
            data = loadFromFile(""); //insert path of json file
            JsonElement jsondata = JsonParser.parseString(data);
            assertEquals("Max Verstappen", API.ParseStandings(jsondata),"Expected Max Verstappen");
        }catch (IOException error) {
            System.out.println(error);
        }
    }
	
	

}
