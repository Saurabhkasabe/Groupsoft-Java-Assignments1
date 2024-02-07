package week2.day3;

public class StringBasic {

	public static void main(String[] args) {
	
		String name="Groupsoft" ;
		
		String Name="GroupsoftUS";
		
		String name1=new String("Groupsoft");
		
	
		
		if(Name==name1) { 
			System.out.println("Values are same");
		}else {
			System.out.println("values are not same");
		}
		
		
		
		if(name==Name) { 
			System.out.println("Values are same");
		}else {
			System.out.println("values are not same");
		}
		
         if(name.equalsIgnoreCase(name1)) {
			System.out.println("Values are same");
		}else {
			System.out.println("Values are not same");
		}
		
	}
	}


