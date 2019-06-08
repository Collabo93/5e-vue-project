import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XMLBackgroundsData {
	private int index;
	private String name;
	private Object[] skillProficiencies;
	private Object[] weaponProficiencies;
	private Object[] toolProficiencies;
	private Object[] languages;
	private Object[] equipment;
	private String desc;
	
	public XMLBackgroundsData() {
		
	}
	
	public XMLBackgroundsData(int index, String name, Object[] skillProficiencies, Object[] weaponProficiencies,
			Object[] toolProficiencies, Object[] languages, Object[] equipment, String desc) {
		super();
		this.index = index;
		this.name = name;
		this.skillProficiencies = skillProficiencies;
		this.weaponProficiencies = weaponProficiencies;
		this.toolProficiencies = toolProficiencies;
		this.languages = languages;
		this.equipment = equipment;
		this.desc = desc;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object[] getSkillProficiencies() {
		return skillProficiencies;
	}
	public void setSkillProficiencies(Object[] skillProficiencies) {
		this.skillProficiencies = skillProficiencies;
	}
	public Object[] getWeaponProficiencies() {
		return weaponProficiencies;
	}
	public void setWeaponProficiencies(Object[] weaponProficiencies) {
		this.weaponProficiencies = weaponProficiencies;
	}
	public Object[] getToolProficiencies() {
		return toolProficiencies;
	}
	public void setToolProficiencies(Object[] toolProficiencies) {
		this.toolProficiencies = toolProficiencies;
	}
	public Object[] getLanguages() {
		return languages;
	}
	public void setLanguages(Object[] languages) {
		this.languages = languages;
	}
	public Object[] getEquipment() {
		return equipment;
	}
	public void setEquipment(Object[] equipment) {
		this.equipment = equipment;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
