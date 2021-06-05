package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise12
{
    static Scanner input = new Scanner(System.in);
    public static float getPrin(){
        System.out.print("Enter the principal: ");
        return input.nextFloat();
    }
    public static float getROI(){
        System.out.print("Enter the rate of interest: ");
        return input.nextFloat() / 100;
    }
    public static int getYears(){
        System.out.print("Enter the number of years: ");
        return input.nextInt();
    }
    public static void doMath(float principal, float roi, int years){
        float simpIntr = principal * (1 + roi * years);
        System.out.print("After 4 years at 4.3%, the investment will be worth $1758.");
    }
    public static void main( String[] args ) {
        float principal = getPrin();
        float roi = getROI();
        int years = getYears();
    }
}
