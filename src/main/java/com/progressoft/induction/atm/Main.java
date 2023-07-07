package com.progressoft.induction.atm;

import com.progressoft.induction.atm.Impl.ATMImpl;
import com.progressoft.induction.atm.Impl.BankingSystemImpl;
import com.progressoft.induction.atm.exceptions.AccountNotFoundException;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String args[]){
    	BankingSystem  bankingSystem = new BankingSystemImpl();
    	ATM atm = new ATMImpl();
    	
    	System.out.println(bankingSystem.getAccountBalance("222222222"));
    	 atm.withdraw("222222222", BigDecimal.valueOf(200));
    	System.out.println(atm.checkBalance("222222222"));

    	//bankingSystem.debitAccount("123456789", BigDecimal.valueOf(50000));
    	
    	//System.out.println(bankingSystem.getAccountBalance("123456789"));
    	//System.out.println(new BankingSystemImpl().sumOfMoneyInAtm());
     
    	
    }
}
