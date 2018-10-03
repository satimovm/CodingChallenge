package com.challenges.algorithms;

/**
 * Created by Murad Satimov
 * Date: 10/3/18.
 */
public class EvklidAlgorithm {
    public static void main(String[] args) {
        System.out.println(gcd(3, 5));
        System.out.println(gcd(15, 5));
        System.out.println(gcd(5, 15));
        System.out.println(gcd(12, 6));

    }

    private static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

}
