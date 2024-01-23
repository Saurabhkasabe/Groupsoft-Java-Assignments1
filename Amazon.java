package week4.day2;

public class Amazon extends SingaporeBank {

	
	public void cashOnDelivery() {
		System.out.println("Payment Cash on delivery");
	}

	public void upiPayments() {
		System.out.println("Payment by upi");
	}

	public void cardPayments() {
	System.out.println("payment by card");
		
	}

	public void internetBanking() {
	System.out.println("payment by internet banking");
	}
	
	
	public void recordPaymentDetails() {
		System.out.println("show your card payment details");
		
	}
	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.cardPayments();
		a.cashOnDelivery();
		a.internetBanking();
		a.upiPayments();
		a.recordPaymentDetails();

	}


	

}
