package week7.Day3;

import java.nio.channels.AlreadyBoundException;

public class LearnTryCatch {

	public static void main(String[] args) {
		int x= 21;
		int y = 3;
		int[] nums = {10,20,30,40};
		
		System.out.println(x/y);
		
		try {
			System.out.println(nums[4]);
		} catch (AlreadyBoundException e) {
			System.out.println(e);
			
			e.printStackTrace();
		}

	}

}
