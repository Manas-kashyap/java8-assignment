package com.knoldus;

import java.util.Scanner;

public class DisplayViewer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number- ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number- ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number- ");
        int num3 = sc.nextInt();
        System.out.print("Enter Fourth number- ");
        int num4 = sc.nextInt();
        System.out.print("Enter Fifth number- ");
        int num5 = sc.nextInt();

        Display display = (number1, number2, number3, number4, number5) -> {
            return number1 + number2 + number3 + number4 + number5;
        };
        System.out.println(display.sum(num1, num2, num3, num4, num5));

    }
}
