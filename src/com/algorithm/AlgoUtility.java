package com.algorithm;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AlgoUtility {

    public <T> void swap(T[] array, int startingIndex, int swapWithIndex) {
        T temp = array[startingIndex];
        array[startingIndex] = array[swapWithIndex];
        array[swapWithIndex] = temp;
    }

    public void swap(char[] array, int startingIndex, int swapWithIndex) {
        char temp = array[startingIndex];
        array[startingIndex] = array[swapWithIndex];
        array[swapWithIndex] = temp;
    }

    public static String[] fileReader(String filePath) throws IOException {
        String line;
        String[] wordsArray = new String[0];

        //Opens a file in read mode
        FileReader file = new FileReader(filePath);
        BufferedReader bufferReader = new BufferedReader(file);

        //Gets each line till end of file is reached
        while ((line = bufferReader.readLine()) != null) {
            //Splits each line into words
            wordsArray = line.split(",");
        }
        bufferReader.close();
        return wordsArray;
    }
}