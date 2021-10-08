package com.alejandroaguila;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);

        ArrayQueue queue = new ArrayQueue(5);

        int matchesFound = 0;
        int queueSize = 0;

        Player player = new Player("Insert Player Name Here");

        while (true)
        {
            System.out.println( matchesFound + " GAMES HAVE BEEN FOUND\n");

            int playersQueued = (int) (Math.random() * (7 - 1 + 1) + 1);

            for (int i = 0; i < playersQueued; i++)
            {
                queueSize++;
                queue.add(player);
            }

            System.out.println("There are " + queueSize + " players in Queue");

            if (queueSize >= 5)
            {
                System.out.println("\nGAME FOUND");
                matchesFound++;

                for (int i = 0; i < 5; i++)
                {
                    queue.remove(queueSize);
                    queueSize--;
                }

                System.out.println("There are now " + queueSize + " players in Queue");
            }

            if (matchesFound >= 10)
            {
                System.out.println("\n_______________________");
                System.out.println( matchesFound + " GAMES HAVE BEEN FOUND\n");
                System.out.println("ALL PLAYERS HAVE FOUND A GAME");
                break;
            }


            System.out.println("Press Enter to continue...");
            System.out.println("_______________________");
            String temp = input.nextLine();
        }

    }
}
