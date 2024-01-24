package week4.day3;


public class Student {
	
	private String name;
    private int age;

   public void setName(String name) {
	this.name = name;
}
   public String getName() {
	return name;
}
   public void setAge(int age) {
	   if(age>0) {
	  this.age = age;
	   }
	   else {
		   System.out.println("invalid content");
	   }
}
   public int getAge() {
		return age;
	}
    
   public static void main(String[] args) {
    	Student sc = new Student();
    	sc.setName("Saurabh");
    	System.out.println(sc.getName());
    	
    	sc.setAge(-25);
       int age=sc.getAge();
       System.out.println(age);
   
		
	}
}
 