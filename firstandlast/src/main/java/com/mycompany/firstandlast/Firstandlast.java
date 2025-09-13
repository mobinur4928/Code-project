
package com.mycompany.firstandlast;

import java.util.Scanner;

public class Firstandlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int last = n % 10;
        int first = n;
        while (first >= 10) first /= 10;

        System.out.println("First digit = " + first + ", Last digit = " + last);
    }
}