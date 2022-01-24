package codes;

import org.testng.annotations.Factory;

public class jon 
{
	@Factory
	public Object[] factorymethod()
	{
		Object[] obj=new Object[5];
		obj[0]=new Object();
		obj[1]=new Object();
		obj[2]=new Object();
		obj[3]=new Object();
		obj[4]=new Object();
		 
		return obj;
	}
	
	
}