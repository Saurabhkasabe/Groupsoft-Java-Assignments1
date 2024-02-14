package week7.Day3;

public class TryCatch {

	public static void main(String[] args) {
		int x = 100;
		int y = 0;
		try {
			System.out.println(x/y);
		} catch (Exception e) {
			if(y==0);
			System.out.println(x/5);
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
