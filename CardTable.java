
/**
 * 
 * This class represents a table where a game is being played.
 * 
 * It implements the Table interface and is designed to work with Card and
 * CardPlayer objects.
 * 
 * <p>
 * Each table instance must keep track of the cards that players place on the table
 * during the game. The number of places available has a fixed size 
(<code>NUMBER_OF_PLACES</code>),
 * so we use a regular Java array to represent a CardTable's places field. 
 * Each entry in this places array contains 
 * the cards that were added to that place, which is a more dynamic structure (we 
don't know 
 * in advance how many cards will be added to this place!). 
 * <p>
 * Therefore, each place
 * entry in this array will reference an ArrayList of Card objects.  
 * <p> 
 * Here is how to declare the array of ArrayLists field <code>places</code>:  
 * 
 * <p>
 * <code>
 *  private ArrayList&lt;Card&gt;[] places = new 
ArrayList[NUMBER_OF_PLACES];  
 * </code>
 * <p>
 * 
 * Note that the Field Summary section below will only show you public fields, 
 * but you must declare the required field places described above, which is 
private.
 * You are also free to create additional fields in your class implementation, if 
deemed necessary.
 * 
 */
/*
THIS CODE WAS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING
CODE WRITTEN BY OTHER STUDENTS OR COPIED FROM ONLINE RESOURCES. Alejandro Pacheco
*/
import java.util.ArrayList;

public class CardTable implements Table<Card, CardPlayer> { // see whether to add <Card> or not

    final int NUMBER_OF_PLACES = 4;
    private ArrayList<Card>[] places = new ArrayList[NUMBER_OF_PLACES];
    public ArrayList<Card> bank = new ArrayList<Card>();

    public int currentIndex = 0; // The index of the place where the next card will be added.

    public CardTable() {
        for (int i = 0; i < NUMBER_OF_PLACES; i++) { // can replace NUMBER_OF_PLACES with 4 if you want
            places[i] = new ArrayList<Card>();
        }
    }

    public void addCardToPlace(Card card) {
        places[currentIndex].add(card);
        currentIndex = (currentIndex + 1) % NUMBER_OF_PLACES;
    }

    public int[] getPlaces() {
        int[] newPlace = new int[NUMBER_OF_PLACES];
        for (int i = 0; i < NUMBER_OF_PLACES; i++) {
            if (places[i].isEmpty()) {
                newPlace[i] = -1;
            } else {
                newPlace[i] = places[i].get(0).identifier;
            }
        }
        return newPlace;
    }

    public void checkPlaces(CardPlayer player) {
        if (places[currentIndex].size() == 0) {
            return;
        }
        Card topCard = places[currentIndex].get(places[currentIndex].size() - 1);
        for (int i = 0; i < NUMBER_OF_PLACES; i++) {
            if (places[i].isEmpty()) {
                continue;
            }
            Card currentCard = places[i].get(places[i].size() - 1);
            if (currentCard.getRank() == topCard.getRank()) {
                System.out.println("Matched ranks: " + currentCard.identifier + " (on table) and " + topCard.identifier
                        + " " + player.name);
                player.setPoints(player.getPoints() + 1);
                bank.add(topCard);
                bank.add(currentCard);
                places[i].remove(places[i].size() - 1);
                places[currentIndex].remove(places[currentIndex].size() - 1);
                break;
            }
        }
    }
}
