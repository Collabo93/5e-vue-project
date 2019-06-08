public class BackgroundsData10 {
	private String name = "Amnesiac";
	private int index = 10;
	private Object[] skillproficiencies = {
			"Perception","Investigation"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			2, "One musical instrument or gaming set", "one weapon"
	};
	private Object[] languages= {
			1, "language of your choice"
	};
	private Object[] equipment= {
			"Two trinkets from your past",
			"one weapon you are proficient with",
			"a set of commoner's clothes",
			"a belt pouch containing 5 GP"
	};
	private String desc ="You suddenly remember a huge amount of detail about a person, place or thing that you are currently looking at or interacting with without knowing why. Maybe a certain phrase or image sets you off, but you suddenly know all about this thing like you've been familiar with it for years. Any Insight, Investigation or History checks you make relating to this thing are done with advantage. You can use this feature three times per campaign and/or per character.";
	
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
