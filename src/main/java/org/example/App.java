package org.example;

public class App
{
    public static void main( String[] args )
    {
        int a = 17;
        int b = 11;

        System.out.println("a = " + a + ", b = " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("a = " + a + ", b = " + b);
    }
}
