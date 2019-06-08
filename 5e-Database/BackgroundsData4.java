public class BackgroundsData4 {	
	private String name = "Afflicted";
	private int index = 4;
	private Object[] skillproficiencies = {
			"Intimidation","Persuasion"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			"One tool of any sort"
	};
	private Object[] languages= {
			1, "language of your choice"
	};
	private Object[] equipment= {
			"A medical device (A mask, crutch, brace, etc.) you use to maintain some comfort",
			"a set of common clothes", 
			"a bag",
			"a blank",
			"notebook",
			"a belt pouch containing 5gp"
	};
	private String desc ="People feel your pain. Even if they have never been through anything like what happened to you, they can somehow empathize. People will take pity on you, opting to reduce your suffering if they can, or at least choosing not to inflict any more suffering upon you. This can range from a farmer letting you spend the night in his barn, to a jailer who is cruel to everyone else, but simply neglectful of you.";
	
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
