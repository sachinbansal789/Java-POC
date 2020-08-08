package com.stackroute.PE1;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class PalindromeSum {
        int a[] = new int[20];
        int c=0;
        public void inarray(int n){
            int i=0;
            while(n>=1){
                a[i]=n%10;
                n=n/10;
                i++;
                c++;
            }

        }
        public boolean ispalindrome(){
            int b[] = new int[20];
            int p=0,sum=0;
            for(int i=0;i<c;i++){
                b[i]=a[c-i-1];
            }
            for(int i=0;i<c;i++){
                if(b[i]!=a[i])
                    p++;
            }
            if(p==0){
                for(int i=0;i<c;i++){
                    if(a[i]%2==0)
                        sum=sum+a[i];
                }
                if(sum>25)
                    System.out.println("The given number is a palindrome and Sum of even numbers is greater than 25. Sum="+sum);
                else
                    System.out.println("The given number is a palindrome and Sum of even numbers is lower than 25. Sum="+sum);
                return true;
            }
            else {
                System.out.println("The given nuber is not a palindrome");
                return false;
            }

        }
        /*
        public static void main(String[] args){
            int n;
            System.out.println(" Enter the number");
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            PalindromeSum q=new PalindromeSum();
            q.inarray(n);
            q.ispalindrome();
        }
        */
}
