package com.kodilla.bank.homework;

public class CashMachine {
    public int[] transactions;
    public int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void add(int value) {
        if (value < 0) {
            this.size++;
            int[] tempTab = new int[size];
            System.arraycopy(transactions, 0, tempTab, 0, transactions.length);
            tempTab[size - 1] = value;
            this.transactions = tempTab;
        } else if (value > 0) {
            this.size++;
            int[] tempTab = new int[size];
            System.arraycopy(transactions, 0, tempTab, 0, transactions.length);
            tempTab[size - 1] = value;
            this.transactions = tempTab;
        }
    }

    public int balance() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum += transactions[i];
        }
        return sum;
    }

    public int getNumberOfDeposits() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public int getNumberOfWithdrawals() {
        int count = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0 && balance() >= transactions[i]) {
                count++;
            }

        }
        return count;
    }

    public double getAverageDeposit() {
        if (this.transactions.length == 0) {
            return 0.0;
        }

        if (getNumberOfDeposits() == 0) {
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sum += transactions[i];
            }
        }
        return sum / getNumberOfDeposits();
    }

    public double getAverageWithdrawal() {
        if (this.transactions.length == 0) {
            return 0.0;
        }

        if (getNumberOfWithdrawals() == 0) {
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                sum += transactions[i];
            }
        }
        return sum / getNumberOfWithdrawals();
    }

    public int getNumberOfTransactions() {
        return getNumberOfDeposits() + getNumberOfWithdrawals();
            }
}