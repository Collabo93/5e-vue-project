public class BackgroundsData5 {	
	private String name = "Air Acrobat";
	private int index = 5;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Acrobatics","Performance"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies= {
			"One type of artisan's tools"
	};
	private int languagesChoose = 1;
	private String[] languages= {
			"Auran"
	};
	private String[] equipment= {
			"a pair of Aviator's Goggles",
			"a set of clothing custom-tailored for the purpose of flight safetys", 
			"a pouch containing 10gp"
	};
	private int descChoose = 1;
	private String[] descNames = {
			"Unmatched Flight"
	};
	private String[] desc = {
			"Being an Air Acrobat takes years of practice and dedication. It is extremely difficult to master the art of flight, but it does come with its benefits in the long run. Because of your constant exposure to the atmosphere and high altitudes, you are acclimated to Extreme Cold, as described in the Dungeon Master’s Guide (page 110). You also have an abnormally strong pair of lungs, which in turn allows you to hold your breath longer that the average creature.\r\n" + 
			"\r\n" + 
			"Your speed and technique in the air is also unrivaled compared to other creatures, and so performing using your talents is something you've learned to take advantage of. When in a town or village, you can find an elevated area in the town, such as the top of a tall tower or a hill, to put on a performance of intense acrobatic moves in the sky. When rolling to determine the success of your flying extravaganza, you can choose to treat it as either a Performance skill check or an Acrobatics skill check. If your flying act is a success, you receive free lodging and food at a comfortable standard somewhere in the town or village, as long as you perform once per day. In addition, a successful performance makes you the talk of the town. When strangers encounter you in a town where you have performed, they will recognize you and take a liking to you, maybe even starting a conversation with you or asking for an autograph."
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
