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
public class Player {
/*
* private variables 
*/    
private String firstName;
private CardHand hand;

/*
* Constructor
*/
public Player(String firstName) {
   this.firstName = firstName;
}

/*
* Getters and Setters 
 */
public String getFirstName() {
    return this.firstName;
}

public void setFisrtName(String firstName) {
    this.firstName = firstName;
}

public CardHand getHand() {
     return this.hand;
}

public void setHand(CardHand hand) {
    this.hand = hand; 
    }
}

