public class BackgroundsData16 implements BackgroundsData {
	private String name = "Armed Escort";
	private int index = 16;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = { "Nature", "Survival", "Persuasion", "Intimidation" };
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {

	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies = { "Vehicle" };
	private int languagesChoose = 1;
	private String[] languages = { "language of your choice" };
	private String[] equipment = { "A set of traveler’s clothes", "leather poncho", "hooded pole lantern",
			"2 oil flask", "a leather case with a few drawn road maps", "and a belt pouch containing 10gp" };
	private int descChoose = 1;
	private String[] descNames = { "Eyes on the road" };
	private String[] desc = {
			"As an armed escort, you value information as anybody else. Before you start a journey you can spend a number of hours equal to 1d4 to ascertain information from people in settlements, villages, towns or cities that might be helpful for you on the road ahead. You may ask for a number of information equal to 2d4. The information shared are mundane, at the DM's discretion. For example you may ask the DM, what terrain you can expect on the journey, what type of hostile creatures you may encounter in the area, or historical and lore related significance or locally known pathways." };

	public String getName() {
		return name;
	}

	public int getIndex() {
		return index;
	}

	public int getSkillproficienciesChoose() {
		return skillproficienciesChoose;
	}

	public String[] getSkillproficiencies() {
		return skillproficiencies;
	}

	public int getWeaponproficienciesChoose() {
		return weaponproficienciesChoose;
	}

	public String[] getWeaponproficiencies() {
		return weaponproficiencies;
	}

	public int getToolproficienciesChoose() {
		return toolproficienciesChoose;
	}

	public String[] getToolproficiencies() {
		return toolproficiencies;
	}

	public int getLanguagesChoose() {
		return languagesChoose;
	}

	public String[] getLanguages() {
		return languages;
	}

	public String[] getEquipment() {
		return equipment;
	}

	public int getDescChoose() {
		return descChoose;
	}

	public String[] getDescNames() {
		return descNames;
	}

	public String[] getDesc() {
		return desc;
	}
}
