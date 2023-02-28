package annotationBasedConfiguration;

//without name this component will give default bean name as sweets
public class Sweets {
	private int cost;
	private String seller;
	private Water bisleri;
	Sweets(int cost, String seller, Water bisleri){
		this.cost = cost;
		this.seller  = seller;
		this.bisleri = bisleri;
	}
	
	@Override
	public String toString() {
		return "Sweets [cost=" + cost + ", seller=" + seller + ", bisleri=" + bisleri + "]";
	}
	
	
}
