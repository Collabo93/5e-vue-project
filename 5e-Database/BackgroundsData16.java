public class BackgroundsData16 {
	private String name = "Armed Escort";
	private int index = 16;
	private Object[] skillproficiencies = {
			1, "Nature", "Survival", 1, "Persuasion", "Intimidation"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			"Vehicle"
	};
	private Object[] languages= {
			1, "language of your choice"
	};
	private Object[] equipment= {
			"A set of traveler’s clothes",
			"leather poncho",
			"hooded pole lantern",
			"2 oil flask",
			"a leather case with a few drawn road maps",
			"and a belt pouch containing 10gp"
	};
	private String desc ="As an armed escort, you value information as anybody else. Before you start a journey you can spend a number of hours equal to 1d4 to ascertain information from people in settlements, villages, towns or cities that might be helpful for you on the road ahead. You may ask for a number of information equal to 2d4. The information shared are mundane, at the DM's discretion. For example you may ask the DM, what terrain you can expect on the journey, what type of hostile creatures you may encounter in the area, or historical and lore related significance or locally known pathways.";
	
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
