package com.company;

import java.util.Scanner;

public class samjava_practiceset {
    public static void main(String[] args) {

        int A, B, C, d, product;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number A");
        A = sc.nextInt();
        System.out.println("enter number B");
        B = sc.nextInt();
        System.out.println("enter number c");
        C = sc.nextInt();


        // the sum of three numbers and printing the greteast number out of all
        if (A > B && A >= C) {
            System.out.println("The number given by  A is greatest");
        } else if (B > A && B > C) {
            System.out.println("THe number given by B is the greatest");
        } else {
            System.out.println("number c is gretest");
        }

        product = A + B + C;
        System.out.println("the sum of these three number is " + product);


    }
}


