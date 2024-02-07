package week2.day3;

public class ReverseString {

	public static void main(String[] args) {

		String s="Groupsoft";
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		
		char[] charArray = s.toCharArray();
		
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println();
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		boolean contains = lowerCase.contains("soft");
		System.out.println(contains);

	}
	}


