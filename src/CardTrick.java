/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: ICE1: Card Trick Main Class
 *  Due Date: February 9, 2021
 */
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 */
public class CardTrick {
    
    public static void main(String[] args) {
        //create objects
        Scanner userInput = new Scanner(System.in);
        Random randNum = new Random();
        Card[] magicHand = new Card[7];
        //fill random cards by array index
        for (int i=0; i<magicHand.length; i++) {
            //create card object
            //error: every loop creates new card, erasing prev
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(randNum.nextInt(13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[randNum.nextInt(4)]);
            
            System.out.println("Your card is:" + c.getValue() + " of " + c.getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.println("Test output.");
    }
    
}
