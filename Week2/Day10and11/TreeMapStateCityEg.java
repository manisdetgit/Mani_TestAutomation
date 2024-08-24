package programs.Day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class State{
	private String stateName;
	private long population;
	public State(String stateName, long population) {
		super();
		this.stateName = stateName;
		this.population = population;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", population=" + population + "]";
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	
	
}

class City_C{
	private String cityName;
	private double totalArea;
	
	public City_C(String cityName, double totalArea) {
		super();
		this.cityName = cityName;
		this.totalArea = totalArea;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", totalArea=" + totalArea + "]";
	}
	
	
}

public class TreeMapStateCityEg {
	public static void main(String[] args) {
		Map<State, City_C> hmss = new TreeMap<>(
				(c1,c2)->(int)(c1.getPopulation()-c2.getPopulation())
				);
		hmss.put(new State("Karnataka",2432), new City_C("Bangalore",2434.32));
		hmss.put(new State("AP",432), new City_C("HYD",244.32));
		hmss.put(new State("Kerala",1232), new City_C("Trivandrum",434.32));
		
		Set<Entry<State,City_C>> sess = hmss.entrySet();
		for (Entry<State, City_C> ess : sess) {
			System.out.println(ess.getKey()+"=>"+ess.getValue());
		}
	}
}
