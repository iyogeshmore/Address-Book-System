package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println(" Welcome to the Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBook addBook = new AddressBook();

        String ch;
        while (true) {
            System.out.println(" **** MENU ****");
            System.out.println(" 1. Add contacts\n 2. Display contacts\n 3. Edit contacts\n 4. Delete contact\n 5. Exit");
            System.out.print("\n Please enter your choice: ");

            ch = scanner.next();

            switch (ch) {
                case "1":
                    addBook.addContact();
                    break;
                case "2":
                    addBook.displayContacts();
                    break;
                case "3":
                    addBook.editContact();
                    break;
                case "4":
                    addBook.deleteContact();
                    break;
                case "5":
                    System.out.println(" Exit");
                    return;
                default:
                    System.out.println(" Please enter a valid choice: ");
            }
        }
    }
}