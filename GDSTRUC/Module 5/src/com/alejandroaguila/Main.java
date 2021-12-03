package com.alejandroaguila;
import com.alejandroaguila.Player;
import com.alejandroaguila.SimpleHashTable;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player ploo = new Player(134, "Plooful", 135);
        Player wardell = new Player(5, "TSM Wardell", 123);
        Player deadlyJimmy = new Player(12, "DeadlyJimmy", 536);
        Player subroza = new Player(57, "Subroza", 83);
        Player annieDro = new Player(95, "C9 Annie", 92);

        SimpleHashTable hashtable = new SimpleHashTable();

        hashtable.put(ploo.getName(), ploo);
        hashtable.put(wardell.getName(), wardell);
        hashtable.put(deadlyJimmy.getName(), deadlyJimmy);
        hashtable.put(subroza.getName(), subroza);
        hashtable.put(annieDro.getName(), annieDro);

        hashtable.remove("TSM Wardell");
        hashtable.printHashtable();


        //System.out.println(hashtable.get("TSM Wardell"));
    }
}
