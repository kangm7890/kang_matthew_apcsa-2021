/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card Card1 = new Card("Ace", "spades", 1);
		Card Card2 = new Card("Ace", "spades", 1);
		Card Card3 = new Card("Ten", "hearts", 10);
		System.out.println(Card1);
		System.out.println(Card2);
		System.out.println(Card3);
		System.out.println(Card1.matches(Card2));
		System.out.println(Card1.matches(Card3));
		System.out.println(Card2.matches(Card3));
	}
}
