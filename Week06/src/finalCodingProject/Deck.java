package finalCodingProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards = new ArrayList<Card>(); // Makes empty ArrayList called cards
	
	public Deck () { // Constructor for the Deck class
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; // Array of String made for the suits of the cards
		for (String suit : suits) { // enhanced for loop
			for (int value = 2; value <= 14; value++) { 
				String name = getValueName(value) + " of " + suit; //Concatenating card names together (ie 2 of Hearts) using the method call "value" to add the face if the # is higher than 10
				cards.add(new Card(name, value)); // Instantiate a new Card and passes in name and value of card
			
			}
	}
		
	}
	
	// method to shuffle the deck 
	public void shuffle() {
		Collections.shuffle(cards); 
	}
	
	
	
	// method to determine "face" of cards valued 11 - 14
	private String getValueName(int value) {
		switch (value) {
		case 11:
			return "Jack";
		case 12:
			return "Queen";
		case 13:
			return "King";
		case 14:
			return "Ace";
		default:
			return String.valueOf(value); //Returns string value of int if it doesn't meet above criteria
		}
	}
	
	// method for drawing 
	public Card draw() {
		if (!cards.isEmpty()) { // Checks to make sure there are no cards left to draw from
			return cards.remove(0); // If there are cards left this removes top card from the deck
		} else {
			return null; // Returns null once card list is empty 
		}
	}

}
