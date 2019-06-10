public class BackgroundsData16 {
	private String name = "Armed Escort";
	private int index = 16;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Nature", "Survival", "Persuasion", "Intimidation"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies= {
			"Vehicle"
	};
	private int languagesChoose = 1;
	private String[] languages= {
			"language of your choice"
	};
	private String[] equipment= {
			"A set of traveler’s clothes",
			"leather poncho",
			"hooded pole lantern",
			"2 oil flask",
			"a leather case with a few drawn road maps",
			"and a belt pouch containing 10gp"
	};
	private int descChoose = 1;
	private String[] descNames = {
			"Eyes on the road"
	};
	private String[] desc = {
			"As an armed escort, you value information as anybody else. Before you start a journey you can spend a number of hours equal to 1d4 to ascertain information from people in settlements, villages, towns or cities that might be helpful for you on the road ahead. You may ask for a number of information equal to 2d4. The information shared are mundane, at the DM's discretion. For example you may ask the DM, what terrain you can expect on the journey, what type of hostile creatures you may encounter in the area, or historical and lore related significance or locally known pathways."
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
