/*
 * Class: CSC-151 - Java Programming
 * Contributor: S. Benjamin Accles
 * Last Modified: 16 October 2024
 * Purpose: This application uses arrays and loops to work with a deck of 
 * cards.
 */

import java.util.Arrays;

public class CardDeckApp {

    public static void main(String[] args) {
        
        // Create and display the deck of cards.
        System.out.println("DECK");
        String[] deck = getDeck();
        displayCards(deck);
        
        // Display a blank line.
        System.out.println();
        
        // Shuffle and display the deck of cards.
        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);
        
        // Display a blank line.
        System.out.println();

        // Create and display the hand of cards.
        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        String[] hand = dealCards(deck, count);
        displayCards(hand);
        
        // Display a blank line.
        System.out.println();
    }

    private static String[] getDeck() {
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {
            "Ace", "2", "3", "4", "5", "6", 
            "7", "8", "9", "10", "Jack", "Queen", "King"
        };
        
        // Create the deck of cards.
        String[] deck = new String[52];
        int i = 0;
        for (String suit: suits) {
            for (String rank: ranks) {
                deck[i] = rank + " of " + suit;
                i++;
            }
        }
        
        return deck;
    }

    private static void displayCards(String[] cards) {
        for (String card: cards) {
            
            // Display each card in the deck, separated by "|".
            System.out.print("|" + card);
        }
    }

    private static void shuffleDeck(String[] deck) {
        
        // Loop through the deck of cards and swap each card with a random 
        // card in the deck.
        for (int i = 0; i < deck.length; i++) {
            String savedCard = deck[i];
            int randomIndex = (int) ( Math.random() * (deck.length-1) );
            deck[i] = deck[randomIndex];
            deck[randomIndex] = savedCard;
        }
    }

    private static String[] dealCards(String[] deck, int count) {
        
        // Create a hand of cards by selecting the number of cards 
        // (specified by count) from the deck.
        String[] hand = Arrays.copyOf(deck, count);
        
        return hand;
    }
}