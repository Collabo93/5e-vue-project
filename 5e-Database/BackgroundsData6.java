public class BackgroundsData6 {	
	private String name = "Alchemic Construct";
	private int index = 6;
	private Object[] skillproficiencies = {
			"Arcana","Nature"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			"Alchemist's Supplies"
	};
	private Object[] languages= {
			1, "language, specifically the language spoken by your creator"
	};
	private Object[] equipment= {
			"A simple set of robes",
			"a journal containing ciphered notes on your creation", 
			"a brand or tattoo left on you by your creator",
			"a pouch containing 5 gold pieces"
	};
	private String desc ="You are a product of science, and an affront to nature, as such, certain powerful beings take notice of your unnatural existence. Celestials, Fey, and Fiends see you as special, and when encountering you, may treat you differently than normal. Celestials, for example, will likely treat you as a curiosity, and perhaps take pity on you. Fey will almost always greet you with hostility, and Fiends will be especially intrigued in creating contracts with you or becoming your patron.";
	
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
