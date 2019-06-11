public class BackgroundsData11 implements BackgroundsData {
	private String name = "Ancient Cultist";
	private int index = 11;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = { "Arcana", "Religion" };
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {

	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies = { "Torturer's kit" };
	private int languagesChoose = 1;
	private String[] languages = { "Deep Speech" };
	private String[] equipment = { "A set of traveler's clothes", "your cult’s identification mark", "a marked dagger",
			"a pouch containing 10 gp" };
	private int descChoose = 1;
	private String[] descNames = { "One of the Family" };
	private String[] desc = {
			"Thanks to your long affiliation with your cult, you can easily identify members of other cults that follow an esoteric entity like that of yours. This does not mean that you are held in high standing with such cults: the field of hidden worship is often a competitive one, and an adherent of one creed might stand in bloody opposition to a faithful of another. Nonetheless, you have insight into the nature of hidden religions and can usually recognize the basic features of any given cult." };

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
