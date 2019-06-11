import org.json.JSONArray;
import org.json.JSONObject;

public class XMLBackgroundsMain {
	private String[] backgroundsNames = { "Adept", "Adopted", "Adventurer", "Afflicted", "Air Acrobat",
			"Alchemic Construct", "Alchemist", "Alcoholic", "Alcoholic Scientist", "Amnesiac", "Ancient Cultist",
			"Antiquarian", "Apothecary", "Arcana Spy", "Arcane Dominion", "Armed Escort", "Artist", "Arvoreen Keeper",
			"Aspirant", "Astronaut", };
	private String[] backgroundsUrls;

	public XMLBackgroundsMain(String url) {
		backgroundsUrls = new String[backgroundsNames.length];
		for (int i = 0; i < backgroundsNames.length; i++) {
			backgroundsUrls[i] = url + (i + 1);
		}
	}

	public String getJSON() {
		JSONObject jsonBackgrounds = new JSONObject();
		jsonBackgrounds.put("count", backgroundsNames.length);

		JSONArray jsonArrayCache = new JSONArray();
		JSONObject jsonCache;
		for (int i = 0; i < backgroundsNames.length; i++) {
			jsonCache = new JSONObject();
			jsonCache.put("name", backgroundsNames[i]);
			jsonCache.put("url", backgroundsUrls[i]);
			jsonArrayCache.put(jsonCache);
		}

		jsonBackgrounds.put("results", jsonArrayCache);
		return jsonBackgrounds.toString();
	}
	
	public int getBackgroundsSize() {
		return backgroundsNames.length;
	}
}
