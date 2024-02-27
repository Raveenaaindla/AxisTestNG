package TestNg;

import org.testng.annotations.Test;

public class EnableFalse {
  @Test(enabled = false)
  public void testcase1() {
	  
	  System.out.println("testcase1 executed successfully");
  }
  
  
  @Test
public void testcase2() {
	  
	  System.out.println("testcase2 executed successfully");
  }

  @Test (priority = 0)
public void testcase3() {
	  
	  System.out.println("testcase3 executed successfully");
}
}
