package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    double salary;
    double STANDARD_DEDUCTION = 9500;

    public SalariedEmployee(){
        super();
    }
    public SalariedEmployee(String name, LocalDate hireDate){
        super(name,hireDate);
    }
    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    @Override
    public void pay(){
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    public void takeVacation() {
        System.out.println(getName()+ " is on vacation.");
    }

    @Override
    public void payTaxes() {
        double taxes = SALARIED_TAX_RATE * getSalary();
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    @Override
    public double getStandardDeduction(){
        return STANDARD_DEDUCTION;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return super.toString() + "; salary= " + getSalary();
    }
}
