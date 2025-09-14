
package com.mycompany.theoddlanternparade;

import java.util.Scanner;
public class TheOddLanternParade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        for (int i = 1, count = 0; count < n; i += 2, count++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum = " + sum);
    }
}