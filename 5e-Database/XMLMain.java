import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XMLMain {
	private int count;
	private Object[] results;
	
	public XMLMain() {
		
	}
	

	public XMLMain(int count, Object[] results) {
		super();
		this.count = count;
		this.results = results;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Object[] getResults() {
		return results;
	}

	public void setResults(Object[] results) {
		this.results = results;
	}
	
	
}
