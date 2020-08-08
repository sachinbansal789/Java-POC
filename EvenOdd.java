package com.stackroute.PE1;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class EvenOdd {
        static void numbercheck (int n){
            if((n%2!=0)&&(n>20)&&(n<30))
                System.out.println("Tom");
            else if((n%2==0)&&(n>20)&&(n<30))
                System.out.println("Jerry");
        }
        public static void main(String[] args){
            int n;
            System.out.println("Enter a number:");
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            EvenOdd.numbercheck(n);
        }
}
