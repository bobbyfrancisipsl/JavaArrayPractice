package love.programming;

import java.sql.SQLOutput;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] myIntArray1 = new int[100];
        String[] myString = {"bobby", "francis", "jyothi"};

        System.out.println(myString[0]);
        System.out.println(myString[1]);
        System.out.println(myString[2]);

        int arrayValues[] = {1, 2, 3, 4, 5};
        int sumArray = 0;
        for (int i = 0; i < arrayValues.length; i++) {
            sumArray = sumArray + arrayValues[i];
            System.out.println(sumArray);
        }

        System.out.println("Sum of array: " + sumArray);
        System.out.println("Average of array: " + sumArray / arrayValues.length);
    }
}