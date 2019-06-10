public class BackgroundsData10 {
	private String name = "Amnesiac";
	private int index = 10;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Perception","Investigation"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 2;
	private String[] toolproficiencies= {
			"One musical instrument or gaming set", "one weapon"
	};
	private int languagesChoose = 1;
	private String[] languages= {
			"language of your choice"
	};
	private String[] equipment= {
			"Two trinkets from your past",
			"one weapon you are proficient with",
			"a set of commoner's clothes",
			"a belt pouch containing 5 GP"
	};
	private int descChoose = 1;
	private String[] descNames = {
			"Deja Vu",
			"Oh, I know that!",
	};
	private String[] desc = {
			"You suddenly remember a huge amount of detail about a person, place or thing that you are currently looking at or interacting with without knowing why. Maybe a certain phrase or image sets you off, but you suddenly know all about this thing like you've been familiar with it for years. Any Insight, Investigation or History checks you make relating to this thing are done with advantage. You can use this feature three times per campaign and/or per character.",
			"Despite your amnesia, you clearly remember one specific field of knowledge, lore, or something else. Choose the field you want your character to know and write it down on your character sheet. If you fail your History roll regarding that field of knowledge, you can consult for the answer regardless unless it is otherwise impossible to know about it (i.e. it's unknown)"
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
