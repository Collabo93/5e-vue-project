public class BackgroundsData12 {
	private String name = "Antiquarian";
	private int index = 12;
	private Object[] skillproficiencies = {
			"History","Investigation"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			"Calligrapher's supplies"
	};
	private Object[] languages= {
			1, "language of your choice"
	};
	private Object[] equipment= {
			"A bottle of black ink",
			"a quill",
			"a tome that appears to contain the history of an unknown settlement or culture",
			"a set of traveler's clothes (Indiana Jones hat Included)",
			"a belt pouch containing 10 gp"
	};
	private String desc ="You are a member of a respected museum, university, or other organization that preserves relics of ages past. You can gain access to the facilities where such antiquities are stored and can participate in their study. You may be allowed to accompany expeditions seeking to explore ruins or retrieve items of historical interest, if your area of expertise is relevant to the task at hand.";
	
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
