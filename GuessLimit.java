package com.stackroute.PE1;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class GuessLimit {
    static void checkguess(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lower limit is 1. Guess the Upper Limit: ");
        n = sc.nextInt();
        while (n != 50) {
            if (n > 50)
                System.out.println("OOPS..!!!  Go for a smaller number Dude: ");
            else
                System.out.println("OOPS..!!! Go for a larger number Man: ");
            n = sc.nextInt();
        }
        System.out.println("Finally---> !! Congrats, You guesses it right !!");
    }
    public static void main(String[] args) {
        GuessLimit.checkguess();
    }
}

