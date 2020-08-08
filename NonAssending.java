package com.stackroute.PE1;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class NonAssending {
    static void sort(int n) {
        int mod, i = 0, c = 0, temp, sum = 0;
        int a[] = new int[15];
        while (n >= 1) {
            mod = n % 10;
            a[i] = mod;
            n = n / 10;
            c++;
            i++;
        }
        for (i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted in non-increasing order: ");
        for (i = 0; i < c; i++) {
            System.out.print(a[i]);
            if (a[i] % 2 == 0)
                sum = sum + a[i];
        }
        System.out.println("");
        System.out.println("Sum of even numbers = " + sum);
        if (sum >= 15)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number: ");
    n=sc.nextInt();
    NonAssending.sort(n);
    }
}
