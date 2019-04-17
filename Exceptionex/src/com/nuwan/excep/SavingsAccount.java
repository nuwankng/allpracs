package com.nuwan.excep;

public class SavingsAccount {

	void withdraw(int amount){
		
		
		Account account = new Account();
		
		try{
			account.checkBalance(amount);
		}
		catch(IllegalArgumentException ex){
			System.out.println(ex);
		}
		
	}
}
