package firstTestNGexample;

import org.testng.annotations.Test;

public class GroupTest 
{
@Test (groups= {"group1"})
public void firstGroup()
{
	System.out.println("In the first group");
}
@Test(groups= {"group2"})
public void secondGroup()
{
	System.out.println("This is Demo Test");
}
}
