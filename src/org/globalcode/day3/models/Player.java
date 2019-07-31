package org.globalcode.day3.models;

import java.util.List;

public class Player {

    public static final int TOTAL_CARDS = 52;

    private List<CardValue> cardValues;

    private int totalCardsValue;


    public Player(List<CardValue> cardValues) {
        this.cardValues = cardValues;
    }

    private void handPlayerACard(CardValue cardValue){
        this.cardValues.add(cardValue);
    }

    private int getTotalCardsValue() {
        int totalValue = 0;
        for(CardValue cardValue : this.cardValues){
            totalValue += cardValue.getValue();
        }
        return totalValue;
    }


}
