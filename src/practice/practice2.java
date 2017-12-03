package practice;

import java.util.Scanner;

public class practice2 {

     public static int pow(int x, int y) {
         if (y > 1)
             return x * pow(x, y - 1);
         else if (y == 1)
             return x;
         else if (y == 0)
             return 1;
         else
             return 0;
     }


     public static int pow2(int x, int n) {
         if (n > 1)
             return pow2(x, n-1);
         return x;

     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
     //   System.out.println(pow(x,n));
        System.out.println(pow2(x,n));

    }

}
