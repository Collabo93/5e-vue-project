public class BackgroundsData15 {
	private String name = "Arcane Dominion";
	private int index = 15;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Arcana","Investigation"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 2;
	private String[] toolproficiencies= {
			"tool of your choice"
	};
	private int languagesChoose = 0;
	private String[] languages= {
			
	};
	private String[] equipment= {
			"A set of fine clothes",
			"a vial of black ink",
			"a quill",
			"traveling journal",
			"dagger",
			"copy of your favorite book",
			"a belt pouch containing 15 gp"
	};
	private int descChoose = 1;
	private String[] descNames = {
			"Network of Knowledge"
	};
	private String[] desc = {
			"With time being money in your line of work, it is important to copy everything down quickly. When you come across written spells, you can take time to create a non-magical Spell Scroll of the spell. The scroll can be used to copy the spell to other sources at a later date but cannot be used to produce the spell itself. The time taken to create the scroll is equal to 5 minutes times spell level (Cantrips take 2 minutes)\";\r\n" + 
			"	"
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
