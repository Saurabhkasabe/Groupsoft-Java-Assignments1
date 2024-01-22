package week4.day1;

public class Calculator {
	
	 public void add(int num1, int num2) {
	       System.out.println(num1+num2);
	 }
	
	 public void add(int num1, int num2, int num3) {
	        System.out.println(num1+num2+num3);
	 }
	
	
	 
	 public void multiple(double num1, double num2) {
	       System.out.println( num1 + num2);
	    }

	    public void multiple(float num1, float num2) {
	        System.out.println(num1+num2);
	    }
	
	
	
	
	

	public static void main(String[] args) {
	Calculator cl = new Calculator();
	cl.add(10, 20);
	cl.add(15, 20, 0);
	cl.multiple(50, 100);
	cl.multiple(25.8f, 38.9f);
	
	


}
}