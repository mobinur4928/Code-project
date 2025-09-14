
package com.mycompany.alphafor;

public class AlphaFor {
 public static void main(String[] args) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (c == 'o') break;
            System.out.print(c + " ");
        }
    }
}