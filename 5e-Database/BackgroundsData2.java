public class BackgroundsData2 {	
	private String name = "Adopted";
	private int index = 2;
	private Object[] skillproficiencies = {
			"Persuasion","Deception","Stealth"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			"none"
	};
	private Object[] languages= {
			1, "language spoken by your adoptive family"
	};
	private Object[] equipment= {
			"A set of common clothes matching the style worn by your current family",
			"something of a trinket left from your birth parents (cannot be worth more than 5gp)",
			"pouch with 10gp"
	};
	private String desc ="People of your birth race, and of the race of your adoptive family (with the possible exception of you family/s) find it harder to trust you. Those of the race you are will take longer to trust you because they think you have been corrupted or on the side of the race of your adoptive family and no longer share their values. People who are the same race of your adoptive family may take longer to trust you because they believe that you will always be one of your race, no matter how you were brought up. Due to this ostracization, races that are not of your birth or adopted tend to take you with a bit more kindness.";
	
	public String getName() {
		return name;
	}
	public int getIndex() {
		return index;
	}	
	public Object[] getSkillproficiencies() {
		return skillproficiencies;
	}
	public Object[] getWeaponproficiencies() {
		return weaponproficiencies;
	}
	public Object[] getToolproficiencies() {
		return toolproficiencies;
	}
	public Object[] getLanguages() {
		return languages;
	}
	public Object[] getEquipment() {
		return equipment;
	}
	public String getDesc() {
		return desc;
	}
}
