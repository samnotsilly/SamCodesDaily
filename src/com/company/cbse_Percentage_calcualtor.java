package com.company;

import java.util.Scanner;

public class cbse_Percentage_calcualtor {
    public static void main(String[] args) {

        int A, B, C, D, E;
        float percentage, X;

        System.out.println("enter the total marks of all the subject");
        Scanner sc = new Scanner(System.in);
        X = sc.nextFloat();

        System.out.println("enter marks for subject A");
        A = sc.nextInt();
        if (A >= 100) {
            System.out.println("value cannot be gretater then 100");
            System.out.println("enter marks for subject A");
            A = sc.nextInt();
        } else {
            System.out.println("enter marks for subject B");
            B = sc.nextInt();
            System.out.println("enter marks for subject C");
            C = sc.nextInt();


            percentage = (A + B + C ) / X * 100;
            System.out.println("Ther avg percentage of the user is " + percentage);
        }
    }
}

