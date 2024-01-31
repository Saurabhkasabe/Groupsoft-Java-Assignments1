package week5.day2;

public class LearnConstructor {
	
	int empId;
	String empName;
	boolean empStatus;
	
	public LearnConstructor () {
		System.out.println("Default Constructor");
		empId=150;
		empName="Saurabh";
		empStatus= true;
		
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		LearnConstructor LC = new LearnConstructor();
		System.out.println(LC.empId+" "+LC.empName+" "+LC.empStatus);
	}

}
