package com;
public class Test{


    public static void main(String[] args) {

        HSBC hsbc = new HSBC();

        hsbc.credit();
        hsbc.debit();
        hsbc.transferMoney();
        hsbc.educationLoan();
        hsbc.carLoan();

       //Dynamic polymorphism

        UsBank usBank = new HSBC();

        usBank.credit();
        usBank.debit();
        usBank.transferMoney();




    }

}
