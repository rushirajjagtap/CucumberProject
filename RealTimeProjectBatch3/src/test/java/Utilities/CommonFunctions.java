package Utilities;

public class CommonFunctions 
{
	public static String generateRandomEmailId()
	{
		String email = "tom" + java.util.UUID.randomUUID().toString().replace("-", "").substring(0,8) + "@gmail.com";
		return email;
	}

}
