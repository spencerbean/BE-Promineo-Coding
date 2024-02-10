package week05CodingHw;

public class AsteriskLogger implements Logger{

	
	public void log(String log) {
		System.out.println("***" + log + "***"); // implementation of logger interface for "log" method
	}

	
	public void error(String error) {
		System.out.println("***Error: " + error + "***"); // implementation of logger interface for "error" method
		
	}

}
