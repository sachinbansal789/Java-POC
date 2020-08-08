package com.stackroute.PE1;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Reverse {
    void getreverse(String s) {
        int n;
        char a[]=new char[30];
        System.out.print("The reversed String is: ");
        n=s.length();
        for (int i = 0; i < n; i++) {
            a[i]=s.charAt(i);
            System.out.print(a[n-i-1]);
        }
    }
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        s = sc.nextLine();
        Reverse q = new Reverse();
        q.getreverse(s);
    }
}
