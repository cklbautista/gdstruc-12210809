package com.gdstruc.module4;

public class Main
{
    public static void main(String[] args)
    {
        ArrayQueue queue = new ArrayQueue(5);

        queue.add(new Player(1, "keris", 100));
        queue.add(new Player(2, "flappyjacks", 95));
        queue.add(new Player(3, "sakuizayoi", 90));
        queue.add(new Player(4, "darku", 85));

        queue.printQueue();
        // queue.add(new Player(5, "lunaeclipse", 90));

        System.out.println("\nAfter popping " + queue.remove());
        queue.printQueue();
    }
}
