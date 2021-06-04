/*
 *  UCF COP3330 Summer 2021 MotivatedAssignment 5 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;

import java.util.Scanner;

public class Problem5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the first number?");
        String string1 = input.next();
        int num1 = Integer.parseInt(string1);

        System.out.println("What is the second number?");
        String string2 = input.next();
        int num2 = Integer.parseInt(string2);

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + add + "\n" +
                           num1 + " - " + num2 + " = " + sub + "\n" +
                           num1 + " * " + num2 + " = " + mul + "\n" +
                           num1 + " / " + num2 + " = " + div + "\n");
    }
}
