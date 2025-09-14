
package com.mycompany.alphawhile;

public class AlphaWhile {
 public static void main(String[] args) {
        char c = 'a';
        while (c <= 'z') {
            if (c == 'k') break;
            System.out.print(c + " ");
            c++;
        }
    }
}