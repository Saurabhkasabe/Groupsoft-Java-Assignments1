package week5.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterCounting {

	public static void main(String[] args) {
	
		String company = "GroupsoftUS PVT LTD Pune"; 
		company = company.toLowerCase();
	
		
		char[] ch = company.toCharArray();
		
	   Map<Character, Integer> map =  new HashMap<Character, Integer>();
		
		// Type 1:-
		//Loop through each Character
		 for (int i = 0; i < ch.length; i++) {
			 if (map.containsKey(ch[i])) {
				Integer value = map.get(ch[i]);
				 map.put(ch[i], value+1);
				}else {
				map.put(ch[i], 1);
			}
			 
		}
		
		
		// Type 2:
		//for (int i = 0; i < ch.length; i++) {
		//	map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		//}
	    //System.out.println(map);
		
		
		 
		 //To print only single occuring character:-
		for (Entry<Character, Integer> eachEntry : map.entrySet()) {
			if (eachEntry.getValue()== 1) {
				System.out.println(eachEntry.getKey());
			}
		}
		
		
		// TO find out the max occuring character :_
		int maxOccur = 0 ;
		char maxCharOccur = 0;
		
		for (Entry<Character, Integer> eachEntry: map.entrySet()) {
			if (eachEntry.getValue()> maxOccur) {
				maxOccur=eachEntry.getValue();
				maxCharOccur = eachEntry.getKey();
			}
		}
		System.out.println("Max occuring charcter is : "+maxCharOccur +" and the value is : "+maxOccur);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
