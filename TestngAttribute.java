package Week6.day2;

import org.testng.annotations.Test;

public class TestngAttribute {
	
	@Test(priority = 4)
	public void deleteLead() {
		System.out.println("Deletelead");
	}
	@Test(priority =1)
	public void mergeLead() {
		System.out.println("Mergelead");
	}
	@Test(priority = -1)
	public void editLead() {
		System.out.println("Editlead");
	}
	@Test
	public void duplicateLead() {
		System.out.println("Duplicatelead");
	}
	@Test(priority= -2)
	public void createLead() {
		System.out.println("Createlead");
	}

}
