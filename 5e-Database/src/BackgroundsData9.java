public class BackgroundsData9 implements BackgroundsData {
	private String name = "Alcoholic Scientist";
	private int index = 9;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = { "Perception", "Investigation" };
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {

	};
	private int toolproficienciesChoose = 2;
	private String[] toolproficiencies = { "Tinker’s tools", "Calligrapher's supplies" };
	private int languagesChoose = 0;
	private String[] languages = {

	};
	private String[] equipment = { "A backpack", "a set of lab coats", "a bedroll", "a pouch containing 15 gp",
			"lab notes on the experiment", "three flasks of alcohol", "three empty flasks", "an ink bottle",
			"a feather pen", "a chess set" };
	private int descChoose = 1;
	private String[] descNames = { "Intoxicated Teacher" };
	private String[] desc = {
			"You drink. A lot. No, really, you have a serious problem. Unfortunately in terms of your recovery, you've found that drinking, to a certain extent, helps organize your slightly scattered mind, and makes previously difficult to understand concepts easier to parse and work through. While drunk, your character is somehow able to find just the right words to explain any concept related to your scientific domain, no matter how complicated, in simple enough terminology that anyone listening will be able to garner at least a basic understanding of it." };

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
