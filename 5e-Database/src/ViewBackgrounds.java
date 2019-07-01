import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import java.lang.reflect.Method;

import org.json.JSONArray;
import org.json.JSONObject;

@Path("/backgrounds")
@ApplicationPath("resources")
public class ViewBackgrounds extends Application {
	private String url = "http://localhost:8080/5e-Database/resources/backgrounds/";	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getBackgrounds(@QueryParam("sort") String value, @QueryParam("name") String search) {
		XMLBackgroundsMain data = new XMLBackgroundsMain(url);
		if (value == null) {
			return data.getJSON();
		}
		try {
			JSONObject jsonCache;
			JSONArray jsonArrayCache;
			JSONObject jsonOneBackground;
			JSONArray jsonArrayAll = new JSONArray();
			boolean[] success = new boolean[data.getBackgroundsSize()];
			for (int i = 0; i < data.getBackgroundsSize(); i++) {
				jsonArrayCache = new JSONArray();
				jsonOneBackground = new JSONObject();
				Class c = Class.forName("BackgroundsData" + (i+1));
				Object obj = c.newInstance();

				Method getChoose = c.getDeclaredMethod("get" + value + "Choose");
				Method getValue = c.getDeclaredMethod("get" + value);
				Method getName = c.getDeclaredMethod("getName");
				Method getIndex = c.getDeclaredMethod("getIndex");
				
				boolean compare = false;
				if (search != null && search != "") {
					search = search.replace("_", " ");
					compare = true;
				}
				else {
					search = "";
				}
				
				String[] cache = (String[]) getValue.invoke(obj);
				success[i]=false;
				if (cache.length > 0) {	
					for (int z = 0; z < cache.length; z++) {
						jsonCache = new JSONObject();
						if ((compare && search.toString().equals(cache[z].toString()) || compare && cache[z].toString().equals("choice")) || !compare) {
							System.out.println("'"+(String) getName.invoke(obj) +"' "+cache[z]+" "+search+" "+compare);
							jsonCache.put("name", cache[z]);
							jsonArrayCache.put(jsonCache);
							success[i]=true;
							break;
						}
					}
					if (success[i]) {
						jsonOneBackground.put("index", (int) getIndex.invoke(obj));
						jsonOneBackground.put("name", (String) getName.invoke(obj));
						jsonOneBackground.put("url", url + (i+1));
						jsonOneBackground.put("choose", (int) getChoose.invoke(obj));
						jsonOneBackground.put("from", jsonArrayCache);
						jsonArrayAll.put(jsonOneBackground);
					}
				}
			}
			return jsonArrayAll.toString();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return value;
	}
	// http://localhost:8080/5e-Database/resources/backgrounds/?sort=Languages
	// http://localhost:8080/5e-Database/resources/backgrounds/?sort=Skillproficiencies
	// ...
	// http://localhost:8080/5e-Database/resources/backgrounds/?sort=Skillproficiencies&name=Stealth

	@GET
	@Path("/{index}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBackgroundsPerID(@PathParam("index") String index) {
		try {
			if ( !index.matches(".*\\d.*") ) {
				XMLBackgroundsMain data = new XMLBackgroundsMain(url);
				index = index.replace("_", " ");
				int cache = data.getBackgroundIndexByName(index)+1;
				index = Integer.toString(cache);
				System.out.println(index);
			}
			
			Class c = Class.forName("BackgroundsData" + index);
			Object obj = c.newInstance();

			Method getName = c.getDeclaredMethod("getName");
			Method getIndex = c.getDeclaredMethod("getIndex");
			Method getSkillproficienciesChoose = c.getDeclaredMethod("getSkillproficienciesChoose");
			Method getSkillproficiencies = c.getDeclaredMethod("getSkillproficiencies");
			Method getWeaponproficienciesChoose = c.getDeclaredMethod("getWeaponproficienciesChoose");
			Method getWeaponproficiencies = c.getDeclaredMethod("getWeaponproficiencies");
			Method getToolproficienciesChoose = c.getDeclaredMethod("getToolproficienciesChoose");
			Method getToolproficiencies = c.getDeclaredMethod("getToolproficiencies");
			Method getLanguagesChoose = c.getDeclaredMethod("getLanguagesChoose");
			Method getLanguages = c.getDeclaredMethod("getLanguages");
			Method getEquipment = c.getDeclaredMethod("getEquipment");
			Method getDescChoose = c.getDeclaredMethod("getDescChoose");
			Method getDescNames = c.getDeclaredMethod("getDescNames");
			Method getDesc = c.getDeclaredMethod("getDesc");

			XMLFactoryBackgrounds xmlFactoryBackgrounds = new XMLFactoryBackgrounds((String) getName.invoke(obj),
					(int) getIndex.invoke(obj), (int) getSkillproficienciesChoose.invoke(obj),
					(String[]) getSkillproficiencies.invoke(obj), (int) getWeaponproficienciesChoose.invoke(obj),
					(String[]) getWeaponproficiencies.invoke(obj), (int) getToolproficienciesChoose.invoke(obj),
					(String[]) getToolproficiencies.invoke(obj), (int) getLanguagesChoose.invoke(obj),
					(String[]) getLanguages.invoke(obj), (String[]) getEquipment.invoke(obj),
					(int) getDescChoose.invoke(obj), (String[]) getDescNames.invoke(obj),
					(String[]) getDesc.invoke(obj));
			return xmlFactoryBackgrounds.GetJSON();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return "an error occured in getBackgroundsPerID()";
	}
}