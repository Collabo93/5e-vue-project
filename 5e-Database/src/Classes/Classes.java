package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriter;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONArray;
import org.json.JSONObject;

@Path("/classes")
public class Classes {
	String dataBasePath = "C:\\Users\\Collabo\\Documents\\Eclipse\\Eclipse-Workspace\\5e-Database\\src\\Classes\\data";

	@POST
	public void POSTRequest(JsonObject CharacterSheet) throws IOException {
		try {
			int count = new File(dataBasePath).list().length;
			FileWriter fw = new FileWriter(
					"C:\\Users\\Collabo\\Documents\\Eclipse\\Eclipse-Workspace\\5e-Database\\src\\Classes\\data\\character"
							+ count + ".txt");
			JsonWriter jsonWriter = Json.createWriter(fw);
			jsonWriter.writeObject(CharacterSheet);
			jsonWriter.close();
			fw.close();
		} catch (Exception ex) {
			System.out.println("error: " + ex.toString());
		}
	}

	private String getCharacter(int nr) throws IOException {
		int count = new File(dataBasePath).list().length;
		String json = "";
		try {
				BufferedReader reader = new BufferedReader(new FileReader(dataBasePath + "\\character" + nr + ".txt"));
				StringBuilder sb = new StringBuilder();
				String line = reader.readLine();
				json = "";
				while (line != null) {
					sb.append(line);
					sb.append("\n");
					line = reader.readLine();
				}
				reader.close();
				json = sb.toString();

		} catch (Exception ex) {
			System.out.println("error: " + ex.toString());
		}
		return json;
	}
	
	
	@GET
	@Path("/{index}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCharacters(@PathParam("index") int index) throws IOException {
		JSONObject json = new JSONObject();
		
		return getCharacter(index);
	}
	
	@GET
	@Path("/CharacterCount")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCharacterCount() throws IOException {	
		int count = new File(dataBasePath).list().length;
		JSONObject json = new JSONObject();
		json.put("counter", count);
		return json.toString();
	}
}
