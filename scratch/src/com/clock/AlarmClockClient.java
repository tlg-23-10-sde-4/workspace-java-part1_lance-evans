package com.clock;

/*
 * Application main class, i.e., the class definition with the main() method.
 *
 * Its purpose is to create a few instances of com.clock.AlarmClock and give them a basic test drive.
 */
class AlarmClockClient {
    // application "entry point"
    public static void main(String[] args) {
        // Create an instance of com.clock.AlarmClock and set its properties/instance variable(snoozeInterval).
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(6);
        // com.clock.AlarmClock.MAX_INTERVAL = 100 // Client cannot override "public static final",
        // but it can be USED by the client

        // Create a 2nd instance of com.clock.AlarmClock and set its properties
        AlarmClock clock2 = new AlarmClock();
        clock2.setSnoozeInterval(12);

        // Create 3rd com.clock.AlarmClock object, don't set its properties
        AlarmClock clock3 = new AlarmClock(AlarmClock.MAX_INTERVAL); // as long as it can

        // Create 4th com.clock.AlarmClock object using constructor
        AlarmClock clock4 = new AlarmClock(25);

        // call methods on them
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();

        System.out.println();

        // show their toString methods in action
        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);
        System.out.println(clock4);
    }
}