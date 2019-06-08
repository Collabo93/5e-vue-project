public class BackgroundsData3 {	
	private String name = "Adventurer";
	private int index = 3;
	private Object[] skillproficiencies = {
			"Athletics","Perception"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			"Thieves' Tools"
	};
	private Object[] languages= {
			1, "language of your choice"
	};
	private Object[] equipment= {
			"A wooden training sword, a set of traveler's clothes",
			"a cloak", 
			"a shovel",
			"a crowbar",
			"a trophy from your first adventure",
			"a small pouch containing 15g"
	};
	private String desc ="You can always find a job, but somehow you can never find a place to sleep. People know you`re good for the work, but the fact that you are indicates that you`re probably not the sort of person they want to have around. People view adventurers in a mixed light with conflicting values. On the one hand, most adventurers are nothing more than murderous, grave-robbing vagrants. On the other hand, who else will rob that grave and murder those local bullies for you? Most common folk consider adventurers to be dangerous, unpredictable, and probably insane... But in a world filled with slavers, mad cults, dragons, walking dead, pit fiends, and extradimensional horrors, just about everyone could find a use for a psychotic sell-sword. Adventurers who survive and reach higher renown may find they have a small following of supporters or fans, but even they may cringe at the idea of that adventurer spending an evening in their home. Most adventurers by profession are members of an adventurers guild through which they can readily attain professional work and contacts in the field.";
	
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
