public class BackgroundsData7 {	
	private String name = "Alchemist";
	private int index = 7;
	private Object[] skillproficiencies = {
			"Arcana","Survival"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			"Alchemist's Supplies"
	};
	private Object[] languages= {
			1, "language of your choice"
	};
	private Object[] equipment= {
			"Alchemist's supplies",
			"1d4+2 Books on Alchemical Formula", 
			"a belt pouch with 2d4 GP",
			"common clothes"
	};
	private String desc ="During the course of a rest you may make an Intelligence check to make a potion of any rarity. The DC of this roll depends on the rarity of the potion you intend to make(Magic items): DC10 for common, DC15 for uncommon, DC20 for rare, and DC25 for very rare. You must be unbound and have access to your alchemical supplies to make use of this ability. Before attempting to make any potion you must have immediate access to the material components (if any) of the spell that the potion most resembles. (potion of healing=cure wounds etc.)";
			
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
