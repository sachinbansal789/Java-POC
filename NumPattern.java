package com.stackroute.PE1;
import java.io.*;
import java.util.*;
public class NumPattern {
    public static int[] pattern(int n){
        int a[]=new int[100];
        int c=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                a[c]=i;
                c++;
            }
        }
        return a;
    }
    /*
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        n = sc.nextInt();
        NumPattern.pattern(n);
    }
    */
}
