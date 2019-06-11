public class BackgroundsData2 implements BackgroundsData {
	private String name = "Adopted";
	private int index = 2;
	private int skillproficienciesChoose = 3;
	private String[] skillproficiencies = { "Persuasion", "Deception", "Stealth" };
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {

	};
	private int toolproficienciesChoose = 0;
	private String[] toolproficiencies = {

	};
	private int languagesChoose = 1;
	private String[] languages = { "language spoken by your adoptive family" };
	private String[] equipment = { "A set of common clothes matching the style worn by your current family",
			"something of a trinket left from your birth parents (cannot be worth more than 5gp)", "pouch with 10gp" };
	private int descChoose = 1;
	private String[] descNames = { "Trust Issues", "No Discrimination" };
	private String[] desc = {
			"People of your birth race, and of the race of your adoptive family (with the possible exception of you family/s) find it harder to trust you. Those of the race you are will take longer to trust you because they think you have been corrupted or on the side of the race of your adoptive family and no longer share their values. People who are the same race of your adoptive family may take longer to trust you because they believe that you will always be one of your race, no matter how you were brought up. Due to this ostracization, races that are not of your birth or adopted tend to take you with a bit more kindness.",
			"You often see trivial differences between the various races that you encounter. You know that the race itself doesn’t decide who a person will be. You know all types of personalities of creatures you talk with after just an exchange of few words." };

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
