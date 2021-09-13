/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int ageCheck=0;
        Scanner input=new Scanner(System.in);
        System.out.print("What is your age? ");
        int age=input.nextInt();

        System.out.printf(age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.");

    }
}
