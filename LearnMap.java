package week5.day1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {

	public static void main(String[] args) {
		
	Map<Integer, String> employeeDetails = new LinkedHashMap<Integer, String>();

				employeeDetails.put(10021, "Saurabh");
				employeeDetails.put(10023, "Deepali");
				employeeDetails.put(10022, "Vidhi");
				employeeDetails.put(10020, "Amruta");
				employeeDetails.put(10024, "Triveni");
				employeeDetails.put(10025, "Mani");
				employeeDetails.put(10024, "Abhishek");

				
				System.out.println(employeeDetails.size());
		        System.out.println(employeeDetails);

				String value = employeeDetails.get(10024);
				System.out.println(value);

				employeeDetails.remove(10022);
				System.out.println(employeeDetails);
				
				boolean containsKey = employeeDetails.containsKey(10021);
				System.out.println(containsKey);
				
				boolean containsValue = employeeDetails.containsValue("Vidhi");
				System.out.println(containsValue);
				
				Set<Integer> keySet = employeeDetails.keySet();
				System.out.println(keySet);
			
				
				Set<Entry<Integer, String>> entrySet = employeeDetails.entrySet();
				System.out.println(entrySet);
				
				for (Entry<Integer, String> eachEntry : entrySet) {
					Integer key = eachEntry.getKey();
					System.out.print(key+" -> ");
					String value2 = eachEntry.getValue();
					System.out.println(value2);
				}
				
				}

}
