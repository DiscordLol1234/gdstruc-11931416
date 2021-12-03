package com.alejandroaguila;

public class Tree {

    private Node root;

    public void insert(int value)
    {
        if (root == null)
        {
             root = new Node(value);
        }

        else
        {
            root.insert(value);
        }
    }

    public void getMin()
    {
        if (root != null)
        {
            root.getMin();
        }
    }

    public void getMax()
    {
        if (root != null)
        {
            root.getMax();
        }
    }

    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }
    }

    public void traverseInOrderDesc()
    {
        if (root != null)
        {
            root.traverseInOrderDesc();
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }
}
