package week4.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicateString {

	public static void main(String[] args) {
		String[] str = { "google"};
		
		Set<String> unique = new LinkedHashSet<String>();
		Set<String> duplicate  = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			
	boolean add=	unique.add(str[i]);
		
			if(!add) {
			duplicate.add(str[i]);
			
		}
	}
	
		System.out.println("unique");
		System.out.println("duplicate");

	}

}
