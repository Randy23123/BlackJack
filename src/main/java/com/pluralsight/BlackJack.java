package com.pluralsight;

public class BlackJack {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand1 = new Hand();
        // deal 5 cards
        for(int i = 0; i < 5; i++) {
            // get a card from the deck
            Card card = deck.deal();
            deck.shuffle();
            // deal that card to the hand
            if (card != null) {
                hand1.deal(card);
            } else {
                // Handle the case where there are no more cards in the deck
                System.out.println("No more cards in the deck.");
                break;
            }
        }
        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);
    }
}