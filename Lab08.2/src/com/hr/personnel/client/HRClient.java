/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;
import com.hr.personnel.Department;
import com.hr.personnel.Executive;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Joe", LocalDate.of(2015, 5, 15), 1900));
        dept.addEmployee(new HourlyEmployee("Kevin", LocalDate.of(2016, 3, 21), 32.75, 26));
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1992, 5, 5), 1800));
        dept.addEmployee(new SalariedEmployee("Julie", LocalDate.of(2000, 2, 2), 1500));
        dept.addEmployee(new Executive("Lance", LocalDate.of(2020, 4, 21), 10500));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay employees
        System.out.println("\nPay employees");
        dept.payEmployees();

        //forced holiday break
        System.out.println("\nForced Holiday break");
        dept.holidayBreak();
    }
}