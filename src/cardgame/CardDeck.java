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
import cardgame.Card.Suit;
import cardgame.Card.Value;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
private final List<Card> card = new ArrayList<Card>();

CardDeck() {
    createDeck();
}

private void createDeck() {
     for (Suit s : Suit.values()) {
     for (Value v : Value.values()) {
     card.add(new Card(v, s));
        }
    }
}

/*
* Shuffles the deck 
*/
public void Deckshuffle() {
    Collections.shuffle(this.card);
}

/*
* Return List of Card
*/
public List<Card> getCard() {
    return this.card;
}

/*
* This method returns the quantity of cards remaining in the deck
*/
public int getCardsCount() {
    return this.card.size();
}

/*
* shuffles the deck and give out a card from the top, eliminating it.
*/
public Card dealCard() {
    return this.card.remove(this.card.size() - 1);
}

public void Cardadd(Card d) {
    this.card.add(0, d);
}

/*
* This method outputs a String with each card listed in order.
*/
@Override
public String toString() {
     return this.card.toString();
    }
}

