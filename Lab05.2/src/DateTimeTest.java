/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.time.*;
import java.time.format.*;
import java.util.Date;

class DateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
        testNow();
        testCreate();
        testParse();
        // testFormat();
    }

    /**
     * TASK: create current date, time, and date-time via now() and then print them.
     */
    public static void testNow() {
        // TODO
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now().withSecond(0).withNano(0);
        LocalDateTime timeStamp = LocalDateTime.now();
        System.out.println(today + "\n" + now + "\n" + timeStamp);
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testCreate() {
        // TODO: create your birthday via of(). What day of the week were you born on?
        LocalDate bday = LocalDate.of(1992, 5, 30);
        DayOfWeek day = bday.getDayOfWeek();
        System.out.println(bday);
        System.out.println(day);
        // TODO: use of() to create a value representing the 1st lunar landing - it happened on 7/20/69 at 3:18pm Eastern Time.
        LocalDate lunarLanding = LocalDate.of(1969,7,20);
        System.out.println(lunarLanding);
        // NOTE: ignore time-zone, just assume Eastern Time is the local time.
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testParse() {
        // TODO: create your birthday by parsing a text representation in standard format ("yyyy-MM-dd").
        LocalDate bday = LocalDate.parse("1992-05-30");
        System.out.println(bday);
        // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
        LocalDate bday2 = LocalDate.parse("05/30/1992");
        System.out.println(bday2);
    }

    /**
     * TASK: create formatted display strings for the date below, in the specified formats.
     */
    public static void testFormat() {
        LocalDate hastings = LocalDate.of(1066, 10, 14);

        // TODO: 10/14/1066

        // TODO: 14-10-1066

        // OPTIONAL: October 14, 1066
    }
}