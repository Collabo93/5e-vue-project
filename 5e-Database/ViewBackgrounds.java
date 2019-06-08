import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@Path("/backgrounds")
@ApplicationPath("resources")
public class ViewBackgrounds extends Application{
	private String [][]backgroundsName;
	
	public ViewBackgrounds() {
		BackgroundsDataName BackgroundsDataName=new BackgroundsDataName();
		this.backgroundsName=BackgroundsDataName.getBackgroundsData();
	}
	
	//http://localhost:8080/5e-Database/resources/backgrounds
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public XMLMain getBackgrounds() {
		Object[] cache=new Object[backgroundsName.length];
		for	(int i=0;i<backgroundsName.length;i++) {
			cache[i]=new XMLResultsBackgrounds(backgroundsName[i][0], backgroundsName[i][1]);
		}
		return new XMLMain(backgroundsName.length,cache);
	}
	
	@GET
	@Path("/1")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground1() {
		BackgroundsData1 data = new BackgroundsData1();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/2")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground2() {
		BackgroundsData2 data = new BackgroundsData2();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/3")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground3() {
		BackgroundsData3 data = new BackgroundsData3();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/4")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground4() {
		BackgroundsData4 data = new BackgroundsData4();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/5")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground5() {
		BackgroundsData5 data = new BackgroundsData5();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/6")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground6() {
		BackgroundsData6 data = new BackgroundsData6();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/7")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground7() {
		BackgroundsData7 data = new BackgroundsData7();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/8")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground8() {
		BackgroundsData8 data = new BackgroundsData8();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/9")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground9() {
		BackgroundsData9 data = new BackgroundsData9();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/10")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground10() {
		BackgroundsData10 data = new BackgroundsData10();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/11")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground11() {
		BackgroundsData11 data = new BackgroundsData11();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/12")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground12() {
		BackgroundsData12 data = new BackgroundsData12();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/13")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground13() {
		BackgroundsData13 data = new BackgroundsData13();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/14")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground14() {
		BackgroundsData14 data = new BackgroundsData14();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/15")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground15() {
		BackgroundsData15 data = new BackgroundsData15();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/16")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground16() {
		BackgroundsData16 data = new BackgroundsData16();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/17")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground17() {
		BackgroundsData17 data = new BackgroundsData17();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/18")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground18() {
		BackgroundsData18 data = new BackgroundsData18();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
	
	@GET
	@Path("/19")
	@Produces(MediaType.APPLICATION_JSON)
	public XMLBackgroundsData getBackground19() {
		BackgroundsData19 data = new BackgroundsData19();	
		return new XMLBackgroundsData(
				data.getIndex(),
				data.getName(),
				data.getSkillproficiencies(),
				data.getWeaponproficiencies(),
				data.getToolproficiencies(),
				data.getLanguages(),
				data.getEquipment(),
				data.getDesc()
		);
	}
}
