package org.example;

public class App
{
    public static void main( String[] args ) {
        sayHello("World!", 17);
        sayHello("Java", 11);
        sayHello("people", 71);
    }

    public static void sayHello(String msg, int num) {
        System.out.println("Hello " + num + " " + msg + "!!");
    }
}

/*
        System.out.println("Hello, World!");
        System.out.println("Hello, Java");
        System.out.println("Hello, people");
 */