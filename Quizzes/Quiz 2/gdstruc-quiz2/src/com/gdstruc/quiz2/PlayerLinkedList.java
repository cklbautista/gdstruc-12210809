package com.gdstruc.quiz2;

public class PlayerLinkedList
{
    private PlayerNode head;
    private int size;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++; // increase size
    }

    public PlayerNode removeFirst()
    {
        if (head == null)
        {
            return null;
        }

        PlayerNode removedNode = head;
        head = head.getNextPlayer();
        removedNode.setNextPlayer(null);

        size--; // decrease size

        return removedNode;
    }

    public int getSize()
    {
        return size;
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
        System.out.println("Size: " + size);
    }

    public boolean contains(Player player)
    {
        PlayerNode current = head;

        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }

    public int indexOf(Player player)
    {
        PlayerNode current = head;
        int index = 0;

        while (current != null)
        {
            if (current.getPlayer().equals(player))
            {
                return index;
            }
            current = current.getNextPlayer();
            index++;
        }
        return -1;
    }
}

