package com.stackroute.PE1;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class UnspecifiedSum {
    static void getsum(){
        int n,sum=0;
        System.out.println("Enter the Numbers:");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            n = sc.nextInt();
                sum=sum+n;
        }
            System.out.println("Sum of the Numbers is:"+sum);
    }
    public static void main(String[] args) {
        UnspecifiedSum.getsum();
    }

}
