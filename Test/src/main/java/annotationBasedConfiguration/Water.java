package annotationBasedConfiguration;

public class Water {
		public int cost;
		public String name;
		Water(int cost, String name){
			this.cost = cost;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "Water [cost=" + cost + ", name=" + name + "]";
		}
		
}
