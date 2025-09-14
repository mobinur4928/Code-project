
package com.mycompany.library;


class Library {
    String bookName;
    String authorName;
    int quantity;

    Library(String b, String a, int q) {
        bookName = b; authorName = a; quantity = q;
    }

    void issueBook() {
        if (quantity > 0) {
            quantity--;
            System.out.println(bookName + " issued.");
        } else {
            System.out.println(bookName + " not available.");
        }
    }

    void returnBook() {
        quantity++;
        System.out.println(bookName + " returned.");
    }

    void display() {
        System.out.println("Book: " + bookName + ", Author: " + authorName + ", Quantity: " + quantity);
    }
}

public class BookIssueReturn {
    public static void main(String[] args) {
        Library b1 = new Library("Java Basics", "James", 3);
        Library b2 = new Library("OOP Concepts", "John", 2);
        Library b3 = new Library("DSA", "Mark", 1);

        b1.display(); b2.display(); b3.display();
        b1.issueBook();
        b1.display();
        b1.returnBook();
        b1.display();
    }
}