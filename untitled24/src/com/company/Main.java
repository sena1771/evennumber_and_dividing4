package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double total = 0;
        int number;
        do {
            System.out.print("The number: ");
            number = inp.nextInt();
            if (((number % 4) == 0)&&(number%2==0)) {
                total += number;

            }
        }
        while ((number % 2) == 0);
        System.out.print("Total: " + total);
    }
    }

