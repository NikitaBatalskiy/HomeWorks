package com.skillsup.ARRAYS;

public class Arr {
    public static void main(String[] args) {
        // Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder).
        int[] array = {2, 3, 1, 7, 11};
        int[] reversedArray = new int[5];
        System.out.println("Array: ");
        for (int arr : array) {
            System.out.println(arr);
        }
        System.out.println("\nArray after sorting: ");
        int index = 4;
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[index];
            System.out.println(reversedArray[i]);
            index--;
        }
        // You get an array of numbers(should contain both positive and negative numbers), and return the sum of all the positive ones.
        // (If there are nothing to sum, sum should be 0)
        int[] myArray = {5, -2, 16, -7, 13, -10};
        int Sum = 0;
        boolean plus = true;
        System.out.println("\nMy Array: ");
        for (int num : myArray) {
            System.out.println(num);
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0) {
                Sum += myArray[i];
                plus = true;
            }
        }
        if (plus == true) {
            System.out.println("\nSum from myArray: " + Sum);
        } else {
            System.out.println("\nSum from myArray: " + Sum);
        }
        // You get an array of numbers, return the average of a list of numbers in this array. (Example -  array{1,2,4,1} -> avg = 2)
        int[] avg = {8, 7, 6, 4, 3, 10};
        double avgSum = 0;
        int count = 0;
        for (int i = 0; i < avg.length; i++) {
            avgSum += avg[i];
            count++;
        }
        avgSum = avgSum / count;
        System.out.println("\nAvg: " + avgSum);
        // You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0. Result should be  next: {3,2,0,1,4,0,8,0}
        int[] duplicateArray = {3, 2, 3, 1, 4, 2, 8, 3};
        System.out.println("\nArray with duplicates: ");
        for (int dupl: duplicateArray) {
            System.out.println(dupl);
        }
        System.out.println("\nArray with replaced duplicates: ");
        for (int i = 0; i < duplicateArray.length; i++) {
            for (int j = i + 1; j < duplicateArray.length; j++) {
                if (duplicateArray[i] == duplicateArray[j]) {
                    duplicateArray[j] = 0;
                }
            }
            System.out.println(duplicateArray[i]);
        }
    }
}
