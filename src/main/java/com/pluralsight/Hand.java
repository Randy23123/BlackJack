package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private final ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    // A Card is dealt to the Hand and the Hand is responsible
// to store the card
    public void deal(Card card) {
        cards.add(card);
    }

    // The Hand uses the methods of each card to determine
// the value of each card - and adds up all values
    public int getValue() {
        int totalValue = 0;
        int numAces = 0;

        for (Card card : cards) {
            card.flip(); // turn the card over to see the value
            Integer cardValue = card.getPointValue(totalValue);

            if (cardValue == null) {
                //for invalid card values
                return -1;
            }
            if (cardValue == 11) {
                numAces++;
            }
            totalValue += cardValue;

            //this for the card class it adjusts the value of aces if the total goes over 21
            while(totalValue > 21 && numAces > 0){
                //changes the value of ace from 11 to 1
                totalValue -= 10;
                numAces --;
            }
            card.flip();//hides the card
        }
        return totalValue;
    }
}
