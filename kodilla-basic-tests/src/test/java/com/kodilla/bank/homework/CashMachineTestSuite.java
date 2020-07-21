package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {
        int transactions = cashMachine.getNumberOfTransactions();
        assertEquals(0, transactions);
    }

    @Test
    public void shouldCountNumberOfTransactionsEvenIfInvalidTransactionTriedToBeMade(){
//invalid transaction - trying to withdraw money when not enough cash in the cash machine
        cashMachine.add(50);
        cashMachine.add(-250);
        cashMachine.add(100);

        int transactions = cashMachine.getNumberOfTransactions();
        assertEquals(3, transactions);

    }

    @Test
    public void shouldCalcBalanceEvenIfInvalidTransactionTriedToBeMade(){
//invalid transaction - trying to withdraw money when not enough cash in the cash machine
        cashMachine.add(10);
        cashMachine.add(-10);
        cashMachine.add(10);
        cashMachine.add(-20);
        cashMachine.add(10);
        assertEquals(0, cashMachine.balance());
    } // to jest dla mnie bez sensu, zwłaszcza w odniesieniu do testu shouldNotCountWithdrawTransactionIfEmpty

    @Test
    public void shouldReturnBalanceEqualsZeroIfEmpty(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(100);
        cashMachine.add(20);
        cashMachine.add(-20);
        cashMachine.add(-150);
        assertEquals(0, cashMachine.balance());
    }

    @Test
    public void shouldReturnBalanceEqualsZeroIfNoTransactionsWereMade(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.balance());
    }

    @Test
    public void shouldReturnAverageEqualsZeroIfNoTransactionsWereMade(){
     assertEquals(0.0, cashMachine.getAverageDeposit() + cashMachine.getAverageWithdrawal(), 0.01);
    }

    @Test
    public void shouldNotCountWithdrawTransactionIfEmpty(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-20);
        cashMachine.add(-50);
        cashMachine.add(-50);
        assertEquals(0,cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldNotCountWithdrawTransactionIfNotEnoughMoney(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(-20);
        cashMachine.add(100);
        cashMachine.add(-200);
        cashMachine.add(100);
        cashMachine.add(-50);
        cashMachine.add(-20);
        assertEquals(2,cashMachine.getNumberOfWithdrawals());
        // to nie powinno działać, albo działa źle, ale działa ;p
    }

    @Test
    public void shouldReturnAverageDepositEqualsZeroIfNoDeposits(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0.0, cashMachine.getAverageDeposit(), 0.01);
    }

    @Test
    public void shouldReturnAverageWithdrawalEqualsZeroIfNoWithdrawals(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(100);
        cashMachine.add(200);
        cashMachine.add(20);
        assertEquals(0.0, cashMachine.getAverageWithdrawal(), 0.02);
    }

    @Test
    public void shouldReturnNumberOfDeposits() {
        cashMachine.add(225);
        cashMachine.add(-215);
        cashMachine.add(33333);
        cashMachine.add(-10000);
        cashMachine.add(450);
        assertEquals(3, cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldReturnNumberOfWithdrawals() {
        cashMachine.add(225);
        cashMachine.add(-215);
        cashMachine.add(33333);
        cashMachine.add(-10000);
        cashMachine.add(450);
        assertEquals(2, cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldReturnAverageDeposit() {
        cashMachine.add(225);
        cashMachine.add(-215);
        cashMachine.add(33333);
        cashMachine.add(-10000);
        cashMachine.add(450);
        assertEquals(11336, cashMachine.getAverageDeposit());
    }

    @Test
    public void shouldReturnAverageWithdrawal() {
        cashMachine.add(225);
        cashMachine.add(-215);
        cashMachine.add(33333);
        cashMachine.add(-10000);
        cashMachine.add(450);
        assertEquals(-5107.5, cashMachine.getAverageWithdrawal());
    }
}