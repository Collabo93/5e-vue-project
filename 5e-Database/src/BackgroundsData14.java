public class BackgroundsData14 implements BackgroundsData {
	private String name = "Arcana Spy";
	private int index = 14;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = { "Arcana", "Stealth" };
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {};
	private int toolproficienciesChoose = 2;
	private String[] toolproficiencies = { "Thieves' Tools", "Calligrapher's Supplies" };
	private int languagesChoose = 0;
	private String[] languages = {

	};
	private String[] equipment = { "Thieves' Tools", "a Grappling Hook", "Hempen Rope", "aa Scholar's Pack",
			"a 100 page journal", "raveler's Clothes", "a Hooded Cloak", "a Small Pouch containing 15gp" };
	private int descChoose = 1;
	private String[] descNames = { "Spell Scribe" };
	private String[] desc = {
			"With time being money in your line of work, it is important to copy everything down quickly. When you come across written spells, you can take time to create a non-magical Spell Scroll of the spell. The scroll can be used to copy the spell to other sources at a later date but cannot be used to produce the spell itself. The time taken to create the scroll is equal to 5 minutes times spell level (Cantrips take 2 minutes)" };

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
