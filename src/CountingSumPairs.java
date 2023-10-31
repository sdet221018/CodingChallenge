package com.edureka;

import java.util.Scanner;

public class CountingSumPairs {
    public static int countPairsWithSum(int[] arr, int X) {
        int count = 0;
        int m = arr.length;

        for(int i = 0; i < m; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == X) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the target sum (X): ");
        int X = scanner.nextInt();

        int result = countPairsWithSum(arr, X);
        System.out.println("Count of pairs with sum " + X + " is " + result);
        scanner.close();
    }
}
