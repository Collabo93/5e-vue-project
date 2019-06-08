public class BackgroundsData1 {
	private String name = "Adept";
	private int index = 1;
	private Object[] skillproficiencies = {
			1
	};
	private Object[] weaponproficiencies = {
			"simple weapon"
	};
	private Object[] toolproficiencies= {
			"tool kit"
	};
	private Object[] languages= {
			1, "standart language"
	};
	private Object[] equipment= {
			"none"
	};
	private String desc ="People of your birth race, and of the race of your adoptive family (with the possible exception of you family/s) find it harder to trust you. Those of the race you are will take longer to trust you because they think you have been corrupted or on the side of the race of your adoptive family and no longer share their values. People who are the same race of your adoptive family may take longer to trust you because they believe that you will always be one of your race, no matter how you were brought up. Due to this ostracization, races that are not of your birth or adopted tend to take you with a bit more kindness.";
	
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
