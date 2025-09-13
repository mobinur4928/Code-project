
package com.mycompany.numberinwords;

import java.util.Scanner;
public class Words {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String num = sc.next();

        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        for (char c : num.toCharArray()) {
            System.out.print(words[c - '0'] + " ");
        }
    }
}


 