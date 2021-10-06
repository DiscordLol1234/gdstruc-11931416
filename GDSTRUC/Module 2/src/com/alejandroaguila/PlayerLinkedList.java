package com.alejandroaguila;

public class PlayerLinkedList {

    int size = 0;
    int position = 3;
    int indexNum = -1;
    boolean exists = true;

    private PlayerNode head;
    private PlayerNode headCheck;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void Contains(Player player)
    {
        PlayerNode current = head;

        int count = 0;
        boolean exists = false;

        while(current != null)
        {
            count++;
            current = current.getNextPlayer();

            if (player.getId() == count)
            {
                System.out.print(player.getName() + " exists\n\n");
                exists = true;
            }

            else if (count == 3 && exists == false)
            {
                System.out.print(player.getName() + " no longer exists\n\n");
            }
        }
    }

    public void indexOf(Player player)
    {
        PlayerNode current = head;

        int count = 0;

        while(current != null)
        {
            count++;
            current = current.getNextPlayer();

            if (player.getId() == count)
            {
                System.out.print(player.getName() + " exists at index " + (count-2) + "\n\n");
            }
        }
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.print("HEAD -> ");

            while (current != null)
            {
                size++;

                if (position == 3) //DELETES HP DESKJET//
                {
                    current = current.getNextPlayer();
                    size--;
                }

                else
                {
                    System.out.print(current.getPlayer());
                    System.out.print(" -> ");
                    current = current.getNextPlayer();
                }

                position--;

            }



        System.out.print("NULL");
        System.out.println("\nList Size: " + size);
    }


}
