package beta;

import org.apache.logging.log4j.*;



public class Log4jDemo2 {



	private static Logger log=LogManager.getLogger(Log4jDemo2.class.getName());




	public static void main(String arg [])
	{



		log.debug("m");


		log.fatal("n");

		log.error("o");

		log.info("p");




	}



}
