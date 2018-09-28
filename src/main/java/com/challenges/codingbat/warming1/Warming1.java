package com.challenges.codingbat.warming1;

/**
 * Created by murad
 * Date: 9/28/18.
 */
public class Warming1 {
    /**
     * Problem:
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     * <p>
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     */
    public static void main(String[] args) {
        System.out.println("Result: " + sleepIn(false, false)); //→ true
        System.out.println("Result: " + sleepIn(true, false)); //→ false
        System.out.println("Result: " + sleepIn(false, true)); //→ true
    }

    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

}