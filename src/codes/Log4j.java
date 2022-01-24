package codes;

import org.apache.log4j.PropertyConfigurator;
import org.testng.log4testng.Logger;

public class Log4j
{
	Logger log;
	void logging_Mechanism()
	{
		log=Logger.getLogger(Log4j.class);
	    PropertyConfigurator.configure("C:\\Users\\Zero\\eclipse-workspace\\Selenium\\Log4j.properties");
	}
	void log_info()
	{
		log.info("inside info");
	}
	void log_warn()
	{
		log.warn("inside warn");
	}
	void log_error()
	{
		log.error("inside error");
	}
	void log_fatal()
	{
		log.fatal("inside fatal");
	}
	void log_debug()
	{
		log.debug("inside debug");
	}

	public static void main(String args[])
	{
		Log4j log4J=new Log4j();
	    log4J.logging_Mechanism();
	    log4J.log_info();
	    log4J.log_warn();
	    log4J.log_error();
	    log4J.log_fatal();
	    log4J.log_debug();
	}
}
	