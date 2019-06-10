public class BackgroundsData11 {
	private String name = "Ancient Cultist";
	private int index = 11;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Arcana","Religion"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies= {
			"Torturer's kit"
	};
	private int languagesChoose = 1;
	private String[] languages= {
			"Deep Speech"
	};
	private String[] equipment= {
			"A set of traveler's clothes",
			"your cult’s identification mark",
			"a marked dagger",
			"a pouch containing 10 gp"
	};
	private int descChoose = 1;
	private String[] descNames= {
			"One of the Family"
	};
	private String[] desc = {
			"Thanks to your long affiliation with your cult, you can easily identify members of other cults that follow an esoteric entity like that of yours. This does not mean that you are held in high standing with such cults: the field of hidden worship is often a competitive one, and an adherent of one creed might stand in bloody opposition to a faithful of another. Nonetheless, you have insight into the nature of hidden religions and can usually recognize the basic features of any given cult."
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
