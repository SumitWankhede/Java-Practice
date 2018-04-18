package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sumit on 03-Jul-17.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Contacts> contactsBook = new ArrayList<Contacts>();
        boolean exitFlag = false;
        String name;
        Scanner scanner = new Scanner(System.in);
        while(exitFlag == false){
            int in = loadMenu();

            switch (in){
                case 1:
                    contactsBook.add(createContact());
                    break;
                case 2:
                    System.out.println("Contact List");
                    for(int i = 0; i < contactsBook.size(); i++){
                        System.out.println(i+ ". " + contactsBook.get(i).getName() + " - " + contactsBook.get(i).getNumber());
                    }
                    break;
                case 3:
                    System.out.println("Enter name");
                    name = scanner.next();
                    if(contactsBook.remove(name))
                        System.out.println("Contact removed");
                    else
                        System.out.println("No contact details found");
                    break;
                case 4:
                    if(contactsBook.contains(searchContact()))
                        System.out.println("Contact name present");
                    else
                        System.out.println("no such name present");
                    break;
                case 5:
                    exitFlag = true;
            }
        }
    }

    private static String searchContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        return scanner.next();
    }

    private static Contacts createContact() {
        String name;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        name = scanner.next();
        System.out.println("Enter number:");
        number = scanner.nextInt();

        return new Contacts(name,number);
    }

    public static int loadMenu(){
        System.out.println("-------Contacts--------");
        System.out.println("|  1. Create contact  |");
        System.out.println("|  2. Display contact |");
        System.out.println("|  3. Remove contact  |");
        System.out.println("|  4. Search contact  |");
        System.out.println("|  5. Exit            |");
        System.out.println("-----------------------");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input > 0 && input < 6){
            return input;
        }
        else{
            System.out.println("Wrong input. Try again!");
            loadMenu();
        }
        return 0;
    }
}
