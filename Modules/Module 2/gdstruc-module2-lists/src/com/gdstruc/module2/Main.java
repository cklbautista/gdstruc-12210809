package com.gdstruc.module2;

// import java.util.ArrayList;
// import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        Player chisa = new Player(1, "Chisa", 100);
        Player dom = new Player(2, "Dom", 67);
        Player flappyJacks = new Player(3, "Keris", 214);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(chisa);
        playerLinkedList.addToFront(dom);
        playerLinkedList.addToFront(flappyJacks);

        playerLinkedList.printList();
    }
}

// Module 2 Part 1
//        List<Player> playerList = new ArrayList<>();
//
//        playerList.add(new Player(1, "Chisa", 100));
//        playerList.add(new Player(2, "Dom", 67));
//        playerList.add(new Player(3, "Keris", 214));
//
//        // System.out.println(playerList.get(1));
//
//        playerList.add(2, new Player(12, "FlappyJacks", 55));
//
//        playerList.remove(2);
//
//        System.out.println(playerList.contains(new Player(2,"Dom", 67)));
//        System.out.println(playerList.indexOf(new Player(2, "Dom", 67)));
//
//
//        for (Player p : playerList)
//        {
//            System.out.println(p);
//        }
//    }