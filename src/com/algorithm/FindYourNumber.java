package com.algorithm;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FindYourNumber {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n\t\tThink a Number between 0 ot 100 : ");
        TimeUnit.SECONDS.sleep(3);
        findYourNumber();
    }

    private static void findYourNumber() {
        boolean exit = true;
        int lowerRange = 0, higherRange = 100;
        while (exit) {
            int middle = lowerRange + (higherRange - lowerRange) / 2;
            System.out.println("\n\t\tEnter 'L' If number is less than : " + middle);
            System.out.println("\t\tEnter 'G' If number is grater than : " + middle);
            System.out.println("\t\tEnter 'E' If your number is : " + middle);
            System.out.print("\t\tPlease Select One Option : ");
            char userInput = scanner.nextLine().toUpperCase().charAt(0);

            switch (userInput){
                case 'L':
                    higherRange = middle - 1;
                    break;
                case 'G':
                    lowerRange = middle + 1;
                    break;
                case 'E':
                    System.out.println("\n\t\tYour Number is : " + middle);
                    exit = false;
                    break;
                default:
                    System.out.println("\n\t\tPlease Select Correct Option : ");
            }
        }
    }
}