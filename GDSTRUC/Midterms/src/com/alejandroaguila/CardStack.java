package com.alejandroaguila;

import java.util.LinkedList;
import java.util.ListIterator;
import java.lang.Math;

public class CardStack {

    private LinkedList<Card> deck;
    private LinkedList<Card> hand;
    private LinkedList<Card> graveyard;

    int deckDraw = 0;
    int handDiscard = 0;
    int graveyardDraw = 0;

    int handCount = 0;
    int graveyardCount = 0;


    public CardStack()
    {
        deck = new LinkedList<Card>();
        hand = new LinkedList<Card>();
        graveyard = new LinkedList<Card>();
    }

    public void pushDeck(Card card)
    {
        deck.push(card);
    } //ADD TO DECK

    public void getFromGraveyard(Card card) //DRAW FROM GRAVEYARD//
    {
        int randomAmount = 0;
        graveyardDraw = 0;

        int count = 0;

        ListIterator<Card> iterator = graveyard.listIterator();

        while(iterator.hasNext())
        {
            iterator.next();
            count++;
        }

        randomAmount = (int) (Math.random() * (count - 1 + 1) + 1);
        graveyardDraw = randomAmount;

        if (graveyardDraw > count)
        {
            graveyardDraw = count;
        }


            for (int i = 0; i < graveyardDraw; i++)
            {
                hand.push(card);
                popGraveyard();
            }

    }

    public void pushHand(Card card) //DRAW CARDS//
    {
        int randomAmount = 0;
        deckDraw = 0;

        int count = 0;

        ListIterator<Card> iterator = deck.listIterator();

        while(iterator.hasNext())
        {
            iterator.next();
            count++;
        }

        randomAmount = (int) (Math.random() * (count - 5 + 1) + 1);
        deckDraw = randomAmount;

        if (deckDraw > count)
        {
            deckDraw = count;
        }

        //I HAVE NO IDEA WHY, BUT IF THE COUNT IS <= 3, THE PROGRAM DIES//

        if(count == 1)
        {
            hand.push(card);
            popDeck();
        }

        else if(count == 2)
        {
            hand.push(card);
            popDeck();
        }

        else if (count == 3)
        {
            hand.push(card);
            popDeck();
        }

        else
        {
            for (int i = 0; i < deckDraw; i++)
            {
                hand.push(card);
                popDeck();
            }
        }


    }

    public void pushGraveyard(Card card) //DISCARD CARDS//
    {
        int randomAmount = 0;
        handDiscard = 0;

        int count = 0;

        ListIterator<Card> iterator = hand.listIterator();

        while(iterator.hasNext())
        {
            iterator.next();
            count++;
        }

        randomAmount = (int) (Math.random() * (handCount + 5) + 5);
        handDiscard = randomAmount;

        if (handDiscard > count)
        {
            handDiscard = count;
        }


            for (int i = 0; i < handDiscard; i++)
            {
                graveyard.push(card);
                popHand();
            }
    }

    public boolean deckIsEmpty()
    {
        return deck.isEmpty();
    }

    public boolean handIsEmpty()
    {
        return hand.isEmpty();
    }


    public Card popDeck()
    {
        return deck.pop();
    }

    public Card popHand()
    {
        return hand.pop();
    }

    public Card popGraveyard()
    {
        return graveyard.pop();
    }

    public void printDeck()
    {
        int count = 0;

        ListIterator<Card> iterator = deck.listIterator();

        while(iterator.hasNext())
        {
            iterator.next();
            count++;
        }

        System.out.println("There are " + count + " cards in Deck");
    }

    public void printHand()
    {
        int count = 0;

        ListIterator<Card> iterator = hand.listIterator();

        while(iterator.hasNext())
        {
            iterator.next();
            count++;
        }

        System.out.println("There are " + count + " cards in Hand");
    }

    public void printGraveyard()
    {
        int count = 0;

        ListIterator<Card> iterator = graveyard.listIterator();

        while(iterator.hasNext())
        {
            iterator.next();
            count++;
        }

        System.out.println("There are " + count + " cards in Graveyard");
    }
}
