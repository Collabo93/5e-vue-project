public class BackgroundsData19 {
	private String name = "Astronaut";
	private int index = 19;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Acrobatics", "Arcana"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 2;
	private String[] toolproficiencies= {
			"One set of artisan's tools", "vehicles (air)"
	};
	private int languagesChoose = 0;
	private String[] languages= {
			
	};
	private String[] equipment= {
			"A bottle of black ink",
			"a quill",
			"a map of constellations",
			"a damaged blueprint for a huge ship written in an undecipherable code",
			"a set of artisan's tools",
			"a set of traveler's clothes",
			"and a pouch containing 10 gp"
	};
	private int descChoose = 1;
	private String[] descNames = {
			"Celestial Contacts",
			"Constellations"
	};
	private String[] desc = {
			"You worked with a crew for a long time. A bond created with crew-members is (mostly) an unbreakable one. If you can get in contact with one of your crew-members, they usually feel obliged to help you. Whenever it's a place to stay, a companion for combat, or help with a dungeon's puzzle or code. Renting a spaceship however, is impossible unless the situation is absolutely dire. And even then is incredibly difficult and it always takes a long time to prepare a ship.",
			"If you work alone, you may not have any contacts to help you on your adventures. But, you can recall certain constellations and their effects on the Material Plane. Work with your DM to create a list of constellations and how they affect you and your party members (positively and negatively), when they appear, and if the effects are proven to be consistent or not."
	};
	
	public String GetJSON() {
		XMLFactoryBackgrounds XMLFactoryBackgrounds = new XMLFactoryBackgrounds(
				name, index, 
				skillproficienciesChoose, skillproficiencies, 
				weaponproficienciesChoose, weaponproficiencies,
				toolproficienciesChoose,toolproficiencies,
				languagesChoose,languages,
				equipment,
				descChoose,descNames,desc);		
		
		return XMLFactoryBackgrounds.GetJSON();
	}
}
