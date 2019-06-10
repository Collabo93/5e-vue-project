public class BackgroundsData13 {
	private String name = "Apothecary";
	private int index = 13;
	private int skillproficienciesChoose = 2;
	private String[] skillproficiencies = {
			"Medicine","Nature"
	};
	private int weaponproficienciesChoose = 0;
	private String[] weaponproficiencies = {
			
	};
	private int toolproficienciesChoose = 1;
	private String[] toolproficiencies= {
			"Herbalism kit"
	};
	private int languagesChoose = 1;
	private String[] languages= {
			"language of your choice"
	};
	private String[] equipment= {
			"Herbalism kit",
			"a merchant’s scale",
			"a set of common clothes",
			"a belt pouch containing 10 gp",
	};
	private int descChoose = 1;
	private String[] descNames = {
			"Medical Profession"
	};
	private String[] desc = {
			"You have a reputation as a healer of the sick, and are often called upon by those who are diseased or injured. You can usually gain an audience with anyone who needs treatment — even if protocol would normally prevent you from doing so — simply by agreeing to offer your assistance. By spending a few moments examining a chemical — a vial of liquid, a packet of ground powder, or the like — you can determine whether the substance is intended to harm or heal (or neither). This examination does not reveal any specific information about the substance(such as that a powder is actually an inhaled poison, or that it paralyzes its victim), only that it is either harmful or helpful to those that it is used on."
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
