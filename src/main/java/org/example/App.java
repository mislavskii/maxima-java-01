package org.example;

public class App
{
    public static void main( String[] args ) {
        System.out.println(sayHello("World!", 17));
        System.out.println(sayHello("Java", 11));
        System.out.println(sayHello("people", 71));
    }

    public static String sayHello(String msg, int num) {
       return "Hello " + num + " " + msg + "!!";
    }
}

/*
        System.out.println("Hello, World!");
        System.out.println("Hello, Java");
        System.out.println("Hello, people");
        System.out.println("Hello " + num + " " + msg + "!!");
 */