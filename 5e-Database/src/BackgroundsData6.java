public class BackgroundsData6 implements BackgroundsData {
	private String name = "Alchemic Construct";
	private int index = 6;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = { "Arcana", "Nature" };
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {

	};
	private int toolproficienciesChoose = 0;
	private String[] toolproficiencies = {

	};
	private int languagesChoose = 1;
	private String[] languages = { "language, specifically the language spoken by your creator" };
	private String[] equipment = { "A simple set of robes", "a journal containing ciphered notes on your creation",
			"a brand or tattoo left on you by your creator", "a pouch containing 5 gold pieces" };
	private int descChoose = 1;
	private String[] descNames = { "Unnatural" };
	private String[] desc = {
			"You are a product of science, and an affront to nature, as such, certain powerful beings take notice of your unnatural existence. Celestials, Fey, and Fiends see you as special, and when encountering you, may treat you differently than normal. Celestials, for example, will likely treat you as a curiosity, and perhaps take pity on you. Fey will almost always greet you with hostility, and Fiends will be especially intrigued in creating contracts with you or becoming your patron." };

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
