public class BackgroundsData20 implements BackgroundsData {
	private String name = "Banker";
	private int index = 20;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = { "Persuasion", "Insight" };
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {

	};
	private int toolproficienciesChoose = 2;
	private String[] toolproficiencies = { "One set of artisan's tools", "vehicles (air)" };
	private int languagesChoose = 2;
	private String[] languages = { "language of your choice" };
	private String[] equipment = { "An ink pen", "Fine Clothes", "a bottle of ink", "10 sheets of parchment",
			"an accounting book", "a taxroll", "a pouch containing 25 gp" };
	private int descChoose = 1;
	private String[] descNames = { "Struck It Rich", "Banking Guild Membership" };
	private String[] desc = {
			"Your dealings have made you rich before you ever embarked on the life of an adventurer. And although the assets you obtained are not easily convertible into currency, they do allow you to live a life free of material want. As long as a banking house can be found in the city you currently reside in, you can maintain a wealthy lifestyle without expending money.",
			"Not everyone in the banking business makes a fortune out of it. You, however, have made it your job to be reliable, competent and be held in esteem by the fellow members of your trade. This feature works similar to the \"guild membership\" feature" };

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
