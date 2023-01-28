package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author CHI YIN IP
 * @Date Jan 28, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random ran = new Random();
            card.setValue(ran.nextInt(13)+1);
            card.setSuit(Card.SUITS[ran.nextInt(4)]);
            hand[i] = card;
        }
        
        System.out.println(hand[0].getSuit());
        System.out.println(hand[0].getValue());
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input the value of the card you guess (1-13), 11 for jack, 12 for queen, 13 for king: ");
        int guessValue = input.nextInt();
        System.out.println("Input the suit of the card you Hearts, Diamonds, Spades, Clubs");
        String guessSuit = input.next();
        
        boolean result = false;
        for (int i = 0; i < hand.length; i++) {
        if(hand[i].getValue()== guessValue && hand[i].getSuit().equals(guessSuit)){
            printInfo();
            result = true;
            break;
        }}
    
        if(!result) {
        System.out.println("Your card is not in the hand.");
        }
        
        
    }
        /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author CHI YIN IP Jan 28 2023
     */
    //I'm done!
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is CHI YIN, but you can call me Wallace");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be a programmer in Big Tech");
        System.out.println("-- Use what I have learnt in college to solve problems in daily life");
	System.out.println("-- Be able to write different trading strategies");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Watching movies");

        System.out.println();
}}
