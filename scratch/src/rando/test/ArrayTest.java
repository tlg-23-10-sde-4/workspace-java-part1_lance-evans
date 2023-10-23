package rando.test;

import java.util.Arrays;

class ArrayTest {

    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] =  31;
        ages[1] =  33;
        ages[2] =  2;
        ages[3] =  25;

        for ( int age : ages) {
            System.out.printf("The age is: %s\n", age);
        }
        System.out.printf("This array has %s values\n\n", ages.length);
        System.out.println(Arrays.toString(ages));

        double[] temps = {63.3, 88, 73, 66.2, 70};

        for (double temp : temps) {
            System.out.printf("The temperature is: %s.\n", temp);
        }
        System.out.println(Arrays.toString(temps));

        String[] names = {"Lance", "Joe", "Jeff"};

    }
}