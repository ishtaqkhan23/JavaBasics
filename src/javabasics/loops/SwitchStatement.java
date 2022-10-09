package javabasics.loops;

import javabasics.enums.Days;

import static javabasics.enums.Days.Sunday;

public class SwitchStatement {
    public static void main(String[] args) {
        //greeting based on days
        String currentDay = "Monday";
        switch (currentDay) {
            case "Sunday":
            //case "Saturday":
                System.out.println("enjoy");
                break;
            case "Monday":
                System.out.println("work hard..");
                break;
            case "Tuesday":
                System.out.println("work hard..");
                break;
            case "Wednesday":
                System.out.println("work hard..");
                break;
            case "Thursday":
                System.out.println("work hard..");
                break;
            case "Friday":
                System.out.println("work lite and relax..");
                break;
            case "Saturday":
                System.out.println("enjoy");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

        //greeting based on days using emun
        Days currentDayFromEnum = Sunday;
        switch (currentDayFromEnum) {
            case Sunday:
                System.out.println("enjoy");
                break;
            case Monday:
                System.out.println("work hard..");
                break;
            case Tuesday:
                System.out.println("work hard..");
                break;
            case Wednesday:
                System.out.println("work hard..");
                break;
            case Thursday:
                System.out.println("work hard..");
                break;
            case Friday:
                System.out.println("work lite and relax..");
                break;
            case Saturday:
                System.out.println("enjoy");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
