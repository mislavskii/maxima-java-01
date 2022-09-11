package org.example;

public class App
{
    public static void main( String[] args ) {
        System.out.println(sayHello("Java",5, false));
    }

    public static String sayHello(String msg, int num, boolean flag) {
        if (flag) {
            return "Hello " + num + " " + msg + "!!";
        } else {
            return "Good bye " + num + " " + msg + "!!";
        }
//        return "Hello " + num + " " + msg + "!!";
    }



/*
        public static int factorial(int n) {
        return n == 1 ? n : n * factorial(n-1);
    }

    public static  long fibonazzi (byte N) {
        byte a = 0;
        byte b = 1;
        byte c;
        return N == 0 ? N : a + b; a = b; b = c; N--;
    }
*/
}