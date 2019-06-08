public class BackgroundsDataName {
	private String url="http://localhost:8080/5e-Database/resources/backgrounds/";
	private String[][] backgrounds= {
			{"Adept",""},
			{"Adopted",""},		
			{"Adventurer",""},
			{"Afflicted",""},
			{"Air Acrobat",""},
			{"Alchemic Construct",""},
			{"Alchemist",""},
			{"Alcoholic",""},
			{"Alcoholic Scientist",""},
			{"Amnesiac",""},
			{"Ancient Cultist",""},
			{"Antiquarian",""},
			{"Apothecary",""},
			{"Arcana Spy",""},
			{"Arcane Dominion",""},
			{"Armed Escort",""},
			{"Artist",""},
			{"Arvoreen Keeper",""},
			{"Aspirant",""},
			{"Astronaut",""},
			//Need to the add the rest at some point	
	};
	public BackgroundsDataName() {
		for (int i=0;i<backgrounds.length;i++) {
			backgrounds[i][1]=url+(i+1);
		}
	}
	
	public String[][] getBackgroundsData() {
		return backgrounds;
	}
}
