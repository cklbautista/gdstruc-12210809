package com.gdstruc.quiz2;

public class Main
{

    public static void main(String[] args)
    {
        Player chisa = new Player(1, "Chisa", 100);
        Player dom = new Player(2, "Dom", 67);
        Player keris = new Player(3, "Keris", 214);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(keris);
        playerLinkedList.addToFront(dom);
        playerLinkedList.addToFront(chisa);

        playerLinkedList.printList();

        PlayerNode removed = playerLinkedList.removeFirst();
        System.out.println("Removed: " + removed);

        playerLinkedList.printList();

        System.out.println("\ncontains() and indexOf() test:");
        System.out.println(playerLinkedList.contains(dom)); // should show true
        System.out.println(playerLinkedList.indexOf(dom)); // should show 0 since the head is removed

        Player amongus = new Player(143, "amongus", 1);
        System.out.println(playerLinkedList.contains(amongus)); // should show false since its not actually added to the list
        System.out.println(playerLinkedList.indexOf(amongus)); // should show -1 since its not actually added to the list
    }
}