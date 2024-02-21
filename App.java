package week05CodingHw;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		// instantiate an instance of each logger class
		Logger logger = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		// call logger class AsteriskLogger
		logger.log("Spencer");
		logger.error("Spencer");
	
		// call logger class SpacedLogger
		logger2.log("Spencer");
		logger2.error("Spencer");
	}

}
