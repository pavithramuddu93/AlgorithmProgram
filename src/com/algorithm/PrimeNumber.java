package com.algorithm;
import java.util.Scanner;

public class PrimeNumber {

    public static int i, j, flag;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowerLimit, upperLimit;

        System.out.print("Enter lower limit of the range between 0 to 1000 : ");
        lowerLimit = scanner.nextInt();

        System.out.print("Enter upper limit of the range between " + lowerLimit + " to 1000 : ");
        upperLimit = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerLimit + " " + upperLimit + " and are: ");
        findPrimeNumber(lowerLimit, upperLimit);
    }

    private static void findPrimeNumber(int lowerLimit, int upperLimit) {

        for (i = lowerLimit; i <= upperLimit; i++) {
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);

        }
    }
}