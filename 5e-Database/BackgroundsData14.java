public class BackgroundsData14 {
	private String name = "Arcana Spy";
	private int index = 14;
	private Object[] skillproficiencies = {
			"Arcana","Stealth"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			2, "Thieves' Tools", "Calligrapher's Supplies"
	};
	private Object[] languages= {
			"none"
	};
	private Object[] equipment= {
			"Thieves' Tools",
			"a Grappling Hook",
			"Hempen Rope",
			"aa Scholar's Pack",
			"a 100 page journal",
			"raveler's Clothes",
			"a Hooded Cloak",
			"a Small Pouch containing 15gp"
	};
	private String desc ="With time being money in your line of work, it is important to copy everything down quickly. When you come across written spells, you can take time to create a non-magical Spell Scroll of the spell. The scroll can be used to copy the spell to other sources at a later date but cannot be used to produce the spell itself. The time taken to create the scroll is equal to 5 minutes times spell level (Cantrips take 2 minutes)";
	
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
