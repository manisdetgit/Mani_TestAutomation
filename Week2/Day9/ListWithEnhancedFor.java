package programs.Day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class City{
	private String name;
	private long pincode;
	private String CapitalCity;
	
	//constructor
	public City(String name, long pincode, String capitalCity) {
		super();
		this.name = name;
		this.pincode = pincode;
		CapitalCity = capitalCity;
	}
	
	//getter, setter - TBD
	
	//toString
	@Override
	public String toString() {
		return "City [name=" + name + ", pincode=" + pincode + ", CapitalCity=" + CapitalCity + "]";
	}
	
		
	
}

public class ListWithEnhancedFor {

	public static void main(String[] args) {
		//create List
		List<City> cities = new ArrayList<City>();
		
		//add City Objects to List
		
		cities.add(new City("city1", 1234, "Capital1"));
		cities.add(new City("city2", 2234, "Capital2"));
		cities.add(new City("city3", 3234, "Capital3"));
		
		//iterate with enhanced for
		System.out.println("-------------------------------iterate with enhanced for-------------------------");
		for(City c: cities) {
			System.out.println(c);
		}
		
		//iterate with for
		System.out.println("-------------------------------iterate with for-------------------------");
		for(int i = 0; i<cities.size();i++) {
			System.out.println(cities.get(i));
		}
		
	}
}
