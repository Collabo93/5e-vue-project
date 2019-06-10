import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import java.lang.reflect.Method;

import org.json.JSONObject;


@Path("/backgrounds")
@ApplicationPath("resources")
public class ViewBackgrounds extends Application{
	//http://localhost:8080/5e-Database/resources/backgrounds
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getBackgrounds(
			@QueryParam("sort") String value) {
		XMLBackgroundsMain data = new XMLBackgroundsMain();
		if ( value == null) {
			return data.getJSON();
		}
		try {
			String[] cache = new String[1];
			JSONObject output = new JSONObject();
			for ( int i = 1; i<=1; i++) {

					Class c = Class.forName("BackgroundsData"+i);
					Object obj = c.newInstance();
			}
			//BackgroundsData1 test= new BackgroundsData1();
			//further testing needed
			return cache[0];
		}catch(Exception e){
			System.out.println(e.toString());
		}
		return value;
	}
	
	@GET
	@Path("/{index}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getBackgroundsPerID(
			@PathParam("index") final String index) {
		try {
			Class c = Class.forName("BackgroundsData"+index);
			Object obj = c.newInstance();
			Method method = c.getDeclaredMethod("GetJSON");
			return (String) method.invoke(obj, null);
		}catch(Exception e){
			System.out.println(e.toString());
		}
		return "an error occured in getBackgroundsPerID()";
	}
	
	
//	@GET
//	@Path("/{sort}/{value}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public String getBackgroundtest(
//			@PathParam("sort") final String value,
//			@PathParam("value") final String name) {
//		System.out.println("1");
////		try {
////			for ( int i= 1 ; i<=1; i++) {
////				Class c = Class.forName("BackgroundsData"+i);
////				Object obj = c.newInstance();
////				Method method = c.getDeclaredMethod("GetJSON");
////				return (String) method.invoke(obj, null);
////			}
////		}catch(Exception ex){
////			ex.printStackTrace();
////		}
//		if ( name == "" ) {
//			System.out.println("geht durch");
//		}
//		String cache = value +" "+name;
//		return cache;
//	}
}
