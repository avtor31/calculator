package com.epam.epetrov.calculator;

import java.util.Scanner;

/**
 *  Class for summing some integer values in console
 */
public class Main {

    public static void main(String[] args) {
        Main app = new Main();
        System.out.println("\t Hi!\n It is a summing calculator.");
        String endApp = "";
        while(!endApp.equalsIgnoreCase("c")) {
            endApp = app.run();
        }
    }
    private String run() {
        Scanner keyboard = new Scanner(System.in);
        int firstValue = 0;
        int secondValue = 0;
        try{
            System.out.println("enter an integer:");
            firstValue = keyboard.nextInt();
            System.out.println("enter a next integer:");
            secondValue = keyboard.nextInt();
        } catch (Exception e) {
            System.out.println("the value is not an integer!");
            this.run();
        }
        System.out.println(String.format("The summ of %d and %d is: %d", firstValue,  secondValue, firstValue + secondValue));
        System.out.println("\t If you want to get off an application enter symbol \"C\"\n in other way enter any symbol: ");
        return keyboard.next();
    }
}
