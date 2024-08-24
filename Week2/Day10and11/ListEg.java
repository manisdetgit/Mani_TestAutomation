package programs.Day11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

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
	@Override
	public int hashCode() {
		return Objects.hash(CapitalCity, name, pincode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(CapitalCity, other.CapitalCity) && Objects.equals(name, other.name)
				&& pincode == other.pincode;
	}
	
	//toString
	@Override
	public String toString() {
		return "City [name=" + name + ", pincode=" + pincode + ", CapitalCity=" + CapitalCity + "]";
	}


	
		
	
}

public class ListEg {

	public static void main(String[] args) {
		//create List
		List<City> cities = new ArrayList<City>();
		//Scanner scnr = new Scanner(System.in);
		
		//add City Objects to List
		
		cities.add(new City("city1", 1234, "Capital1"));
		cities.add(new City("city2", 2234, "Capital2"));
		cities.add(new City("city3", 3234, "Capital3"));
		
		display(cities,"Before reverse");
		Collections.reverse(cities);
		
		display(cities,"after reverse");
		
		
		
	}
	
	static void display(List<City> lcity, String mssg) {
		System.out.println(mssg);
		//iterate and display
		Iterator<City> itr = lcity.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
