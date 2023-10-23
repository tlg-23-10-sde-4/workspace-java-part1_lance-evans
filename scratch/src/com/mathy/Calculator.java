package com.mathy;

//import static java.lang.Math.*;

import java.util.Arrays;

/*
 * An "all-static" class. i.e., one with nothing but static methods
 * "What makes one calculator different from another?" Nothing, they all do the same thing.
 */
class Calculator {

    //prevent instantiation from outside
    private Calculator(){}

    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(double a, double b){
        return a/b;
    }

    /*
     * Returns random integer between 1-19 inclusive
     */
    public static int randomInteger(){
        return randomInteger(1, 19);
    }

    /*
     * Returns random integer between min and max (inclusive)
     */
    public static int randomInteger(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /*
     * Returns the average of supplied integers
     */
    public static double average(int first, int... rest){
        System.out.println(Arrays.toString(rest));
        double result = first;
        for (int value : rest) {
            result += value;
        }
        result = result/(rest.length + 1);
        return result;
    }
}