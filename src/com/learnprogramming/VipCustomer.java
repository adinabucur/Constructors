package com.learnprogramming;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public VipCustomer() {
        this("Default name", 50000, "default@emailddress.com");
    }


    public VipCustomer(String newName, double newCreditLimit) {
        this(newName, newCreditLimit, "unknown@email.com");
    }


    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


}
