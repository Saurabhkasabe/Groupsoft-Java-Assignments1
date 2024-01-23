package week4.day2;

public class UPIPayment implements Payments {
	
	
	public void BharatPay() {
		System.out.println("payment done by bharatpay");
	}

	public void Phonepay() {
	System.out.println("Payment done by phonepay");
	}

	public void GooglePay() {
		System.out.println("payment done by google pay");
	}

	public void PayTm() {
	System.out.println("payment done by paytm");
	}

	public static void main(String[] args) {
	UPIPayment upi = new UPIPayment();
	upi.GooglePay();
	upi.Phonepay();
	upi.PayTm();
	upi.BharatPay();
	
	}

	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		
	}

	public void upiPayments() {
		// TODO Auto-generated method stub
		
	}

	public void cardPayments() {
		// TODO Auto-generated method stub
		
	}

	public void internetBanking() {
		// TODO Auto-generated method stub
		
	}
}


