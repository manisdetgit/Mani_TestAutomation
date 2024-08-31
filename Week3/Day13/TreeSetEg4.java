package programs.Day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;


class Country4{
	private String name;
	private double gdp;
	
	public Country4(String name, double gdp) {
		super();
		this.name = name;
		this.gdp = gdp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGdp() {
		return gdp;
	}
	public void setGdp(double gdp) {
		this.gdp = gdp;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", gdp=" + gdp + "]";
	}
	
	
	
}


public class TreeSetEg4 {
	public static void main(String[] args) {
			
		TreeSet<Country4> tss = new TreeSet<Country4>(
				(c1,c2)->(int)(c2.getGdp()-c1.getGdp())
				);
		
		tss.add(new Country4("Country1", 10.75));
		tss.add(new Country4("Country2", 2.33));
		tss.add(new Country4("Country3", 13.34));
		
Iterator<Country4> itrc = tss.iterator();
		
		/*while(itrc.hasNext()) {
			System.out.println(itrc.next());
		}
		*/
	
		
		Country4 c4min = Collections.min(tss, (c1,c2)->c1.getName().compareTo(c2.getName()));
		System.out.println("Minimum country element is "+c4min);
		
		Country4 c4max = Collections.max(tss, (c1,c2)->c1.getName().compareTo(c2.getName()));
		System.out.println("Maximum country element is "+c4max);
		
		
		
		
	
	
	}	
}



