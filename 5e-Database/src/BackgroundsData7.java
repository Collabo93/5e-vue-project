public class BackgroundsData7 implements BackgroundsData {
	private String name = "Alchemist";
	private int index = 7;
	private int skillproficienciesChoose = 1;
	private String[] skillproficiencies = { "Arcana", "Survival" };
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {

	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies = { "Alchemist's Supplies" };
	private int languagesChoose = 1;
	private String[] languages = { "choice" };
	private String[] equipment = { "Alchemist's supplies", "1d4+2 Books on Alchemical Formula",
			"a belt pouch with 2d4 GP", "common clothes" };
	private int descChoose = 1;
	private String[] descNames = { "Experimenter", "Potion Brewer" };
	private String[] desc = {
			"Based on your previous experiments, you can easily identify the uses of any component you acquire after examining it with your alchemist's supplies during a long rest.",
			"During the course of a rest you may make an Intelligence check to make a potion of any rarity. The DC of this roll depends on the rarity of the potion you intend to make(Magic items): DC10 for common, DC15 for uncommon, DC20 for rare, and DC25 for very rare. You must be unbound and have access to your alchemical supplies to make use of this ability. Before attempting to make any potion you must have immediate access to the material components (if any) of the spell that the potion most resembles. (potion of healing=cure wounds etc.)" };

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
