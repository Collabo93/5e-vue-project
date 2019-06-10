public class BackgroundsData4 {	
	private String name = "Afflicted";
	private int index = 4;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Intimidation","Persuasion"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies= {
			"One tool of any sort"
	};
	private int languagesChoose = 1;
	private String[] languages= {
			"language of your choice"
	};
	private String[] equipment= {
			"A medical device (A mask, crutch, brace, etc.) you use to maintain some comfort",
			"a set of common clothes", 
			"a bag",
			"a blank",
			"notebook",
			"a belt pouch containing 5gp"
	};
	private int descChoose = 1;
	private String[] descNames = {
			"Pity",
			"Fear"
	};
	private String[] desc = {
			"People feel your pain. Even if they have never been through anything like what happened to you, they can somehow empathize. People will take pity on you, opting to reduce your suffering if they can, or at least choosing not to inflict any more suffering upon you. This can range from a farmer letting you spend the night in his barn, to a jailer who is cruel to everyone else, but simply neglectful of you.",
			"Your condition is so severe it dehumanizes you. People have difficulties identifying your gender or race. Some may mistake you for a monster. Children run, babies cry, and people slam doors in your face. On the other hand, you are the master of clearing a room. Nobody knows what's wrong with you, but most people are too afraid to find out! A menacing look or an impossible threat could come across as believable from you, and people might just go along with it because they'd rather not see what happens if you actually spit in the well."
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
