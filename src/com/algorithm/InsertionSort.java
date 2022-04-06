package com.algorithm;

import com.algorithm.AlgoUtility;
import java.io.IOException;
import static com.algorithm.AlgoUtility.fileReader;

public class InsertionSort {
    private static String[] dataArray;

    public static void main(String[] args) throws IOException {
        dataArray = fileReader("E:\\BridgeLabs Training\\Java\\Data Structure\\AlgorithmPrograms\\src\\Data.csv");
        System.out.println("Before sorting : ");
        printArray();
        insertionSort(dataArray);
        System.out.println();
        System.out.println("After sorting : ");
        printArray();

    }

    static String[] insertionSort(String[] Data) {
        AlgoUtility algoUtility = new AlgoUtility();
        int n = Data.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (Data[j - 1].compareTo(Data[j]) > 0)
                    algoUtility.swap(Data, j - 1, j);
                else break;
            }
        }
        return Data;
    }

    private static void printArray() {
        for (String i : dataArray) {
            System.out.println(i);
        }
    }

}