package alpha;

import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;

import org.apache.logging.log4j.*;

public class Log4jDemo1 {

	
	
	private static Logger log= org.apache.logging.log4j.LogManager.getLogger(Log4jDemo1.class.getName());
	
	
	public static void main(String arg[])
	{
		
		
		
		log.debug("i");
		

		log.fatal("j");
		
		log.error("k");
		
		log.info("L");
		
		
		
		
	}

}
