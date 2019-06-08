public class BackgroundsData17 {
	private String name = "Arvoreen Keeper";
	private int index = 17;
	private Object[] skillproficiencies = {
			"Insight", "Religion"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			"Thieves' tools"
	};
	private Object[] languages= {
			1, "language of your choice"
	};
	private Object[] equipment= {
			"An insignia denoting your status as a Keeper",
			"ball bearings",
			"manacles",
			"a set of traveler’s clothes",
			"a pouch of 15 gold coins"
	};
	private String desc ="Keepers command the fidelity and respect of halflings everywhere, who love the keepers for keeping them safe. Neutral Halflings are always considered to be friendly toward you unless you have proven yourself to be a danger to them. Additionally, you and your adventuring companions can expect to receive free healing and care at a temple, shrine, or other established presence of your faith, though you must provide any material components needed for spells.";
			
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
