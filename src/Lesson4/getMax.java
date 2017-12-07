package Lesson4;

import java.util.Scanner;

public class getMax {
    public static void main(String[] args) {
        maxGet();
    }
    public static void maxGet(){
        int a = 0;
        int b = 0;
        Scanner kevin = new Scanner(System.in);

        System.out.println("Введите первое число:");
        a = kevin.nextInt();
        System.out.println("Введите второе число:");
        b = kevin.nextInt();

        if (a > b) {
            System.out.println(a + " Наибольшое число");
        } else {
            System.out.println(b + " Наибольшое число");
        }

    }

}

