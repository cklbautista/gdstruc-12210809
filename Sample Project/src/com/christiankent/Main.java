package com.christiankent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       // System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);

        System.out.println("What u name is");
        String name = scanner.nextLine();

        System.out.println("hello " + name);
    }
}