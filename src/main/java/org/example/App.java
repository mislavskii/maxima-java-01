package org.example;

public class App
{
    public static void main( String[] args ) {
        sayHello("World!");
        sayHello("Java");
        sayHello("people");
    }

    public static void sayHello(String msg) {
        System.out.println("Hello " + msg + "!!");
    }
}

/*
        System.out.println("Hello, World!");
        System.out.println("Hello, Java");
        System.out.println("Hello, people");
 */