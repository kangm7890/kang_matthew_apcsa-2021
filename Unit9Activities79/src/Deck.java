import java.util.ArrayList;
import java.util.List;

public class Deck {
  private List<Card> cards = new ArrayList<Card>();
  
  private int size;
  
  public Deck(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfint) {
    for (byte b = 0; b < paramArrayOfString1.length; b++) {
      for (String str : paramArrayOfString2)
        this.cards.add(new Card(paramArrayOfString1[b], str, paramArrayOfint[b])); 
    } 
    this.size = this.cards.size();
    shuffle();
  }
  
  public boolean isEmpty() {
    return (this.size == 0);
  }
  
  public int size() {
    return this.size;
  }
  
  public void shuffle() {
    for (int i = this.cards.size() - 1; i > 0; i--) {
      int j = i + 1;
      byte b = 0;
      int k = (int)(Math.random() * j) + b;
      Card card = this.cards.get(i);
      this.cards.set(i, this.cards.get(k));
      this.cards.set(k, card);
    } 
    this.size = this.cards.size();
  }
  
  public Card deal() {
    if (isEmpty())
      return null; 
    this.size--;
    return this.cards.get(this.size);
  }
  
  public String toString() {
    String str = "size = " + this.size + "\nUndealt cards: \n";
    int i;
    for (i = this.size - 1; i >= 0; i--) {
      str = str + this.cards.get(i);
      if (i != 0)
        str = str + ", "; 
      if ((this.size - i) % 2 == 0)
        str = str + "\n"; 
    } 
    str = str + "\nDealt cards: \n";
    for (i = this.cards.size() - 1; i >= this.size; i--) {
      str = str + this.cards.get(i);
      if (i != this.size)
        str = str + ", "; 
      if ((i - this.cards.size()) % 2 == 0)
        str = str + "\n"; 
    } 
    str = str + "\n";
    return str;
  }
}
