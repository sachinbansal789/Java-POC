package com.stackroute.PE1;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;

public class SubRepeat {
    String s,sub;
    int n;
    public void getsub(String a, int r){
        int i;
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        s=sc.nextLine();
        System.out .println("Enter the value: ");
        n=sc.nextInt();
         */
        n=r;
        s=a;
        i=s.length()-n;
        sub=s.substring(i);
    }
    public String repeat(){
        for(int j=1;j<=n;j++) {
            s = s.concat(sub);
        }
        return s;
    }
    /*
    public static void main(String[] args){
        String sub;
        SubRepeat sr= new SubRepeat();
        sub=sr.getsub();
        sr.repeat(sub);
    }

     */
}

