package Log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogMethods {
	
	

	public static void main(String[] args) {
		
		Logger logger=LogManager.getLogger(LogMethods.class.getName());
		
		logger.info("This is information message");
		logger.debug("This is degug message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");
		logger.info("This is information message");
		logger.debug("This is degug message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");
		

	}

}
