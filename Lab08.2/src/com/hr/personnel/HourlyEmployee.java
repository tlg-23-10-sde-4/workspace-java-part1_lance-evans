package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    double rate;
    double hours;

    public HourlyEmployee() {
        super();

    }
    public HourlyEmployee(String name, LocalDate hireDate){
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);

    }

    @Override
    public void pay(){
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString(){
        return super.toString() + "; rate= " + getRate() + "; hours= " + getHours();
    }
}