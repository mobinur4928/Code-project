
package com.mycompany.primecheck;

import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) { count++; break; }
        }
        if (n <= 1) System.out.println("Not Prime");
        else if (count == 0) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}