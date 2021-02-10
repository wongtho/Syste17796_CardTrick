/**
 *  @author Thomas Wong, #########
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
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.println("Test output.");
    }
    
}
