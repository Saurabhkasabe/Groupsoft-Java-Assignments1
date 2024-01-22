package week4.day1;

public class SmartPhone extends AndroidPhone {
	
	public void takeVideo() {
        System.out.println("SmartPhone is able to take video.");
    }

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		AndroidPhone ap = new AndroidPhone();
		sp.takeVideo();
		ap.takeVideo();
		
	}

}
