package com.clock;

/*
 * Client side main class focused on validation testing.
 * BVT (Boundary Value Test) Test on the boundaries and just outside them
 * checking 0, 1, 20, 21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();
        //int x = -5;
        //// do while Test verifying negative numbers through the valid numbers to greater than invalid numbers
        //do {
        //    clock.setSnoozeInterval(x);
        //    System.out.println(clock);
        //    x++;
        //}
        //while (x < 25);
        // BVT
        clock.setSnoozeInterval(1); // no error, value should stick (accepted)
        System.out.println(clock);
        clock.setSnoozeInterval(20);
        System.out.println(clock);
        clock.setSnoozeInterval(0);
        System.out.println(clock);
        clock.setSnoozeInterval(21);
        System.out.println(clock);
    }
}