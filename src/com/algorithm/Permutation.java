package com.algorithm;
import com.algorithm.AlgoUtility;
public class Permutation {

    private static char[] charactersArray;

    private static void permutations(char[] charactersArray, int startingIndex) {
        AlgoUtility algoUtility = new AlgoUtility();

        if (startingIndex == charactersArray.length - 1) {
            System.out.println(String.valueOf(charactersArray));
        }

        for (int i = startingIndex; i < charactersArray.length; i++) {
            algoUtility.swap(charactersArray, startingIndex, i);
            permutations(charactersArray, startingIndex + 1);
            algoUtility.swap(charactersArray, startingIndex, i);
        }
    }

    public static void main(String[] args) {
        String inputString = "ABCD";
        charactersArray = inputString.toCharArray();
        permutations(charactersArray, 0);
    }
}