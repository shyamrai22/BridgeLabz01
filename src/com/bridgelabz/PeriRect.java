package com.bridgelabz;

import java.util.Scanner;

public class PeriRect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("Perimeter of the rectangle = " + perimeter);

        scanner.close();
    }
}

