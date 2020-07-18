package test;
import org.apache.logging.log4j.*;

public class LoggerDemo 
{

	public static Logger log = LogManager.getLogger(LoggerDemo.class.getName()); 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		log.debug("I have clicked on button");
		log.info("button is displayed");
	    log.error("button is not displayed");
	   log.fatal("button is missing");
	}

}
