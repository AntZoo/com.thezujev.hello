package com.thezujev.hello.first;

import java.util.Scanner;

/**
 * Class draws Christmas tree and generates a random number from 1 to 100.
 * Created by zujevant on 10-May-16.
 */
public class Gnome {
    protected int randomNumber = 0;

    public Gnome() {
        generateRandomNumber();
    }

    public void runGnome() {
        System.out.println(greet() + "\nI am a gnome that lives in this PC. " + tellRandomNumber() + "\nI will draw you a Christmas tree - but you have to tell me how high you want it to be.");
        treeLinesPrompt();
    }

    private void treeLinesPrompt() {
        System.out.println("How many tree lines do you want? Enter 0 to return.");

        Scanner scan = new Scanner(System.in);
        String treeLines = scan.nextLine();
        if (treeLines.matches("^\\d+$")){
            if (!(Integer.parseInt(treeLines) == 0)) {
                System.out.println("Aaaand! Here's your Christmas tree:\n" + drawChristmasTree(Integer.parseInt(treeLines)));
            }
        } else {
            System.out.println("That should've been a number. Try again.");
            treeLinesPrompt();
        }
    }

    protected void generateRandomNumber() {
        randomNumber = (int) Math.round(Math.random()*100 + 1);
    }

    protected int getRandomNumber() { return randomNumber; }

    protected String greet() {
        return "Hello World!";
    }

    protected String tellRandomNumber() {
        return "My random number is " + getRandomNumber() + ".";
    }

    protected String drawChristmasTree(int size) {
        int line = 0;
        String treeLine = "";

        for (int i = 0; i < size + 1; i++) {
            if (i < size) {
                for (int x = 0; x < (size - (line + 1)); x++) {
                    treeLine += " ";
                }

                for (int y = 0; y < line * 2 + 1; y++) {
                    treeLine += "*";
                }

                treeLine += "\n";
                line++;
            } else if (i == size && size > 0 ) {
                for (int x = 0; x < (size - 1); x++) {
                    treeLine += " ";
                }
                treeLine += "*";
            }
        }

        return treeLine;
    }
}