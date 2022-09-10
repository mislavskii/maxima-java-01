package org.example;

public class App
{
    public static void main( String[] args ) {
        mySubProgram("Hello, World!");
        mySubProgram("Hello, Java");
        mySubProgram("Hello, people");
    }

    public static void mySubProgram(String msg) {
        System.out.println(msg);
    }
}

/*
        System.out.println("Hello, World!");
        System.out.println("Hello, Java");
        System.out.println("Hello, people");
 */