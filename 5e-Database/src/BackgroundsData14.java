public class BackgroundsData14 {
	private String name = "Arcana Spy";
	private int index = 14;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Arcana","Stealth"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			"none"
	};
	private int toolproficienciesChoose = 2;
	private String[] toolproficiencies= {
			"Thieves' Tools", "Calligrapher's Supplies"
	};
	private int languagesChoose = 0;
	private String[] languages= {
			
	};
	private String[] equipment= {
			"Thieves' Tools",
			"a Grappling Hook",
			"Hempen Rope",
			"aa Scholar's Pack",
			"a 100 page journal",
			"raveler's Clothes",
			"a Hooded Cloak",
			"a Small Pouch containing 15gp"
	};
	private int descChoose = 1;
	private String[] descNames = {
			"Spell Scribe"
	};
	private String[] desc = {
			"With time being money in your line of work, it is important to copy everything down quickly. When you come across written spells, you can take time to create a non-magical Spell Scroll of the spell. The scroll can be used to copy the spell to other sources at a later date but cannot be used to produce the spell itself. The time taken to create the scroll is equal to 5 minutes times spell level (Cantrips take 2 minutes)"
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
