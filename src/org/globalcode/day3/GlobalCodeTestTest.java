package org.globalcode.day3;

import org.globalcode.day3.models.Deck;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GlobalCodeTestTest {

    @Test
    public void isCardDeck52Cards(){
        Deck.setUp();
        assertEquals("Card Deck Number Check", 52, Deck.cards.size());
    }

    @Test
    public void isShuffledCard52(){
        Deck.setUp();
        Deck.shuffle();
        assertEquals("Shuffled Deck Card Number Check", 52, Deck.cards.size());
    }

}