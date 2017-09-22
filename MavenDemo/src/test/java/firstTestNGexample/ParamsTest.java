package firstTestNGexample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamsTest 
{
@Test(dataProvider="getData")

public void UserId(String username, String subject)
{
	System.out.println("Username "+username+ "subject" + subject);
}

	@DataProvider
	public Object[][] getData()
{
	Object obj[][] = 
		{
		{"Bairon", "Computer Science"},
		{"Mark", "Math"}
};
return obj;
}
}
