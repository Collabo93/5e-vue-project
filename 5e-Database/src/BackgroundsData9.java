public class BackgroundsData9 {	
	private String name = "Alcoholic Scientist";
	private int index = 9;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Perception","Investigation"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 2;
	private String[] toolproficiencies= {
			"Tinker’s tools", "Calligrapher's supplies"
	};
	private int languagesChoose = 0;
	private String[] languages= {
			
	};
	private String[] equipment= {
			"A backpack",
			"a set of lab coats", 
			"a bedroll",
			"a pouch containing 15 gp",
			"lab notes on the experiment",
			"three flasks of alcohol",
			"three empty flasks",
			"an ink bottle",
			"a feather pen",
			"a chess set"
	};
	private int descChoose = 1;
	private String[] descNames = {
			"Intoxicated Teacher"
	};
	private String[] desc = {
			"You drink. A lot. No, really, you have a serious problem. Unfortunately in terms of your recovery, you've found that drinking, to a certain extent, helps organize your slightly scattered mind, and makes previously difficult to understand concepts easier to parse and work through. While drunk, your character is somehow able to find just the right words to explain any concept related to your scientific domain, no matter how complicated, in simple enough terminology that anyone listening will be able to garner at least a basic understanding of it."
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
