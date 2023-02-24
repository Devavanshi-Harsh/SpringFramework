package AutowireXML;

public class Emp {
	Address address;
	String Name;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + ", Name=" + Name + "]";
	}

}
