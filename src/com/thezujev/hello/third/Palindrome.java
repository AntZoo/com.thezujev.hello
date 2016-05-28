package com.thezujev.hello.third;

import java.util.Scanner;

/**
 * Checks whether a string is a palindrome.
 * Created by zujevant on 28-May-16.
 */
public class Palindrome {
    private Scanner scan;

    public void runPalindrome() {
        System.out.println("This method will decide whether the string you send is a palindrome or not.");
        System.out.println("It'll be done both the easy way and the recursive way.");
        System.out.println("Please give me what you want to check for palindrome-ness.");
        System.out.print("> ");
        String pal = scan.nextLine();
        solvePalindrome(pal);
    }

    private void solvePalindrome(String input) {
        input = input.replaceAll("\\W", "");

        boolean easy = easySolution(input);
        boolean recursive = recursiveSolution(input);

        System.out.println("----------------------------------------");
        System.out.println("The easy solution says :" + (easy ? "YES, it is a palindrome!" : "NO, it is not a palindrome."));
        System.out.println("The recursive solution says :" + (recursive ? "YES, it is a palindrome!" : "NO, it is not a palindrome."));
    }

    protected boolean easySolution(String input) {
        String revInput = new StringBuilder(input).reverse().toString();

        return input.equalsIgnoreCase(revInput);
    }

    protected boolean recursiveSolution(String input) {
        return (input.charAt(0) == input.charAt(input.length()-1) && recursiveSolution(input.substring(1, input.length()-1)));
    }
}
