package com.gdstruc.module3;

public class Main
{

    public static void main(String[] args)
    {

        LinkedStack stack = new LinkedStack();

        stack.push(new Player(1, "keris", 100));
        stack.push(new Player(2, "flappyjacks", 95));
        stack.push(new Player(3, "sakuizayoi", 90));
        stack.push(new Player(4, "darku", 85));

        stack.printStack();

        System.out.println("Peeking: " + stack.peek());

        // stack.printStack();
    }
}
