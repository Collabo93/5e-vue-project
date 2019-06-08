public class BackgroundsData9 {	
	private String name = "Alcoholic Scientist";
	private int index = 9;
	private Object[] skillproficiencies = {
			"Perception","Investigation"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			2, "Tinker’s tools", "Calligrapher's supplies"
	};
	private Object[] languages= {
			"none"
	};
	private Object[] equipment= {
			"A backpack",
			"a set of lab coats", 
			"a bedroll",
			"a pouch containing 15 gp",
			"lab notes on the experiment",
			"three flasks of alcohol",
			"three empty flasks",
			"an ink bottle",
			"a feather pen",
			"a chess set"
	};
	private String desc ="You drink. A lot. No, really, you have a serious problem. Unfortunately in terms of your recovery, you've found that drinking, to a certain extent, helps organize your slightly scattered mind, and makes previously difficult to understand concepts easier to parse and work through. While drunk, your character is somehow able to find just the right words to explain any concept related to your scientific domain, no matter how complicated, in simple enough terminology that anyone listening will be able to garner at least a basic understanding of it.";
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
