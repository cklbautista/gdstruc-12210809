package com.gdstruc.quiz4;

public class Main
{
    public static void main(String[] args)
    {

        Player keris = new Player(214, "Keris", 135);
        Player john = new Player(222, "FlappyJacks", 100);
        Player eriond = new Player(333, "sakuizayoi", 150);
        Player rynel = new Player(431, "Darku", 120);
        Player luna = new Player(123, "LunaEclipse", 123);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(keris.getUserName(), keris);
        hashtable.put(john.getUserName(), john);
        hashtable.put(eriond.getUserName(), eriond);
        hashtable.put(rynel.getUserName(), rynel);
        hashtable.put(luna.getUserName(), luna);

        Player removed = hashtable.remove("Keris");

        hashtable.printHashtable();

        if (removed != null)
        {
            System.out.println("\nRemoved player: " + removed);
        }
        else
        {
            System.out.println("\nPlayer to be removed not found.");
        }
    }
}