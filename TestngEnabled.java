package Week6.day2;

import org.testng.annotations.Test;

public class TestngEnabled {
	
	
	@Test(enabled = false,priority = -2)
	public void createLead() {
		System.out.println("createlead");
	}
	
	@Test
	public void editLead() {
		System.out.println("editlead");
	}
	@Test
	public void duplicateLead() {
		System.out.println("duplicatelead");
	}

}
