package org.globalcode.day3;

import org.globalcode.day3.models.CardValue;

import java.util.LinkedList;
import java.util.List;

public class GlobalCodeTest {

    public static void main(String[] args) {

        List<CardValue> cardValues = new LinkedList<>();
        cardValues.add(CardValue.FIVE);
        System.out.println(cardValues.get(0).getValue());
    }
}
