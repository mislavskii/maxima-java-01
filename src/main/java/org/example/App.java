package org.example;

public class App
{
    public static void main( String[] args ) {
        System.out.println(factorial(4));
    }

    public static int factorial(int n) {
        return n == 1 ? n : n * factorial(n-1);
    }
}

/*
        System.out.println("Hello, World!");
        System.out.println("Hello, Java");
        System.out.println("Hello, people");
        System.out.println("Hello " + num + " " + msg + "!!");
 */