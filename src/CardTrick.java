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
        //Creat hardcoded luckyCard object in GitHub
        //Assign value = 8, suit = Spades
        Card luckyCard = new Card();
        luckyCard.setValue(8);
        luckyCard.setSuit(Card.SUITS[3]);
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
        //win flag
        boolean youWin = false;
        //begin searching, scan each card by array position
        for(int i = 0; i < magicHand.length; i++) {
            //check if value has matched
            if(luckyCard.getValue() == magicHand[i].getValue()) {
                //check if suit matched
                if(luckyCard.getSuit().matches(magicHand[i].getSuit())) {
                    //value and suit matched, set win flag to true
                    youWin = true;
                }
            }
        }
        //check win flag
        if(!youWin) {
            System.out.println("You've lost.");
        }
        else {
            System.out.println("You've won!");
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.println("Test output.");
    }
    
}
