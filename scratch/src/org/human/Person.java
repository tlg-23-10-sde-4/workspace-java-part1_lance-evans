package org.human;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.temporal.TemporalQuery;

/*
 * An immutable class. More accurately, a class definition written in such a way that instances of
 * it, once created, cannot have their properties changed.
 */
class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    /*
     * Returns the person's age in whole numbers
     * This is a derived property, it is calculated and returned, not stored in a field
     * find period of time in whole years
     */
    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(getBirthDate(), today).getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    public String toString() {
        return String.format("Person: name = %s; birthDate = %s; age = %s", getName(), getBirthDate(), getAge());
    }
}