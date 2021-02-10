/**
 *  @author Thomas Wong, 991623854
 *  Campus: Davis
 *  Course: Syst17796 Fundamentals of Software Design and Development
 *  Program: ICE1: Card Trick Main Class
 *  Due Date: February 9, 2021
 */
import java.util.*;

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
            magicHand[i] = new Card();
            //generate randome number, store using .setValue()
            magicHand[i].setValue(randNum.nextInt(13) + 1);
            //generate randome suit, store using .setSuit()
            magicHand[i].setSuit(Card.SUITS[randNum.nextInt(4)]);
            //test
            System.out.println("Your card is:" + magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }
        //create search variables
        int parseNum;
        String parseSuit;
        //match suit using regex
        String regex = "[hH]eart(s)?|[dD]iamond(s)?|[sS]pade(s)?|[cC]lub(s)?";
        //ask user to pick a card number
        System.out.print("Pick a card 'any card' (1 - 13): ");
        try {
            parseNum = userInput.nextInt();
            if(parseNum < 1 || parseNum > 13) {
                System.err.println("Only numbers from 1 to 13 are accepted.");
            }
        }
        catch(InputMismatchException e) {
            throw new NoSuchElementException("Only numbers are accepted.");
        }
        //ask user to pick a suit
        System.out.print("Pick a card 'any card' (Hearts, Diamonds, Spades, Clubs): ");
        try {
            parseSuit = userInput.next(regex);
        }
        catch(NoSuchElementException e) {
            System.err.println("No suits matching input.");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.println("Test output.");
    }
    
}
