public class BackgroundsData17 implements BackgroundsData {
	private String name = "Arvoreen Keeper";
	private int index = 17;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = { "Insight", "Religion" };
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {

	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies = { "Thieves' tools" };
	private int languagesChoose = 1;
	private String[] languages = { "choice" };
	private String[] equipment = { "An insignia denoting your status as a Keeper", "ball bearings", "manacles",
			"a set of traveler’s clothes", "a pouch of 15 gold coins" };
	private int descChoose = 1;
	private String[] descNames = { "Protector of the Good Folk" };
	private String[] desc = {
			"Keepers command the fidelity and respect of halflings everywhere, who love the keepers for keeping them safe. Neutral Halflings are always considered to be friendly toward you unless you have proven yourself to be a danger to them. Additionally, you and your adventuring companions can expect to receive free healing and care at a temple, shrine, or other established presence of your faith, though you must provide any material components needed for spells." };

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
