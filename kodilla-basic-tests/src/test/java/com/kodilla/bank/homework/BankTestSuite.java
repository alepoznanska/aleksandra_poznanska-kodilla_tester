package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class BankTestSuite {
        Bank bank = new Bank();

    @Test
    public void shouldReturnBalanceFromAllCashMachines() {
        //given
        bank.addCashMachine(5);
        bank.addCashMachine(5);
        bank.addCashMachine(5);
        // when
        bank.balanceFromAllCashMachines();
        //then
        int sum = (int) bank.balanceFromAllCashMachines();
        assertEquals(15, sum);
    }

    @Test
    public void shouldReturnNumberOfAllWithdrawals() {
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine1.add(567);
        cashMachine1.add(-666);
        cashMachine1.add(24);
        cashMachine2.add(567);
        cashMachine2.add(-666);
        cashMachine2.add(24);
        cashMachine3.add(567);
        cashMachine3.add(-666);
        cashMachine3.add(24);
        //when
        int allWithdrawals = (int) bank.numberOfAllWithdrawals();
        //then
        assertEquals(3, allWithdrawals);
    }

    @Test
    public void shouldReturnNumberOfAllDeposits() {
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine1.add(567);
        cashMachine1.add(-666);
        cashMachine1.add(24);
        cashMachine2.add(567);
        cashMachine2.add(-666);
        cashMachine2.add(24);
        cashMachine3.add(567);
        cashMachine3.add(-666);
        cashMachine3.add(24);
        //when
        int allDeposits = (int) bank.numberOfAllDeposits();
        //then
        assertEquals(6, allDeposits);
    }

    @Test
    public void shouldReturnAverageOfAllWithdrawals() {
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine1.add(567);
        cashMachine1.add(-666);
        cashMachine1.add(24);
        cashMachine2.add(567);
        cashMachine2.add(-666);
        cashMachine2.add(24);
        cashMachine3.add(567);
        cashMachine3.add(-666);
        cashMachine3.add(24);
        //when
        int averageOfAllWithdrawals = (int) bank.averageOfAllWithdrawals();
        //then
        assertEquals(-666, averageOfAllWithdrawals);
    }

    @Test
    public void shouldReturnAverageOfAllDeposits() {
        //given
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        cashMachine1.add(566);
        cashMachine1.add(-666);
        cashMachine1.add(24);
        cashMachine2.add(566);
        cashMachine2.add(-666);
        cashMachine2.add(24);
        cashMachine3.add(566);
        cashMachine3.add(-666);
        cashMachine3.add(24);
        //when
        int averageOfAllDeposits = (int) bank.averageOfAllDeposits();
        //then
        assertEquals(295, averageOfAllDeposits);
    }
}