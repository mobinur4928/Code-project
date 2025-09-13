
package com.mycompany.palinromecheck;
import java.util.Scanner;

public class Palinro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int original = n, rev = 0;

        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }

        if (original == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

}
