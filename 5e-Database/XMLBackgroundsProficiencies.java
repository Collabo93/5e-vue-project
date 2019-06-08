import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XMLBackgroundsProficiencies {
	private Object[] name;
	
	public XMLBackgroundsProficiencies() {
		
	}
	
	public XMLBackgroundsProficiencies(Object[] name) {
		super();
		this.name = name;
	}

	public Object[] getName() {
		return name;
	}

	public void setName(Object[] name) {
		this.name = name;
	}
	
	
}
