package org.example;

public class App
{
    public static void main( String[] args ) {
        System.out.println(sayHello("Java",5, false));
        System.out.println(getSeason(13));
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
                result = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                result = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                result = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                result = "Autumn";
                break;
            default:
                result = "Unknown season";
        }
        return result;
    }

}