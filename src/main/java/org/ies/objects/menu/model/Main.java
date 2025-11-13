package org.ies.objects.menu.model;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MyMenuOptions option;
        do {
            MyMenuOptions.printMenu();
            option = MyMenuOptions.fromOpt(scanner.nextInt());
            scanner.nextLine();
            if (option == MyMenuOptions.Sum) {

            }

        } while (option != MyMenuOptions.Exit);
    }
}
