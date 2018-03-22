package business_logic;

import dao.RegisterJDBC_Imple;
import dao.RegisterDao;

public class RegisterDaoGetter 
{
	public static RegisterDao getRegisterDao(String implementation)
	{
		RegisterDao a = null;
		
		if(implementation.equals("jdbc"))
		{
			 a= new RegisterJDBC_Imple();
			 return a;
			
		}
		return null;
		
	}
}
