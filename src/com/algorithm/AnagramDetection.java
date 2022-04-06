package com.algorithm;

public class AnagramDetection {

    public static void main(String[] args) {
        String firstString = "abcd";
        String secondString = "dcba";

        // two string may be anagram of they are same in length, character wise.
        if (firstString.length() != secondString.length()) {
            System.out.println("Both string are not anagram");
        }else {
            char[] firstArray = firstString.toCharArray();
            char[] secondArray = secondString.toCharArray();

            anagramDetection(firstArray, secondArray);
        }
    }

    private static void anagramDetection(char[] firstArray, char[] secondArray) {
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    count += 1;
                }
            }
        }
        if (count == firstArray.length){
            System.out.println("Both strings are anagram");
        }else {
            System.out.println("Both strings are not anagram");
        }

    }
}