package com.alejandroaguila;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Card card = new Card("Insert Card Name Here");

        CardStack cardStack = new CardStack();

        for (int i = 0; i < 30; i ++)  //INITIALIZATION//
        {
            cardStack.pushDeck(card);
        }

        while(!cardStack.deckIsEmpty())
        {
            //START OF TURN//

            cardStack.pushHand(card);

            //RANDOM ACTION PER TURN//
            int randomAction = (int) (Math.random() * (3 - 1 + 1) + 1);

            if (randomAction == 1 && randomAction != 2 &&randomAction != 3)
            {
                //DRAW CARDS//
                cardStack.pushHand(card);
            }

            else if (randomAction == 2 && randomAction != 1 &&randomAction != 3)
            {
                //DISCARD CARDS//
                cardStack.pushGraveyard(card);
            }

            else if (randomAction == 3 && randomAction != 1 &&randomAction != 2)
            {
                //GET FROM GRAVEYARD;
                cardStack.getFromGraveyard(card);
            }

            cardStack.printDeck();
            cardStack.printHand();
            cardStack.printGraveyard();


            System.out.println("\n____________________\n\n");
        }

        System.out.println("GAME OVER\n");
    }
}
