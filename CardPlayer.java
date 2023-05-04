/**
 * A class that represents a card player.
 * 
 * For each card player instance, we should keep track of how many points 
 * they earned in the game so far, as well as whether it is their turn or not.
 * Additionally, their hand and bank of cards should be stored in two 
 * separate ArrayLists of Card objects. 
 * 
 * <p>
 * A player's points, turn, and hand of cards should all be declared
 * private fields, whereas the bank of cards should be public, as follows: 
 * <p>
 * <code>
 *  private int points; 
 * 
 *  private boolean turn; 
 * 
 *  private ArrayList&lt;Card&gt; hand = new ArrayList&lt;Card&gt;(); 
 *
 *  public ArrayList&lt;Card&gt; bank = new ArrayList&lt;Card&gt;();
 * </code>
 * <p>
 * 
 * Note that the Field Summary section below will only show you public fields, 
 * but you must declare all the fields described above in your implementation of 
this class,
 * including the private fields. You are free to create additional fields if deemed
necessary.
 * 
 * @param <Card> the type of card used in the game
 */

import java.util.ArrayList;
import java.util.Iterator;
/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Alejandro Pacheco
*/

public class CardPlayer extends GeneralPlayer<Card> {
    
    private int points;
    private boolean turn;
    private ArrayList<Card> hand = new ArrayList<Card>();
    public ArrayList<Card> bank = new ArrayList<Card>();

    public CardPlayer() {
        super.name = "General Player"; // Creates a new card player with a default name.
        points = 0; // Creates a new card player with a default number of points.
        turn = false;
    }
    
    public CardPlayer(String name) {
        super.name = name;
        points = 0;
        turn = false;
    }

    public int getPoints() {
        return points;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public void addToHand(Card card) {
        hand.add(card);
    }

    public ArrayList<Card> getHand() { 
        return hand;
    }

    public String handToString() {
        String handToString = "";
        for (Card card : hand) {
            handToString += card.toString() + " ";
        }
        return handToString;
    }

    // public String bankToString() {
    //     if (bank.isEmpty()) {
    //         return "Bank is empty";
    //     }
    //     String bankToString = "";
    //     for (Card card : bank) {
    //         bankToString += card.toString() + " ";
    //     }
    //     return name + " bank has " + bank.size() + " cards: " + bankToString;
    // }      

    public String bankToString() {
        if (bank.isEmpty()) {
            return name + " has an empty bank.";
        }
        String bankToString = "";
        Iterator<Card> bankIterator = bank.iterator(); 
        while (bankIterator.hasNext()) {
            bankToString += bankIterator.next().identifier + " ";
        }
        return name + " bank has " + bank.size() + " cards: " + bankToString;
    }


    public Card play() {
        if (hand.size() == 0) {
            return null;
        }
        Card card = hand.get(0);
        hand.remove(0);
        return card; 
    }
    
    public static void main(String[] args) {
        System.out.println("done");
    }
}