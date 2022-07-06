package com.spitfire.gui;

import java.util.Scanner;

public class Menu {
    int option;
    boolean isActive;

    Menu(int option, boolean isActive) {
        this.option = 0;
        this.isActive = true;
    }

    void makingMenu() {
        do {
            System.out.println("Welcome to Save your Budget and Life");
            System.out.println("1.- Create a new user \n" +
                    "2.- Login to your account \n" +
                    "3.- Exit");
            System.out.print("Please, enter an option: ");
            Scanner op = new Scanner(System.in);
            this.option = op.nextInt();
            switch (this.option) {
                case 1:
                    System.out.println("Creating a new account ...");
                    break;
                case 2:
                    System.out.println("Logging into your account ... ");
                    break;
                case 3:
                    System.out.println("Leaving ...\n");
                    this.isActive = false;
                    break;
                default:
                    System.out.println("Enter a correct option please");

            }

        }
        while (this.isActive);
    }
}

class testMenuDrive{
    public static void main(String[] args) {
        int opt=0;
        boolean b=true;
        Menu myMenu = new Menu(opt, b);
        myMenu.makingMenu();

    }
}