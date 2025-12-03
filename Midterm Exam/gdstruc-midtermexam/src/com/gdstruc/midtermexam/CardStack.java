package com.gdstruc.midtermexam;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack
{
    private LinkedList<Card> stack;

    public CardStack()
    {
        stack = new LinkedList<>();
    }

    public void push(Card card)
    {
        stack.push(card);
    }

    public Card pop()
    {
        if (isEmpty()) return null;
        return stack.pop();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public int size()
    {
        return stack.size();
    }

    public void printStack()
    {
        ListIterator<Card> iterator = stack.listIterator();

        System.out.println("Player Deck (top to bottom): ");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
