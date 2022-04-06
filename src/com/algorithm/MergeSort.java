package com.algorithm;

public class MergeSort {

       public static void main(String[] args) {

        String[] stringArray = new String[]{"fgh", "jkl", "zxc", "vbn", "anil", "bbc"};

        System.out.println("Unsorted Array : ");
        printArray(stringArray);

        MergeSort ob = new MergeSort();
        ob.sort(stringArray, 0, stringArray.length - 1);

        System.out.println("\nSorted array : ");
        printArray(stringArray);
    }

    private static void sort(String[] stringArray, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            // Find the middle point.
            int middle = (leftIndex + rightIndex) / 2;

            // Sort first and second halves.
            sort(stringArray, leftIndex, middle);
            sort(stringArray, middle + 1, rightIndex);

            // Merge the sorted halves.
            merge(stringArray, leftIndex, middle, rightIndex);
        }
    }

    private static void merge(String[] stringArray, int leftIndex, int middle, int rightIndex) {
        // Find sizes of two sub-arrays to be merged.
        int num1 = middle - leftIndex + 1;
        int num2 = rightIndex - middle;

        /* Create temp arrays */
        String[] leftArray = new String[num1];
        String[] rightArray = new String[num2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < num1; ++i)
            leftArray[i] = stringArray[leftIndex + i];
        for (int j = 0; j < num2; ++j)
            rightArray[j] = stringArray[middle + 1 + j];

        /* Merge the temp arrays */

        int i = 0, j = 0;
        int k = leftIndex;

        while (i < num1 && j < num2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                stringArray[k] = leftArray[i];
                i++;
            } else {
                stringArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of leftArray[] if any */
        while (i < num1) {
            stringArray[k] = leftArray[i];
            i++;
            k++;
        }

        /* Copy remaining elements of rightArray[] if any */
        while (j < num2) {
            stringArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static void printArray(String stringArray[]) {
        for (int i = 0; i < stringArray.length; ++i)
            System.out.print(stringArray[i] + " ");
        System.out.println();
    }
}