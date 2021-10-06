package com.alejandroaguila;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        Player asuna = new Player(1, "Asuna", 100);
        Player lethalbacon = new Player(2, "LethalBacon", 205);
        Player hpdeskjet = new Player(3, "HpDeskJet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalbacon);
        playerLinkedList.addToFront(hpdeskjet);

        playerLinkedList.Contains(asuna);
        playerLinkedList.indexOf(lethalbacon);

        playerLinkedList.printList();
        System.out.println();
    }
}
