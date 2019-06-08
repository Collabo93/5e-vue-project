public class BackgroundsData19 {
	private String name = "Astronaut";
	private int index = 19;
	private Object[] skillproficiencies = {
			"Acrobatics", "Arcana"
	};
	private Object[] weaponproficiencies = {
			"none"
	};
	private Object[] toolproficiencies= {
			"One set of artisan's tools", "vehicles (air)"
	};
	private Object[] languages= {
			"none"
	};
	private Object[] equipment= {
			"A bottle of black ink",
			"a quill",
			"a map of constellations",
			"a damaged blueprint for a huge ship written in an undecipherable code",
			"a set of artisan's tools",
			"a set of traveler's clothes",
			"and a pouch containing 10 gp"
	};
	private String desc ="You worked with a crew for a long time. A bond created with crew-members is (mostly) an unbreakable one. If you can get in contact with one of your crew-members, they usually feel obliged to help you. Whenever it's a place to stay, a companion for combat, or help with a dungeon's puzzle or code. Renting a spaceship however, is impossible unless the situation is absolutely dire. And even then is incredibly difficult and it always takes a long time to prepare a ship.";
	
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
