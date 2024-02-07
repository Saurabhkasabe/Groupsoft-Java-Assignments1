package week2.day3;

public class StringMethods {

	public static void main(String[] args) {
		String a="Groupsoft";
		String price="Rs.68000r";
		
		
	
			
			
			char[] ch = a.toCharArray();
			System.out.println(ch[4]);
			System.out.println(price+10);
			
			int length = a.length();
			System.out.println(length);
			
			
			char charAt = a.charAt(length-1);
			System.out.println(charAt);
			
	        String replace = price.replace("Rs.","");
			System.out.println(replace);
			
			String pr = price.replaceAll("[^0-7]", "");
			System.out.println(pr +10);
			
	        int parseInt = Integer.parseInt(pr);
			System.out.println(parseInt+10);
			
            String substring = price.substring(3,5);
			System.out.println(substring);
			
			
	}

}
