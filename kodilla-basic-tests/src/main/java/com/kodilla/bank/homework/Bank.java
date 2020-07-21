package com.kodilla.bank.homework;

public class Bank {
    CashMachine cashMachine1 = new CashMachine();
    CashMachine cashMachine2 = new CashMachine();
    CashMachine cashMachine3 = new CashMachine();
    CashMachine cashMachine4 = new CashMachine();

    public void addCashMachine(int sum) {
        cashMachine1.add(sum);
        cashMachine2.add(sum);
        cashMachine3.add(sum);
        cashMachine4.add(sum);
    }

    public double balanceFromAllCashMachines() {
                return cashMachine1.balance() + cashMachine2.balance() + cashMachine3.balance() + cashMachine4.balance();

    }

    public double numberOfAllWithdrawals() {
        return cashMachine1.getNumberOfWithdrawals() + cashMachine2.getNumberOfWithdrawals() +
                cashMachine3.getNumberOfWithdrawals() + cashMachine4.getNumberOfWithdrawals();
    }

    public double numberOfAllDeposits() {
        return cashMachine1.getNumberOfDeposits() + cashMachine2.getNumberOfDeposits() +
                cashMachine3.getNumberOfDeposits() + cashMachine4.getNumberOfDeposits();

    }

    public double averageOfAllWithdrawals() {
        return cashMachine1.getAverageWithdrawal() + cashMachine2.getAverageWithdrawal() +
                cashMachine3.getAverageWithdrawal() + cashMachine4.getAverageWithdrawal();
    }

    public double averageOfAllDeposits() {

        return cashMachine1.getAverageDeposit() + cashMachine2.getAverageDeposit() +
                cashMachine3.getAverageDeposit() + cashMachine4.getAverageDeposit();
    }
}