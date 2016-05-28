package com.thezujev.hello.third;

import java.util.Scanner;

/**
 * Sums and factorials
 * Created by zujevant on 28-May-16.
 */
public class Digits {
    private long startTimeC;
    private long startTimeR;
    private long endTimeC;
    private long endTimeR;

    private Scanner scan;
    private String number;
    private int resultC;
    private int resultR;

    public void runDigits() {
        System.out.println("This module can count the sum of all digits up to the one you choose");
        System.out.println("and count the factorial of the select digit. What do you want to do?");
        System.out.println("\n1. Sum.\n2. Factorial");
        System.out.print("\n> ");
        scan = new Scanner(System.in);
        String decision = scan.nextLine();
        if (decision.matches("^\\d+$")){
            switch (decision) {
                case "1":
                    System.out.print("Now I'll need a number > ");
                    number = scan.nextLine();
                    if (decision.matches("^\\d+$")) {
                        startTimeC = System.nanoTime();
                        resultC = digitsSumCycle(Integer.parseInt(number));
                        endTimeC = System.nanoTime();
                        startTimeR = System.nanoTime();
                        resultR = digitsSumRecursion(Integer.parseInt(number));
                        endTimeR = System.nanoTime();
                    } else {
                        System.out.println("That wasn't a number.");
                        runDigits();
                    }
                    break;
                case "2":
                    System.out.print("Now I'll need a number > ");
                    number = scan.nextLine();
                    if (decision.matches("^\\d+$")) {
                        startTimeC = System.nanoTime();
                        resultC = factorialCycle(Integer.parseInt(number));
                        endTimeC = System.nanoTime();
                        startTimeR = System.nanoTime();
                        resultR = factorialRecursion(Integer.parseInt(number));
                        endTimeR = System.nanoTime();
                    } else {
                        System.out.println("That wasn't a number.");
                        runDigits();
                    }
                    break;
                default:
                    System.out.println("That's not a valid choice.");
                    runDigits();
            }
        } else {
            System.out.println("That should've been a number. Returning you to the menu.");
            runDigits();
        }
        System.out.println("I've tried solving the task with a cycle and with recursion.");
        System.out.println("With a cycle the answer was " + resultC + " and it took me " + (endTimeC - startTimeC) / 1000000 + " ms to calculate.");
        System.out.println("With recursion the answer was " + resultR + " and it took me " + (endTimeR - startTimeR) / 1000000 + " ms to calculate.");
        System.out.println("You can now compare which one was most effective.");
    }

    protected int digitsSumCycle(int input) {
        int result = 0;

        while (input > 0) {
            result += input--;
        }

        return result;
    }

    protected int factorialCycle(int input) {
        if (input == 0) { return 0; }

        int result = 1;

        while (input > 0) {
            result *= input--;
        }

        return result;
    }

    protected int digitsSumRecursion(int input) {
        if (input == 1) {
            return 1;
        } else if (input == 0) {
            return 0;
        } else {
            return input + digitsSumRecursion(--input);
        }
    }

    protected int factorialRecursion(int input) {
        if (input == 1) {
            return 1;
        } else if (input == 0) {
            return 0;
        } else {
            return input * factorialRecursion(--input);
        }
    }
}
