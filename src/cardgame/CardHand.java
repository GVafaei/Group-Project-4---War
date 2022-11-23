/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardgame;

/**
 * @author Ava Henry
 * @author Zahra Vafaei
 * @author Hieu Lam
 */
    
import java.util.ArrayList;
import java.util.List;

public class CardHand {

/*
* List of Cards variable 
 */
private List<Card> card; 

/*
* List of Cards constructor 
*/
public CardHand() {
     this.card = new ArrayList<Card>();
}

/*
* Combines another hand into this hand
*/
public void combineHand(CardHand other) {
      for (Card d : other.card) {
        this.addaCardToBottom(d);
     }
}

public List<Card> take(int numOfCards) {
     if (numOfCards > this.SizeOfHand()) {
        return null;
}

    List<Card> out = new ArrayList<>();
        for (int i = 0; i < numOfCards; i++) {
          out.add(this.card.remove(this.SizeOfHand() - 1));
     }

  return out;
}

/*
* Adding a single Card object to the end of the array
* Throws Exception 
*/
public void addaCardToTop(Card d) {
    if (d == null) {
        throw new NullPointerException("Can not add the card to a deck of cards, card value is null!");
}
    card.add(d);
}

/*
* Adds a single card to the beginning 
*/
public void addaCardToBottom(Card d) {
      card.add(0, d);
}

/*
* adds multiple cards to hand
*/
public void addCardsToTop(List<Card> dcp) {
    this.card.addAll(dcp);
}

/*
* Removes a card
*/
public Card removeCardBottom() {
        if (SizeOfHand() < 1) {
            return null;
        }
        return card.remove(0);
    }

public Card removeCardTop() {
        if (SizeOfHand() < 1) {
            return null;
        }
        return card.remove(SizeOfHand() - 1);
    }

/*
* Returns the number of cards in the cards.
*/
public int SizeOfHand() {
     return card.size();
    }
}

