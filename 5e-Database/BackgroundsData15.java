public class BackgroundsData15 {
	private String name = "Arcane Dominion";
	private int index = 15;
	private Object[] skillproficiencies = {
			"Arcana","Investigation"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			"Two of your choice"
	};
	private Object[] languages= {
			"none"
	};
	private Object[] equipment= {
			"A set of fine clothes",
			"a vial of black ink",
			"a quill",
			"traveling journal",
			"dagger",
			"copy of your favorite book",
			"a belt pouch containing 15 gp"
	};
	private String desc ="With time being money in your line of work, it is important to copy everything down quickly. When you come across written spells, you can take time to create a non-magical Spell Scroll of the spell. The scroll can be used to copy the spell to other sources at a later date but cannot be used to produce the spell itself. The time taken to create the scroll is equal to 5 minutes times spell level (Cantrips take 2 minutes)\";\r\n" + 
			"	";
	
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
