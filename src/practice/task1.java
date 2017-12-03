package practice;


import java.util.Arrays;

public class task1 {


    public static int maxIndex(int[] array) {
        int indexmax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexmax])
                indexmax = i;

        }
        return indexmax;
    }

    public static int maxValue(int[] array) {
        return array[maxIndex(array)];
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 10, 150};
        System.out.println(maxIndex(array)+ " "+maxValue(array));



    }


}