package com.learnprogramming;

public class Main {

    public static void main(String[] args) {//  //"12345", 0.00, "Bob Brown",
        //   "myemail@bob.com", "0742859789");


//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100);
//
//        bobsAccount.deposit(51);
//        bobsAccount.withdrawal(100);
//
//        System.out.println(bobsAccount.getAccountNumber());
//        System.out.println(bobsAccount.getBalance());
//
        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("current balance is " + timsAccount.getBalance());
        timsAccount.withdrawal(100.55);


//        VipCustomer person1 = new VipCustomer();
//        System.out.println(person1.getName());
//        System.out.println(person1.getEmailAddress());
//        System.out.println(person1.getCreditLimit());

//        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
//        System.out.println(person2.getName());
//        System.out.println(person2.getCreditLimit());
//        System.out.println(person2.getEmailAddress());

//        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
//        System.out.println(person3.getName());
//        System.out.println(person3.getEmailAddress());
//        System.out.println(person3.getCreditLimit());

    }
}
