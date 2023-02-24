package AutowireAnnotation;

public class Address {
		String name;
		String district;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		@Override
		public String toString() {
			return "Address [name=" + name + ", district=" + district + "]";
		}
		
}
