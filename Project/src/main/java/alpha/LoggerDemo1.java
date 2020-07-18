package alpha;
import org.apache.logging.log4j.*;

public class LoggerDemo1 
{

	public static Logger log = LogManager.getLogger(LoggerDemo1.class.getName()); 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		log.debug("I am debugging");
		log.info("object is present");
	    log.error("object is not present");
	   log.fatal("this is fatal");
	}

}
