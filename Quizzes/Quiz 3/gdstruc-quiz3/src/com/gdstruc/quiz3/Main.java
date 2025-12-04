package com.gdstruc.quiz3;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        ArrayQueue matchmakingQueue = new ArrayQueue(10);

        int totalGames = 0;
        int playerIdCounter = 1;

        while (totalGames < 10)
        {
            System.out.println("\n--- Turn Start ---");

            int playersJoining = random.nextInt(7) + 1;

            System.out.println(playersJoining + " player(s) joined the queue.");

            for (int i = 0; i < playersJoining; i++)
            {
                Player newPlayer = new Player(
                        playerIdCounter,
                        "Player " + playerIdCounter,
                        random.nextInt(100) + 1
                );

                matchmakingQueue.add(newPlayer);
                playerIdCounter++;
            }

            System.out.println("\nCurrent Queue (" + matchmakingQueue.size() + " players):");
            matchmakingQueue.printQueue();

            if (matchmakingQueue.size() >= 5)
            {
                System.out.println("\nA match is starting.");
                System.out.println("Players in this match:");

                for (int i = 0; i < 5; i++)
                {
                    Player matched = matchmakingQueue.remove();
                    System.out.println(matched);
                }

                totalGames++;
                System.out.println("\nGame " + totalGames + " started.\n");
            }

            System.out.println("Press Enter to continue to next turn...");
            scanner.nextLine();
        }

         System.out.println("\nAll 10 games created.");
    }
}
