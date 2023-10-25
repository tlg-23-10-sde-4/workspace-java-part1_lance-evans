package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    double rate;
    double hours;
    double STANDARD_DEDUCTION = 3500;

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
    public double totalPay = getRate() * getHours();

    @Override
    public void pay(){
        System.out.println(getName() + " is paid hourly " + totalPay);
    }

    @Override
    public void payTaxes() {
        double taxes = HOURLY_TAX_RATE * totalPay;
        System.out.println(getName()+" paid taxes of " + taxes);
    }

    public double getSTANDARD_DEDUCTION(){
        return STANDARD_DEDUCTION;
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