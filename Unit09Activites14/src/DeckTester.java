/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck Deck1 = new Deck(new String[] {"jack", "ace", "10", "4"}, new String[] {"spades", "hearts", "spades", "clubs"}, new int[] {11, 1, 10, 4});
		System.out.println(Deck1.deal());
		System.out.println(Deck1.deal());
		System.out.println(Deck1.deal());
		System.out.println(Deck1.isEmpty());
		System.out.println(Deck1.deal());
		System.out.println(Deck1.deal());
		System.out.println(Deck1.isEmpty());
	}
}
