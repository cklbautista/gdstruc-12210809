package com.gdstruc.midtermexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        CardStack deck = new CardStack();
        CardStack discardPile = new CardStack();
        List<Card> playerHand = new ArrayList<>();

        // create 30 cards
        for (int i = 1; i <= 30; i++) {
            deck.push(new Card("Card " + i));
        }

        int turn = 1;

        // game loop
        while (!deck.isEmpty()) {

            System.out.println("\n--- Turn " + turn + " ---");

            int command = random.nextInt(3); // 0 = draw, 1 = discard, 2 = get from discarded pile
            int amount = random.nextInt(5) + 1; // 1 to 5 cards

            switch (command) {

                case 0: // draw
                    System.out.println("Command: Draw " + amount + " cards from the deck");
                    for (int i = 0; i < amount; i++) {
                        Card drawn = deck.pop();
                        if (drawn == null) break;      // stop if deck is empty
                        playerHand.add(drawn);
                    }
                    break;

                case 1: // discard
                    System.out.println("Command: Discard " + amount + " cards");
                    for (int i = 0; i < amount; i++) {
                        if (playerHand.isEmpty()) break;
                        Card removed = playerHand.remove(playerHand.size() - 1);
                        discardPile.push(removed);
                    }
                    break;

                case 2: // get from discarded pile
                    System.out.println("Command: Get " + amount + " cards from discard pile");
                    for (int i = 0; i < amount; i++) {
                        Card taken = discardPile.pop();
                        if (taken == null) break;
                        playerHand.add(taken);
                    }
                    break;
            }

            // print player hand
            System.out.println("\nPlayer Hand:");
            if (playerHand.isEmpty()) {
                System.out.println("(empty)");
            } else {
                for (Card c : playerHand) {
                    System.out.println(c);
                }
            }

            System.out.println("\nNumber of cards in hand: " + playerHand.size());
            System.out.println("Remaining cards in deck: " + deck.size());
            System.out.println("Cards in discard pile: " + discardPile.size());

            // for playing out every turn (comment out ito see program end)
            System.out.println("\nPress Enter to continue...");
            new java.util.Scanner(System.in).nextLine();
            turn++;
        }

        System.out.println("\nGame Over! The deck is empty.");
    }
}
