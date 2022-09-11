package org.example;

public class App
{
    public static void main( String[] args ) {

        System.out.println(sayHello("Java",5, true));
        System.out.println();

        System.out.println("Циклы со счетчиком (один в другом):");
        for (int i=10; i<=20; i++) {
            String str = "";
            for (int k=10; k<=20; k++) {
                str += i * k + " ";
            }
            System.out.println(str);
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

        System.out.println(getSeason(9));

    }

    public static String sayHello(String msg, int num, boolean flag) {
        if (flag) {
            return "Привет " + num + " " + msg + "!!";
        } else {
            return "Пока " + num + " " + msg + "!!";
        }
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