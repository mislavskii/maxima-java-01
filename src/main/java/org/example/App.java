package org.example;

@SuppressWarnings("StringConcatenationInLoop")
public class App
{
    public static void main( String[] args ) {

        System.out.println(sayHello("Java",5, true));
        System.out.println();

        System.out.println("Arrays");
        int nums[];
        nums = new int[4];  // initialized with number of members
        int[] nums2 = new int[] {1,2,3,4,5};
        int[] nums3 = {1,2,3,4,5,6};

        for (int i = 0; i < nums3.length; i++) {
            System.out.println(nums3[i]);
        }
        System.out.println();

        nums3[3] = 10;
        nums3[1] = 20;

        for (int i: nums3) {
            System.out.println(i);
        }
        System.out.println();

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