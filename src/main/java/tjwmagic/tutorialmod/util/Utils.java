package tjwmagic.tutorialmod.util;

import org.apache.logging.log4j.Logger;

import tjwmagic.tutorialmod.Reference;

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
