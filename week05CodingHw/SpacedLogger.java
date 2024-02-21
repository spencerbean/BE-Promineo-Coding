package week05CodingHw;

public class SpacedLogger implements Logger{

	
	public void log(String log) {
		StringBuilder spacedLog = new StringBuilder(); //create new mutable string
		
		// Append each character of the input string with a space
		for (int i = 0; i < log.length(); i++) {
			spacedLog.append(log.charAt(i)).append(" ");
		}
		System.out.println(spacedLog.toString()); //print to the console when this class is called
	}

	
	public void error(String error) {
		StringBuilder spacedError = new StringBuilder(); //create new mutable string
		
		// Append each character of the input string with a space
		for (int i = 0; i < error.length(); i++) {
			spacedError.append(error.charAt(i)).append(" ");
		}
		System.out.println("Error: " + spacedError.toString()); //print to the console when this class is called
		
	}
	
	

}
