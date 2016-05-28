package com.thezujev.hello.main;

import com.thezujev.hello.first.Gnome;
import com.thezujev.hello.second.Multiplication;
import com.thezujev.hello.second.WeekDay;
import com.thezujev.hello.third.Digits;

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

        int exitCode = 99;

        while (exitCode != 0) {
            System.out.println("This is a collection of home assignments from Tieto Czech Academy, Java for beginners course.\nPlease select the assignment you want to run:");
            System.out.println("1. Christmas tree\n2. Weekdays\n3. Multiplication table\n4. Work with digits\n5. Palindromes\n0. Exit\n?  Help");
            System.out.print("> ");
            newInput = scan.nextLine();

            try {
                exitCode = resolveCommand(newInput);
            } catch (Exception e) {
                System.out.println("The command is invalid or the feature hasn't been implemented yet.");
            }
        }
    }

    protected boolean isExit(String cmd) {
        return Arrays.asList(EXIT_STATEMENTS).contains(cmd);
    }

    protected boolean isHelp(String cmd) {
        return Arrays.asList(HELP_STATEMENTS).contains(cmd);
    }

    protected String returnHelpMessage() {
        return "HELP\n====\nTo select an assignment, please write it's number.\nTo view this help, type \"?\", \"h\" or \"help\".\nTo exit, send an empty line or write \"0\", \"e\", \"q\", \"quit\" or \"exit\".\n";
    }

    protected int resolveCommand(String cmd) throws Exception {
        if (isHelp(cmd)) {
            System.out.println(returnHelpMessage());
            return 9;
        } else if (isExit(cmd)) {
            return 0;
        } else {
            switch (cmd) {
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
                case "4":
                    Digits digi = new Digits();
                    digi.runDigits();
                    System.out.println(RETURN_MESSAGE);
                    break;
                default:
                    throw new Exception();
            }
            return 1;
        }
    }
}
