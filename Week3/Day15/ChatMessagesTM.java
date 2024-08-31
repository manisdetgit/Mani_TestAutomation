package programs.Day15;

import java.util.Set;
import java.util.TreeMap;

public class ChatMessagesTM {
	public static void main(String[] args) {
		TreeMap<String, String> hmss = new TreeMap<>((s1, s2) -> s1.compareTo(s2));

		hmss.put("name1", "msg91");
		hmss.put("name2", "msg22");
		hmss.put("name3", "msg33");
		hmss.put("name4", "msg44");
		hmss.put("name5", "msg55");

		Set<String> ss = hmss.keySet();

		for (String item_key : ss) {
			System.out.println(item_key + "---->" + hmss.get(item_key));
		}

	}

}
