package TestProject;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeMethod
	public void initialize() {
		
	}
  @Test
  public void f() {
	  System.out.println("HI");
	  
  }
}
