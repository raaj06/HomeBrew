package com;

public class HSBC implements UsBank{
    @Override
    public void credit() {

        System.out.println("Credit");

    }

    @Override
    public void debit() {

        System.out.println("double");

    }

    @Override
    public void transferMoney() {

        System.out.println("transfermoney");
    }

    public void educationLoan(){
        System.out.println("Education loan");
    }

    public void carLoan(){
        System.out.println("Carloan given");
    }
}
