package com.thezujev.hello.second;

import java.util.Scanner;

/**
 * Prints a multiplication table.
 * Created by zujevant on 17-May-16.
 */
public class Multiplication {
    public void runMenu(){
        System.out.println("You have two choices:\n1. To multiply a number by all numbers from 1 to 10.\n2. To show the multiplication table.\n0. To exit.");
        Scanner scan = new Scanner(System.in);
        String cmd;
        cmd = scan.nextLine();
        if (cmd.matches("^\\d+$")){
            int parsedCmd = Integer.parseInt(cmd);
            switch (parsedCmd){
                case 1:
                    System.out.println("Which number are we multiplying?");
                    cmd = scan.nextLine();
                    if (cmd.matches("^\\d+$")) {
                        solveMultiplications(Integer.parseInt(cmd));
                    } else {
                        System.out.println("That should've been a number.");
                        runMenu();
                    }
                    break;
                case 2:
                    System.out.println("Here's your table:\n  |1   2   3   4   5   6   7   8   9   10\n------------------------------------------");
                    showMultiplicationTable(1);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Only 1, 2 or 0 are allowed.");
            }
        } else {
            System.out.println("That should've been a number. Returning you to the menu.");
            runMenu();
        }
    }

    private void showMultiplicationTable(int i) {
        if (i < 10) {
            System.out.print(i + " |");
        } else if (i == 10) {
            System.out.print(i + "|");
        }

        if (i < 11) {
            System.out.println(printMultiplicationsInTable(i, 1));
            showMultiplicationTable(++i);
        }
    }

    private String printMultiplicationsInTable(int i, int multiplier) {
        String result = Integer.toString(i * multiplier);
        if (multiplier < 11) {
            return (result + ((result.matches("\\d")) ? "   " : (result.matches("\\d\\d") ? "  " : " ")) + printMultiplicationsInTable(i, ++multiplier));
        } else {
            return "";
        }
    }

    private void solveMultiplications(int nbr) {
        System.out.println("Multiplications for " + nbr + " are as follows.");
        System.out.println("1   2   3   4   5   6   7   8   9   10\n----------------------------------------");
        System.out.println(printMultiplicationsInTable(nbr, 1));
    }
}
