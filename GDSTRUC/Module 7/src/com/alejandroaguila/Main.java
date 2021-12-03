package com.alejandroaguila;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Tree tree = new Tree();

        tree.insert(31);
        tree.insert(17);
        tree.insert(45);
        tree.insert(3);
        tree.insert(8);
        tree.insert(26);
        tree.insert(39);
        tree.insert(32);
        tree.insert(63);
        tree.insert(12);

        tree.traverseInOrder();
        System.out.println();
        tree.traverseInOrderDesc();

        System.out.println();

        tree.getMin();
        tree.getMax();
    }
}
