/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "What is the order amount? " );
        double subtotal = Double.parseDouble( scan.nextLine() );
        System.out.print( "What is the state? " );
        String state = scan.nextLine();

        if (state.equals("WI")) {
            double tax = subtotal * 0.055;
            double total = tax + subtotal;

            System.out.println( "The subtotal is $" + String.format("%.2f", subtotal) + ".");
            System.out.println( "The tax is $" + String.format("%.2f", tax) + ".");
            System.out.println( "The total is $" + String.format("%.2f", total) + ".");
        }
        else
            System.out.println( "The total is $" + String.format("%.2f", subtotal) + ".");
    }
}
