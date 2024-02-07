package Week6.day2;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void createLead() {
		System.out.println("Createlead");
	}
	
	@Test
	public void editLead() {
		System.out.println("Editlead");
	}
	@Test(dependsOnMethods = {"editLead"})
	public void duplicateLead() {
		System.out.println("Duplicatelead");
	}

}
