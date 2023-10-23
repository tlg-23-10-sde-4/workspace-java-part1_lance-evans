package com.mathy;

import static com.mathy.Calculator.*; // OK to use * for static imports

class CalculatorClient {

    public static void main(String[] args) {
        //int sum = com.mathy.Calculator.add(2, 5);
        //boolean even = com.mathy.Calculator.isEven(15);
        //int mult = com.mathy.Calculator.multiply(15, 3);
        //int sub = com.mathy.Calculator.subtract(12, 2);

        //System.out.println("sum is " + sum + "\n multiplication is " + mult + "\nisEven is " + even + "\nsubtraction is " + sub);
        //System.out.println(com.mathy.Calculator.divide(3, 5));
        //System.out.println(com.mathy.Calculator.randomInteger());

        /*int min = 1;
        int max = 20;
        do {
            for (int i = 0; i < 1_000_000; i++){
                int win = Calculator.randomInteger(min, max);
                if (win > max || win < min){
                    System.out.println("Error : " + win);
                    break;
                }
            }
            min++;
            System.out.println(min);
        }
        while (min < max);*/
        System.out.println(subtract(13, 1));
        System.out.println(add(5,8));
        System.out.println("average = " + Calculator.average(3,4,5,6,7));
    }
}