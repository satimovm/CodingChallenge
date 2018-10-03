package com.challenges.platforms.codingbat.warming1;

/**
 * Created by murad
 * Date: 9/28/18.
 */
public class Warming2 {
    /**
     * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
     * <p>
     * diff21(19) → 2
     * diff21(10) → 11
     * diff21(21) → 0
     * </p>
     */
    public static void main(String[] args) {
        System.out.println("Result: " + diff21(19));
        System.out.println("Result: " + diff21(10));
        System.out.println("Result: " + diff21(21));
    }

    private static int diff21(int n) {
        return n > 21 ? (Math.abs(21 - n)) * 2 : Math.abs(21 - n);
    }


}