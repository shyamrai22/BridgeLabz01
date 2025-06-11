package com.bridgelabz;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();

        System.out.println(Math.pow(n1,n2));
        

        scanner.close();
    }
}

