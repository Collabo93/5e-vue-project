public class BackgroundsData13 {
	private String name = "Apothecary";
	private int index = 13;
	private Object[] skillproficiencies = {
			"Medicine","Nature"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			"Herbalism kit"
	};
	private Object[] languages= {
			1, "language of your choice"
	};
	private Object[] equipment= {
			"Herbalism kit",
			"a merchant’s scale",
			"a set of common clothes",
			"a belt pouch containing 10 gp",
	};
	private String desc ="You have a reputation as a healer of the sick, and are often called upon by those who are diseased or injured. You can usually gain an audience with anyone who needs treatment — even if protocol would normally prevent you from doing so — simply by agreeing to offer your assistance. By spending a few moments examining a chemical — a vial of liquid, a packet of ground powder, or the like — you can determine whether the substance is intended to harm or heal (or neither). This examination does not reveal any specific information about the substance(such as that a powder is actually an inhaled poison, or that it paralyzes its victim), only that it is either harmful or helpful to those that it is used on.";
	
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
