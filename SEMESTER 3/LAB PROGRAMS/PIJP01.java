package com.bca;

import java.util.Scanner;

public class PIJP01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1.Reverse of number");
        System.out.println("2.Sum of digits of number");
        System.out.println("3.Prime number between 1 to 100");
        System.out.println("Choose any option:");
        int ch = s.nextInt();
        switch (ch) {
        case 1:
            int rem, rev = 0;
            System.out.println("Enter the number");
            int n = s.nextInt();
            while (n > 0) {
                rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            System.out.println("Reverse of number is:" + rev);
            break;
        case 2:
            int rem1, sum = 0;
            System.out.println("Enter the number");
            int n1 = s.nextInt();
            while (n1 > 0) {
                rem = n1 % 10;
                sum = sum + rem;
                n1 = n1 / 10;
            }
            System.out.println("The sum of the digits of the number is:" + sum);
            break;
        case 3:
            int factor = 0;
            for (int j = 1; j <= 100; j++) {
                for (int i = 1; i <= j; i++) {
                    if (j % i == 0)
                        factor++;
                }
                if (factor == 2)
                    System.out.print(j + " ");
                factor = 0;
            }
            break;
        default:
            System.out.println("Invalid entry");
        }
    }
}
