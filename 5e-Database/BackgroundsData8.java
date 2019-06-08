public class BackgroundsData8 {	
	private String name = "Alcoholic";
	private int index = 8;
	private Object[] skillproficiencies = {
			"Sleight of Hand","Medicine"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			1, "Brewer's Tools", "Thieves' Tools"
	};
	private Object[] languages= {
			"none"
	};
	private Object[] equipment= {
			"A flask filled with your favorite alcohol",
			"a memento of your life before alcohol", 
			"common clothes",
			"a heavy blanket",
			"a pouch with 5 sp"
	};
	private String desc ="Having already struggled through addiction in the past you know how to identify the signs of addiction, and are better equipped to quit other addictions or help others through their addictions. Your demeanor after giving up alcohol may also affect the way different people interact with you.";
	
	public String getName() {
		return name;
	}
	public int getIndex() {
		return index;
	}	
	public Object[] getSkillproficiencies() {
		return skillproficiencies;
	}
	public Object[] getWeaponproficiencies() {
		return weaponproficiencies;
	}
	public Object[] getToolproficiencies() {
		return toolproficiencies;
	}
	public Object[] getLanguages() {
		return languages;
	}
	public Object[] getEquipment() {
		return equipment;
	}
	public String getDesc() {
		return desc;
	}
}
