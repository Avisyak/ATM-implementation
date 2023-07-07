package com.progressoft.induction.atm.Impl;

import com.progressoft.induction.atm.ATM;
import com.progressoft.induction.atm.Banknote;
import com.progressoft.induction.atm.exceptions.AccountNotFoundException;
import com.progressoft.induction.atm.exceptions.InsufficientFundsException;
import com.progressoft.induction.atm.exceptions.NotEnoughMoneyInATMException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ATMImpl implements ATM {
    private final BankingSystemImpl bankingSystem=new BankingSystemImpl();
    @Override
    public List<Banknote> withdraw(String accountNumber, BigDecimal amount) {
    	
    //if(bankingSystem.sumOfMoneyInAtm().doubleValue()>=amount.doubleValue()) {
    	
    
    	
    	
    	
    	if(bankingSystem.accountBalanceMap.containsKey(accountNumber)) {
    		
    		if(bankingSystem.accountBalanceMap.get(accountNumber).doubleValue()>amount.doubleValue()) {
    			
    			bankingSystem.accountBalanceMap.put(accountNumber, bankingSystem.accountBalanceMap.get(accountNumber).subtract(amount));
    			
    		}else {
    			throw new InsufficientFundsException("Insufficient balance");
    		}
            
     	}else {
     		throw new AccountNotFoundException("Account Number: "+accountNumber+" is not Found");
     	}
   // }
        return null;
    }

    @Override
    public BigDecimal checkBalance(String accountNumber) {
    	
    	if(!bankingSystem.accountBalanceMap.containsKey(accountNumber)) {
           throw new AccountNotFoundException("Account Number: "+accountNumber+" is not Found");
    	}
    	
        return bankingSystem.getAccountBalance(accountNumber);
    }
}
