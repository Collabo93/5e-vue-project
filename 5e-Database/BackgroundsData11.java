public class BackgroundsData11 {
	private String name = "Ancient Cultist";
	private int index = 11;
	private Object[] skillproficiencies = {
			"Arcana","Religion"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			"Torturer's kit"
	};
	private Object[] languages= {
			"Deep Speech"
	};
	private Object[] equipment= {
			"A set of traveler's clothes",
			"your cult’s identification mark",
			"a marked dagger",
			"a pouch containing 10 gp"
	};
	private String desc ="Thanks to your long affiliation with your cult, you can easily identify members of other cults that follow an esoteric entity like that of yours. This does not mean that you are held in high standing with such cults: the field of hidden worship is often a competitive one, and an adherent of one creed might stand in bloody opposition to a faithful of another. Nonetheless, you have insight into the nature of hidden religions and can usually recognize the basic features of any given cult.";
	
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
