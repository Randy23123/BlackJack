package com.pluralsight;

public class Card {
    private final String value;
    private boolean isFaceUp;
    public Card(String value) {
        this.value = value;
        this.isFaceUp = false;
    }
    public Integer getPointValue(int totalValue) {
        if (isFaceUp) {
            if (value.equals("A")) {
                // this calculates the total value of the hand based on the cards present in the hand.
                if (totalValue <= 10) {
                    return 11; //if it doesn't go over 21 returns 11
                } else {
                    return 1; //if it goes over 21 it returns 1
                }
            } else if (value.equals("K") || value.equals("Q") || value.equals("J")) {
                return 10;
            } else {
                try {
                    return Integer.parseInt(value);
                } catch (NumberFormatException e) {
                    return null; // Handle invalid card values
                }
            }
        } else {
            return null;
        }
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }
}
