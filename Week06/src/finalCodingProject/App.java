package finalCodingProject;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck(); // Object deck being instantiated with the Deck class
		Player player1 = new Player("Player 1"); 
		Player player2 = new Player("Player 2");
		
		// Shuffle the deck
		deck.shuffle();
		
		// Draw 52 card for each player
		for (int i = 0; i < 52; i++) { // Loop to iterate through full deck
			player1.draw(deck); // Deals card from deck to player's hand
			player2.draw(deck); // Deals card from deck to player's hand
		}
		
		// Print cards and compare the values
		for (int i = 0; i < 26; i++) { // Iterates 26 times 
			Card card1 = player1.flip(); // Each player flips the top card of their hand 
			Card card2 = player2.flip();
	

		// Print the flipped cards to the console declaring which player flipped the cards
		System.out.println("Player 1 flipped: "); 
		card1.describe();
		System.out.println("Player 2 flipped: ");
		card2.describe();
		
		// Compare values and increment score
		if (card1.getValue() > card2.getValue()) { // Compares values of flipped cards above. 
			player1.incrementScore(); // Player 1 gets a point if his card is higher
			System.out.println("Player 1 receives a point");
			} else if (card1.getValue() < card2.getValue()) { // if player 2 card is higher this happens
				player2.incrementScore(); // player 2 gets a point if his card is higher
				System.out.println("Player 2 receives a point.");
			} else {
				System.out.println("It's a tie! No point awarded!"); // info printed to the console if it is a tie
			}
		System.out.println("Current Score ------------------------- Player 1: " + player1.getScore()); // records running score of the game for player 1
		System.out.println("Current Score ------------------------- Player 2: " + player2.getScore() + "\n"); // records running score of the game for player 2 and adds a break line for easier following with the eye
	}	
		
		// Print final scores
		System.out.println("\nFinal Score"); // adds new line and prints Final Score header
		System.out.println("Player 1: " + player1.getScore()); // prints final score for player 1
		System.out.println("Player 2: " + player2.getScore()); // prints final score for player 2
	
	
		 // Determine and print the winner or a draw
        if (player1.getScore() > player2.getScore()) { // Compares values of final score of player 1 and player 2
            System.out.println("Player 1 wins!"); // printed if player 1 score is higher
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player 2 wins!"); // printed if player 2 is higher
        } else {
            System.out.println("It's a draw!"); // printed if the game is a tie
        
	
	}	
	
	}
	
	
}
