package org.human;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Lance", LocalDate.of(1992,5, 30));
        System.out.println(p1);

    }
}