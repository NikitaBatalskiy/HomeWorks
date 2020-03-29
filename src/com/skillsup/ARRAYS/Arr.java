package com.skillsup.ARRAYS;

public class Arr {
    public static void main(String[] args) {

        // Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder).
        int[] array = {2, 3, 1, 7, 11};
        int[] reversedArray = new int[5];
        int counter = 0;
        System.out.print("First task \nArray: ");
        for (int arr : array) {
            if (counter == array.length - 1){
                System.out.print(arr + ";");
            }
            else {
                System.out.print(arr + ", ");
            }
            counter++;
        }
        System.out.print("\nArray in a reverse order: ");
        int index = 4;
        counter = 0;
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[index];
            if (counter == array.length - 1){
                System.out.print(reversedArray[i] + ";");
            }
            else {
                System.out.print(reversedArray[i] + ", ");
            }
            counter++;
            index--;
        }

        // You get an array of numbers(should contain both positive and negative numbers), and return the sum of all the positive ones.
        // (If there are nothing to sum, sum should be 0)
        int[] myArray = {5, -2, 16, -7, 13, -10};
        int Sum = 0;
        counter = 0;
        System.out.print("\n\nSecond task\nMyArray: ");
        for (int num : myArray) {
            if (counter == myArray.length - 1){
                System.out.print(num + ";");
            }
            else {
                System.out.print(num + ", ");
            }
            counter++;
        }
        for (int aMyArray : myArray) {
            if (aMyArray > 0) {
                Sum += aMyArray;
            }
        }
        System.out.println("\nSum from myArray: " + Sum);

        // You get an array of numbers, return the average of a list of numbers in this array. (Example -  array{1,2,4,1} -> avg = 2)
        int[] avg = {8, 9, 6, 4, 5, 10};
        double avgSum = 0;
        counter = 0;
        System.out.print("\nThird task\nArray: ");
        for (int ar: avg) {
            if (counter == avg.length - 1){
                System.out.print(ar + ";");
            }
            else {
                System.out.print(ar + ", ");
            }
            counter++;
        }
        counter = 0;
        for (int anAvg : avg) {
            avgSum += anAvg;
            counter++;
        }
        avgSum = avgSum / counter;
        System.out.println("\nAvg: " + avgSum);

        // You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0. Result should be  next: {3,2,0,1,4,0,8,0}
        int[] duplicateArray = {3, 2, 3, 1, 4, 2, 8, 3};
        counter = 0;
        System.out.print("\nFourth task\nArray with duplicates: ");
        for (int dupl : duplicateArray) {
            if (counter == duplicateArray.length - 1){
                System.out.print(dupl + ";");
            }
            else {
                System.out.print(dupl + ", ");
            }
            counter++;
        }
        counter = 0;
        System.out.print("\nArray with replaced duplicates: ");
        for (int i = 0; i < duplicateArray.length; i++) {
            for (int j = i + 1; j < duplicateArray.length; j++) {
                if (duplicateArray[i] == duplicateArray[j]) {
                    duplicateArray[j] = 0;
                }
            }
            if (counter == duplicateArray.length - 1){
                System.out.print(duplicateArray[i] + ";");
            }
            else {
                System.out.print(duplicateArray[i] + ", ");
            }
            counter++;
        }
    }
}
