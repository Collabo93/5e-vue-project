public class BackgroundsData13 implements BackgroundsData {
	private String name = "Apothecary";
	private int index = 13;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = { "Medicine", "Nature" };
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {

	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies = { "Herbalism kit" };
	private int languagesChoose = 1;
	private String[] languages = { "language of your choice" };
	private String[] equipment = { "Herbalism kit", "a merchant’s scale", "a set of common clothes",
			"a belt pouch containing 10 gp", };
	private int descChoose = 1;
	private String[] descNames = { "Medical Profession" };
	private String[] desc = {
			"You have a reputation as a healer of the sick, and are often called upon by those who are diseased or injured. You can usually gain an audience with anyone who needs treatment — even if protocol would normally prevent you from doing so — simply by agreeing to offer your assistance. By spending a few moments examining a chemical — a vial of liquid, a packet of ground powder, or the like — you can determine whether the substance is intended to harm or heal (or neither). This examination does not reveal any specific information about the substance(such as that a powder is actually an inhaled poison, or that it paralyzes its victim), only that it is either harmful or helpful to those that it is used on." };

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
