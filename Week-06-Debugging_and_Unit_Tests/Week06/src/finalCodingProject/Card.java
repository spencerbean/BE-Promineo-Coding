package finalCodingProject;

public class Card { // Declares two variables for class Card
	String name;
	int value;
	
	public Card(String name, int value) { // Constructor for Card class
		this.name = name; // Assigns the value of the name parameter to the name instance variable of the Card object being created
		this.value = value; // Same as above for value
	}

	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	
	// method to print info to console
	public void describe() {
		System.out.println(this.name);
	}
}
