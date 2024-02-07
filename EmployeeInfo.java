package week5.day2;

public class EmployeeInfo {
	
	int empId;
	String name;
	static String companyName="Groupsoft";
	
	static {
		System.out.println("I am a static block");
	}
	
	public void setValues(int empId, String name,String cName) {
		this.empId=empId;
		this.name=name;
		companyName=cName;

	}
	
	public static void add() {
		System.out.println("I am a static method");
	}
	
	public void printValues() {
		System.out.println(empId+ " "+name+"  "+companyName);

	}
	
	public static void main(String[] args) {
		
		System.out.println(companyName);
		add();
		System.out.println("I am inside main method");
		

}
}
