package com.gradedproject.q2;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number X: ");
        int x = scanner.nextInt();
        System.out.print("Enter the power N: ");
        int n = scanner.nextInt();

        System.out.println("X power N is: " + power(x, n));
    }

    public static int power(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        if (n < 0) { // Handling negative power by finding the positive power and then taking its reciprocal
            return 1 / power(x, -n);
        }
        int halfPower = power(x, n / 2);
        // If n is even, the power is halfPower squared
        if (n % 2 == 0) {
            return halfPower * halfPower;
        }
        // If n is odd, the power is x times halfPower squared
        return x * halfPower * halfPower;
    }
}
