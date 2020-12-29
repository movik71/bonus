package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 23 задание
        System.out.println("23 задание - вывод последовательных номеров печатаемых страниц");
        System.out.println("Введите номера страниц как в Word-е \n(или нажмите Enter, чтобы использовать номера из примера: 2, 23, 43-32, 3-5)");

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.isEmpty()) {
            s = "2, 23, 43-32, 3-5 eot";
        }
        else {
            s += " eot";
        }

        System.out.println("\nПоследовательные номера страниц: \n");
        PageNumbers pageNumbers = new PageNumbers(s);
        pageNumbers.printConsecutiveNumbers();

        // 24 задание
        System.out.println("\n24 задание - набор непрерывных интервалов");
        System.out.println("Введите последовательность целых чисел, идущих по возрастанию \n(или нажмите Enter, чтобы использовать числа из примера: 1, 2, 3, 6, 7, 8, 10, 12, 13)");

        String s1 = in.nextLine();
        if (s1.isEmpty()) {
            s1 = "1, 2, 3, 6, 7, 8, 10, 12, 13 eot";
        }
        else {
            s1 += " eot";
        }

        System.out.println("\nНабор непрерывных интервалов: \n");
        NumbersInterval numbersInterval = new NumbersInterval(s1);
        numbersInterval.printIntervals();
    }
}
