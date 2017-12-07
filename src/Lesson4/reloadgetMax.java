package Lesson4;

import java.util.Scanner;

public class reloadgetMax {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        scanner.next();
        System.out.println("Введите второе число:");
        scanner.next();

    }

    public static void maxGet(int a, int b) {
        if (a > b) {
            System.out.println(a + " Наибольшое число");
        } else {
            System.out.println(b + " Наибольшое число");
        }


    }
}