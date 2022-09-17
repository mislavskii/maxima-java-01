package org.example;

import java.util.Random;

@SuppressWarnings("StringConcatenationInLoop")
public class App {

    public static void main( String[] args ) {
        Random rand = new Random();
        int month = (rand.nextInt(12) + 1);
        int year = rand.nextInt(9998) + 1;
        System.out.println(month + " / " + year);

        System.out.println(daysCount((byte) month, year));
    }

    public static byte daysCount(byte month, int year) {
        switch(month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeap(year)) {return 29;} else {return 28;}
            default:
                return 31;
        }
    }

    static boolean isLeap (int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    static long a = 0;
    static long b = 1;
    static long F;
    public static long fibonazzi(byte N) {
        F = a + b; a = b; b = F;
        return N <= 1 ? N : fibonazzi((byte) (N-1)) + fibonazzi((byte) (N-2));
    }

    public static long fiboNoRec(byte N) {
        if (N <= 1) {
            return N;
        } else {
            byte i = N;
            while (i > 1) {
                F = a + b;
                System.out.println(F);
                a = b;
                b = F;
                i--;
            }
            return F;
        }
    }

    public static String sayHello(String msg, int num, boolean flag) {
        if (flag) {
            return "Привет " + num + " " + msg + "!!";
        } else {
            return "Пока " + num + " " + msg + "!!";
        }
    }

    public static void arrays() {
        System.out.println("Arrays");

        int[] nums3 = {1,2,3,4,5,6};

        for (int value : nums3) {
            System.out.println(value);
        }
        System.out.println();

        nums3[3] = 10;
        nums3[1] = 20;

        for (int i: nums3) {
            System.out.println(i);
        }

    }

    public static void cycles() {
        System.out.println("Циклы со счетчиком (один в другом):");
        String head = "   ";
        for (int i=10; i<=20; i++) {
            head += "  " + i;
        }
        System.out.println(head);
        for (int i=10; i<=20; i++) {
            String row = i + " ";
            for (int k=10; k<=20; k++) {
                row += " " + i * k;
            }
            System.out.println(row);
        }
        System.out.println();

        System.out.println("Цикл с предусловием:");
        int i = 0;
        while (i<5) {
            System.out.println(i);
            i++;
        }
        System.out.println();

        System.out.println("Цикл с постусловием:");
        int j = 0;
        do {
            j++;
            System.out.println(j);
        } while (j<5);
        System.out.println();
    }

    public static String getSeason (int month) {
        String result;
        switch (month) {
            case 1:
            case 2:
            case 12:
                result = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                result = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                result = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                result = "Осень";
                break;
            default:
                result = "Сезон не определен";
        }
        return result;
    }

}