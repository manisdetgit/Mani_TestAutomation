package programs.Day9;

import java.util.*;

class City2{
	private String name;
	private long pincode;
	private String state;
	
	//constructor
	public City2(String name, long pincode, String capital_city) {
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

public class ListEg2 {
public static void main(String[] args) {
	//create List
	List<City2> cities = new LinkedList<City2>();
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Please enter number of cities");
	int n = scnr.nextInt();
	
	//add City objects to List
		
	for(int i=1;i<=n;i++) {
	System.out.println("Please enter city"+i+" name");
	String icity = scnr.next();
	
	System.out.println("Please enter pincode"+i);
	long ipincode = scnr.nextLong();
	
	System.out.println("Please enter State"+i+" name");
	String istate = scnr.next();
	
	cities.add(new City2(icity, ipincode, istate));
	}
	//iterate and display
	Iterator<City2> itr = cities.iterator();
	
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	
}
}
