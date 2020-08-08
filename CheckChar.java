package com.stackroute.PE1;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class CheckChar {

    void lettercheck() {
        String s;
        char a[] = new char[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        s = sc.nextLine();
        for (int i = 0; i < (s.length()); i++) {
            a[i] = s.charAt(i);
            if (a[i] >= 97 && a[i] <= 122)
                System.out.print("Small Letter. ");
            else if (a[i] >= 65 && a[i] <= 90)
                System.out.print("Capital Letter. ");
            else if (a[i] >= 48 && a[i] <= 57)
                System.out.print("Number. ");
            else
                System.out.print("Special Character. ");
        }
    }
    public static void main(String[] args)
    {
        CheckChar q=new CheckChar();
        q.lettercheck();
    }
}
