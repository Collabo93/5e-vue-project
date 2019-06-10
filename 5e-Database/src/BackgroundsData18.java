public class BackgroundsData18 {
	private String name = "Aspirant";
	private int index = 18;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Performance", "History"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies= {
			"Calligrapher tools", "Disguise Kit"
	};
	private int languagesChoose = 1;
	private String[] languages= {
			"language that your idol knows"
	};
	private String[] equipment= {
			"A bottle of black ink",
			"a quill",
			"a tome",
			"scrolls with the legends of your idol written out",
			"common clothes",
			"a costume inspired by your idol",
			"and a belt pouch containing 10 gp"
	};
	private int descChoose = 1;
	private String[] descNames = {
			"Just like in the Stories"
	};
	private String[] desc = {
			"Considering how often their idol’s legacy is on their mind, aspiriants are always trying to find connections between their lives and the folklore surrounding their idol.\r\n" + 
	
			"\r\n" + 
			"Roll a D10. If you roll a 9 or 10, your current situation bears an uncanny resemblance to one your idol was in. What this means is completely up to the discretion of the DM. You may remember a weakness that your idol exposed against a similar enemy or meet a new person in the same way your idol met their love interest meaning you know that new person's motives.\r\n" + 
			"\r\n" + 
			"This may be rolled whenever you make a check where you are experiencing something \"for the first time\". Examples of this include the first time you meet a new NPC, the first time you visit a new location, the first time you see a quest specific item, etc."
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
