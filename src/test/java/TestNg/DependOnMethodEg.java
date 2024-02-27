package TestNg;

import org.testng.annotations.Test;

public class DependOnMethodEg {
@Test 
public void testcase1() {
	System.out.println("testcase1 executed successfully");
}


@Test(dependsOnMethods =  "testcase1")
public void testcase2() {
	  
	  System.out.println("testcase2 executed successfully");
}

@Test
public void testcase3() {
	  
	  System.out.println("testcase3 executed successfully");
}
}


