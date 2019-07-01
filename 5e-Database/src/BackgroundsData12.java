public class BackgroundsData12 implements BackgroundsData {
	private String name = "Antiquarian";
	private int index = 12;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = { "History", "Investigation" };
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {

	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies = { "Calligrapher's supplies" };
	private int languagesChoose = 1;
	private String[] languages = { "choice" };
	private String[] equipment = { "A bottle of black ink", "a quill",
			"a tome that appears to contain the history of an unknown settlement or culture",
			"a set of traveler's clothes (Indiana Jones hat Included)", "a belt pouch containing 10 gp" };
	private int descChoose = 1;
	private String[] descNames = { "descNames" };
	private String[] desc = {
			"You are a member of a respected museum, university, or other organization that preserves relics of ages past. You can gain access to the facilities where such antiquities are stored and can participate in their study. You may be allowed to accompany expeditions seeking to explore ruins or retrieve items of historical interest, if your area of expertise is relevant to the task at hand." };

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
