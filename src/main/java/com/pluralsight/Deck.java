package com.pluralsight;

import java.util.ArrayList;

public class Deck {
    private final ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String ignored : suits) {
            for (String value : values) {
                Card card = new Card(value);
                cards.add(card);
            }
        }
    }

    public Card deal() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        } else {
            return null;
        }
    }
}
