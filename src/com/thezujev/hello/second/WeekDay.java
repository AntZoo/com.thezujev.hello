package com.thezujev.hello.second;

import java.util.Scanner;

/**
 * Class returns day of the week.
 * Created by zujevant on 17.5.2016.
 */
public class WeekDay {
    private static final String[] DAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public void runMenu(){
        System.out.println("Give me a day number and I'll return you the corresponding day name. Enter 0 to return.");
        resolveDay(init());
    }

    private int init(){
        Scanner scan = new Scanner(System.in);
        String cmd;
        System.out.print("> ");
        cmd = scan.nextLine();
        if (cmd.matches("^\\d+$")){
            return Integer.parseInt(cmd);
        } else {
            System.out.println("False input. Try again.");
            return init();
        }
    }

    private void resolveDay(int nbr) {
        if (nbr > 0 && nbr < 8){
            System.out.println("That's a " + DAYS[nbr-1] + "!");
        } else if (nbr <= 0) {
            System.out.println("A day cannot have a negative index or an index of zero.");
            resolveDay(init());
        } else {
            System.out.println("A week only has seven days. :(");
            resolveDay(init());
        }
    }
}
