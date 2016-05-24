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
        try {
            System.out.println(resolveDay(init()));
        } catch (Exception e) {
            runMenu();
        }
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

    protected String resolveDay(int nbr) throws Exception {
        if (nbr > 0 && nbr < 8){
            return "That's a " + DAYS[nbr-1] + "!";
        } else if (nbr <= 0) {
            System.out.println("A day cannot have a negative index or an index of zero.");
            throw new Exception();
        } else {
            System.out.println("A week only has seven days. :(");
            throw new Exception();
        }
    }
}
