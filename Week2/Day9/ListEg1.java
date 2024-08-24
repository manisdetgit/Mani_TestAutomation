package programs.Day9;

import java.util.*;

class City1{
	private String name;
	private long pincode;
	private String state;
	
	//constructor
	public City1(String name, long pincode, String capital_city) {
		this.name = name;
		this.pincode = pincode;
		this.state = capital_city;
	}
	
	//getter, setter - TBD
	
	//toString
	@Override
	public String toString() {
		return "City [name=" + name + ", pincode=" + pincode + ", state=" + state + "]";
	}
}

public class ListEg1 {
public static void main(String[] args) {
	//create List
	List<City1> cities = new LinkedList<City1>();
	Scanner scnr = new Scanner(System.in);
	
	//add City objects to List
	cities.add(new City1("city1", 1234, "capital1"));
	cities.add(new City1("city2", 3456, "capital2"));
	
	System.out.println("Please enter city name");
	String icity = scnr.next();
	
	System.out.println("Please enter pincode");
	long ipincode = scnr.nextLong();
	
	System.out.println("Please enter State name");
	String istate = scnr.next();
	
	cities.add(new City1(icity, ipincode, istate));
	
	//iterate and display
	Iterator<City1> itr = cities.iterator();
	
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	
}
}
