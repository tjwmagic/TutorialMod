package tjwmagic.tutorialmod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Utils {
	
	private static Logger logger;
	
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getFormatterLogger(Reference.MODID);
		}
			return logger;
	}
	
}
