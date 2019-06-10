public class BackgroundsData8 {	
	private String name = "Alcoholic";
	private int index = 8;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Sleight of Hand","Medicine"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies= {
			"Brewer's Tools", "Thieves' Tools"
	};
	private int languagesChoose = 0;
	private String[] languages= {
			
	};
	private String[] equipment= {
			"A flask filled with your favorite alcohol",
			"a memento of your life before alcohol", 
			"common clothes",
			"a heavy blanket",
			"a pouch with 5 sp"
	};
	private int descChoose = 1;
	private String[] descNames = {
			"Temperance",
			"Pitiful",
			"Strong-headed"
	};
	private String[] desc = {
			"Having already struggled through addiction in the past you know how to identify the signs of addiction, and are better equipped to quit other addictions or help others through their addictions. Your demeanor after giving up alcohol may also affect the way different people interact with you.",
			"You love alcohol far too much, and find yourself forgoing inns for the tavern. As such, you have garnered a form of condescending pity from people and can typically find a place to stay on the condition that you do not drink for the duration of your stay. Whether you hold up your end of the bargain or not is up to you.",
			"You are extremely tolerant of alcohol and have advantage on Constitution checks related to alcohol. You also can consume 3 times that of most people before feeling even a little tipsy."
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
