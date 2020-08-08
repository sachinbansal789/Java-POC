package com.stackroute.PE1;

import java.util.Scanner;
import java.io.*;

public class VowelConsonant {
    public void letterchecker(String s) {
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
                System.out.print("Vowel ");
            else
                System.out.print("Consonant ");
        }
    }
    public static void main(String[] args){
        String s;
        System.out.println("Enter the word:");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        VowelConsonant q=new VowelConsonant();
        q.letterchecker(s);
    }
}
