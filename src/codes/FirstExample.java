package codes;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class FirstExample 
{
	Logger log;
	
	@Test
	public void disp()
	{
	log=Logger.getLogger("FirstExample.class");
	PropertyConfigurator.configure("C:\\Users\\Zero\\eclipse-workspace\\Log4J\\Log4j.properties");
	log.info("john");
	}
	void second()
	{
		log.warning("gap zop");
		
	}
	void third()
	{
	}
}
