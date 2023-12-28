package com.travelmanager.Passenger;

public class StandardPassengerType implements PassengerType,PrintablePassenger {
    @Override
    public double calculateDiscountedCost(double originalCost) {
        return originalCost;
    }

    @Override
    public boolean canSignUp(double balance, double cost) {
        return balance >= cost;
    }
    public String getPassengerType() {
        return "Standard";
    }

    @Override
    public String getBalanceDetails(double balance) {
        return "Balance: $" + balance;
    }

}