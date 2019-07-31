package org.globalcode.day3.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Deck {
    public final static List<Card> cards = new ArrayList<>();

    public static void setUp(){
        for(Suit s : Suit.values()){
            for(CardValue v : CardValue.values()){
                Card card = new Card(s, v);
                cards.add(card);
            }
        }
    }

    public static  void shuffle(){
        Collections.shuffle(cards);
    }

    private int getTotalCardsValue(List<Card> cards) {
        int totalValue = 0;
        for(Card card : cards) {
            totalValue += card.getValue().getValue();
        }
        return totalValue;
    }


}
