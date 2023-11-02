package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void testAceAs11() {
        Card aceCard = new Card("A");
        aceCard.flip();

        int pointValue = aceCard.getPointValue(10); // Total value is 10, Ace should be worth 11
        assertEquals(11, pointValue);
    }

    @Test
    void testAceAs1() {
        Card aceCard = new Card("A");
        aceCard.flip();

        int pointValue = aceCard.getPointValue(15); // Total value is 15, Ace should be worth 1
        assertEquals(1, pointValue);
    }

    @Test
    void testFaceCard() {
        Card kingCard = new Card("K");
        kingCard.flip();

        int pointValue = kingCard.getPointValue(0); // Total value doesn't matter for face cards
        assertEquals(10, pointValue);
    }

    @Test
    void testNumericCard() {
        Card sevenCard = new Card("7");
        sevenCard.flip();

        int pointValue = sevenCard.getPointValue(0);
        assertEquals(7, pointValue);
    }

    @Test
    void testInvalidCard() {
        Card invalidCard = new Card("X"); // An invalid card value
        invalidCard.flip();

        Integer pointValue = invalidCard.getPointValue(0);
        assertNull(pointValue); // Invalid card value should return null
    }
}