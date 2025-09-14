
package com.mycompany.alphadowhil;

public class AlphaDoWhil {
public static void main(String[] args) {
        char c = 'a';
        do {
            if (c == 'k') break;
            System.out.print(c + " ");
            c++;
        } while (c <= 'z');
    }
}