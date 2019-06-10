public class BackgroundsData12 {
	private String name = "Antiquarian";
	private int index = 12;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"History","Investigation"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies= {
			"Calligrapher's supplies"
	};
	private int languagesChoose = 1;
	private String[] languages= {
			"language of your choice"
	};
	private String[] equipment= {
			"A bottle of black ink",
			"a quill",
			"a tome that appears to contain the history of an unknown settlement or culture",
			"a set of traveler's clothes (Indiana Jones hat Included)",
			"a belt pouch containing 10 gp"
	};
	private int descChoose = 1;
	private String[] descNames = {
			"descNames"
	};
	private String[] desc = {
			"You are a member of a respected museum, university, or other organization that preserves relics of ages past. You can gain access to the facilities where such antiquities are stored and can participate in their study. You may be allowed to accompany expeditions seeking to explore ruins or retrieve items of historical interest, if your area of expertise is relevant to the task at hand."
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
