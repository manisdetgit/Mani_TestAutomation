package programs.Day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		//Create a HashMap
		TreeMap<String,String> hmss = new TreeMap<String, String>(
				(c1,c2)->(c2.compareTo(c1))
				);
		hmss.put("Karnataka", "Bangalore");
		
		hmss.put("Tamilnadu", "Chennai");
		hmss.put("AP", "Amaravati");
		hmss.put("Kerala", "Trivandrum");
		
		Set<Entry<String,String>> sess = hmss.entrySet();
		Iterator<Entry<String, String>> it = sess.iterator();
		
		/*while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		while(it.hasNext()) {
			Entry<String,String> ess = it.next();
			System.out.println(ess.getKey()+"=>"+ess.getValue());
		}
		
		/*for (Entry<String,String> ess : sess) {
			System.out.println(ess.getKey()+"=>"+ess.getValue());
		}*/
		
		
	}
}
