public class BackgroundsData17 {
	private String name = "Arvoreen Keeper";
	private int index = 17;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Insight", "Religion"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies= {
			"Thieves' tools"
	};
	private int languagesChoose = 1;
	private String[] languages= {
			"language of your choice"
	};
	private String[] equipment= {
			"An insignia denoting your status as a Keeper",
			"ball bearings",
			"manacles",
			"a set of traveler’s clothes",
			"a pouch of 15 gold coins"
	};
	private int descChoose = 1;
	private String[] descNames = {
			"Protector of the Good Folk"
	};
	private String[] desc = {
			"Keepers command the fidelity and respect of halflings everywhere, who love the keepers for keeping them safe. Neutral Halflings are always considered to be friendly toward you unless you have proven yourself to be a danger to them. Additionally, you and your adventuring companions can expect to receive free healing and care at a temple, shrine, or other established presence of your faith, though you must provide any material components needed for spells."
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
