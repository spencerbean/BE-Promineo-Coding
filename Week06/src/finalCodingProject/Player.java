package finalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player { // Declare three instances of variables to store info about Player
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) { // Constructor for Player class
		this.name = name; // Assigns value of name to name instance of player
		this.hand = new ArrayList<>(); // Initializes the hand instance variable as a new ArrayList of Card objects
		this.score = 0; // Initializes score to 0
	}

	// Method to print info about player to console
	public void describe() { 
		System.out.println("Player: " + name); // Prints player's name
		System.out.println("Score: " + score); // Prints player's score
		System.out.println("Hand: "); 
		for (Card card : hand) { 
			card.describe(); // Uses card class to print info about card being return from top of deck
		}
	}

	// Method for pulling top card out of deck
	public Card flip() {
		if (!hand.isEmpty()) { // Checks to make sure deck is not empty
			return hand.remove(0); // Pulls out top card in array
		} else {
			System.out.println("Hand is empty."); // If empty it returns the String here
			return null; // Return null if empty
		}
	}
	
	// Method allows player to draw from deck and put it in the player's hand
	public void draw(Deck deck) {
		Card drawnCard = deck.draw(); // Calls the draw method on Deck object to draw a card. Assigns the returned Card object to variable listed
		if (drawnCard != null) { // null if drawncard doesn't return anything
			hand.add(drawnCard); // if a card was drawn it adds it to the hand
		}
	}
 // Method to increment player score by one
	public void incrementScore() {
		score++;
	}
// Method to retrieve player's current score
	public int getScore() {
	    return score;
	}


}
