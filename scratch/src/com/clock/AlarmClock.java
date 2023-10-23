package com.clock;

/*
 * Class definition to model the workings of an alarm clock
 * This is called a "business class" or "system class," as it contains
 * business things (attributes and methods).
 * This class definition does not have a main() method
 */
class AlarmClock {
    //Static means one copy of variable, it does not change from object instance to object instance
    //It is shared and does not change.
    //Class level common storage.
    //Final = constant/fixed

    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    // properties or attributes - in Java, we call these "instance variables" or "fields"
    // Business constraint 1-20
    private int snoozeInterval = 5; // 5 is the default value for when client doesn't specify or the client selects
    // an ineligible number
    private static int nextId = 1;
    private int id;
    //private int zero = 0; // zero/0 does not need to be another value

    //Constructors - these get called when the client says "new"
    public AlarmClock(int snoozeInterval){
        setSnoozeInterval(snoozeInterval); //delegate to setter
        this.id = nextId++;
    }
    public AlarmClock(){}

    // accessor methods provide "controlled" access to the object's fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    //Enforce data constraint -> must be between 1 and 20 (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval <= MAX_INTERVAL && snoozeInterval >= MIN_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snooze interval: " + snoozeInterval + ". " + "Must be between " + MIN_INTERVAL +
                    " and " + MAX_INTERVAL + ".");
        }
        //if (snoozeInterval == 0){
        //    System.out.println("Snooze interval of " + snoozeInterval + " is not a valid interval. Defaulting " +
        //            "to minimum.");
        //    snoozeInterval = MIN_INTERVAL;
        //    this.snoozeInterval = snoozeInterval;
        //}
        //if (snoozeInterval < 0){
        //    System.out.println("Snooze interval of " + snoozeInterval + " is not a positive number, changing it to " +
        //            "positive integer.");
        //    setSnoozeInterval(Math.abs(snoozeInterval));
        //}
        //if (snoozeInterval > MAX_INTERVAL) {
        //    System.out.println("Snooze interval of " + snoozeInterval + " is greater than the max of 20... " +
        //            "Setting to max.");
        //    snoozeInterval = MAX_INTERVAL;
        //    this.snoozeInterval = snoozeInterval;
    }

    public int getId() {
        return id;
    }

    // functions or operations - in Java, we call these "methods
    public void snooze(){
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    public String toString() {
        return "com.clock.AlarmClock: id = " + getId() + "snoozeIntervals = " + getSnoozeInterval();
    }
}