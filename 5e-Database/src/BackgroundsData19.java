public class BackgroundsData19 implements BackgroundsData {
	private String name = "Astronaut";
	private int index = 19;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = { "Acrobatics", "Arcana" };
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {

	};
	private int toolproficienciesChoose = 2;
	private String[] toolproficiencies = { "One set of artisan's tools", "vehicles (air)" };
	private int languagesChoose = 0;
	private String[] languages = {

	};
	private String[] equipment = { "A bottle of black ink", "a quill", "a map of constellations",
			"a damaged blueprint for a huge ship written in an undecipherable code", "a set of artisan's tools",
			"a set of traveler's clothes", "and a pouch containing 10 gp" };
	private int descChoose = 1;
	private String[] descNames = { "Celestial Contacts", "Constellations" };
	private String[] desc = {
			"You worked with a crew for a long time. A bond created with crew-members is (mostly) an unbreakable one. If you can get in contact with one of your crew-members, they usually feel obliged to help you. Whenever it's a place to stay, a companion for combat, or help with a dungeon's puzzle or code. Renting a spaceship however, is impossible unless the situation is absolutely dire. And even then is incredibly difficult and it always takes a long time to prepare a ship.",
			"If you work alone, you may not have any contacts to help you on your adventures. But, you can recall certain constellations and their effects on the Material Plane. Work with your DM to create a list of constellations and how they affect you and your party members (positively and negatively), when they appear, and if the effects are proven to be consistent or not." };

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
