package spsmb.cz.io;

import spsmb.cz.enums.TimeValues;

import java.util.Scanner;

public class UserInput {
    private static Scanner sc = new Scanner(System.in);

    public static TimeValues returnTime(){

        System.out.println("Enter when the food was eaten");
        System.out.println("1.) Morning");
        System.out.println("2.) Forenoon");
        System.out.println("3.) Noon");
        System.out.println("4.) Afternoon");
        System.out.println("5.) Evening");
        int time = sc.nextInt();
        sc.nextLine();


        switch(time){
            case 1:
                return TimeValues.MORNING;
            case 2:
                return TimeValues.FORENOON;
            case 3:
                return TimeValues.NOON;
            case 4:
                return TimeValues.AFTERNOON;
            case 5:
                return TimeValues.EVENING;
            default:
                return TimeValues.NULL;
        }
    }

    public static String returnFood(){
        System.out.println("Enter what food was eaten");
        return sc.nextLine();
    }

    public static Integer returnCalories(){
        System.out.println("Enter how much calories the food had");
        int calories = sc.nextInt();
        sc.nextLine();
        return calories;
    }
}
