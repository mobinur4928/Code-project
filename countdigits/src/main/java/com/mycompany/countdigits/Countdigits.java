
package com.mycompany.countdigits;

import java.util.Scanner;

public class Countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }

        System.out.println("Digits = " + count);
    }
}

