package com.company;

public class Main {

    public static void main(String[] args) {
/*
        BankAccount anshAccount = new BankAccount("12345", 100.0, "Dhruv Panchal", "apanchal@gmail.com",
                "9020304560");

        System.out.println(anshAccount.getNumber());
        System.out.println(anshAccount.getBalance());

        anshAccount.setNumber("101202013210");
        anshAccount.setBalance(0.00);
        anshAccount.setCustomerName("Ansh Panchal");
        anshAccount.setCustomerEmailAddress("apanchal@gmail.com");
        anshAccount.setCustomerPhoneNumber("9783320000");
        anshAccount.withdrawal(100.0);

	    anshAccount.deposit(50.0);
	    anshAccount.withdrawal(100.0);

	    anshAccount.deposit(51.0);
	    anshAccount.withdrawal(100.0);

	    BankAccount dhruvAccount = new BankAccount("Dhruv", "dhruv@gmail.com", "123343546");
        System.out.println(dhruvAccount.getNumber() + " name " + dhruvAccount.getCustomerName());
  */
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getName());

        VipCustomer vipCustomer2 = new VipCustomer("Ansh",25000.00);
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getEmailAddress());

        VipCustomer vipCustomer3 = new VipCustomer("Dhruv",3000.00,"anshpanchal@gmail.com");
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getEmailAddress());
    }
}
