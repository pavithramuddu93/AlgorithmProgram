package com.algorithm;

public class Bshort {
    private static Integer array[] = {52, 14, 35, 2, 45, 210, 5};

    public static void main(String[] args) {
        System.out.println("Before Sorting Data : ");
        printArray(array);
        bubbleSort(array);
        System.out.println("After Sorting Data : ");
        printArray(array);
    }

    private static void bubbleSort(Integer[] array) {
        AlgoUtility algoUtility = new AlgoUtility();
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    algoUtility.swap(array, j - 1, j);
                }

            }
        }
    }

    private static void printArray(Integer[] array) {
        for (int element : array) {
            System.out.println(element);
        }

    }
}