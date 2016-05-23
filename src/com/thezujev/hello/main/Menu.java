package com.thezujev.hello.main;

import com.thezujev.hello.first.Gnome;
import com.thezujev.hello.second.Multiplication;
import com.thezujev.hello.second.WeekDay;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Main menu.
 * Created by zujevant on 17.5.2016.
 */
class Menu {
    private Scanner scan = new Scanner(in);
    private static final String[] EXIT_STATEMENTS = {"0","exit","e","q","quit",""};
    private static final String[] HELP_STATEMENTS = {"?","help","h"};
    private static final String RETURN_MESSAGE = "\nReturning you to the main menu.\n----------------------------------------\n";
    private String newInput = "dummy";

    void runMenu() {
        System.out.println("Welcome to HelloWorld-o-Matic!");

        while (!Arrays.asList(EXIT_STATEMENTS).contains(newInput)) {
            System.out.println("This is a collection of home assignments from Tieto Czech Academy, Java for beginners course.\nPlease select the assignment you want to run:");
            System.out.println("1. Christmas tree\n2. Weekdays\n3. Multiplication table\n0. Exit\n?  Help");
            System.out.print("> ");
            newInput = scan.nextLine();

            if (Arrays.asList(HELP_STATEMENTS).contains(newInput)) {
                System.out.println("HELP\n====\nTo select an assignment, please write it's number.\nTo view this help, type \"?\", \"h\" or \"help\".\nTo exit, send an empty line or write \"0\", \"e\", \"q\", \"quit\" or \"exit\".\n");
            } else if (Arrays.asList(EXIT_STATEMENTS).contains(newInput)) {
                break;
            } else {
                switch (newInput) {
                    case "1":
                        Gnome gnome = new Gnome();
                        gnome.runGnome();
                        System.out.println(RETURN_MESSAGE);
                        break;
                    case "2":
                        WeekDay wd = new WeekDay();
                        wd.runMenu();
                        System.out.println(RETURN_MESSAGE);
                        break;
                    case "3":
                        Multiplication multi = new Multiplication();
                        multi.runMenu();
                        System.out.println(RETURN_MESSAGE);
                        break;
                    default:
                        System.out.println("The command is invalid or the feature hasn't been implemented yet.");
                }
            }
        }
    }
}
