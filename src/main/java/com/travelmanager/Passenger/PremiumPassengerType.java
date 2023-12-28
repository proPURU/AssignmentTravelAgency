package com.travelmanager.Passenger;

public class PremiumPassengerType implements PassengerType,PrintablePassenger {
    @Override
    public double calculateDiscountedCost(double originalCost) {
        return 0.0; // Premium passengers get 100% discount
    }

    @Override
    public boolean canSignUp(double balance, double cost) {
        return true; // Premium passengers can always sign up
    }

    @Override
    public String getPassengerType() {
        return "Premium";
    }

    @Override
    public String getBalanceDetails(double balance) {
        return "Balance: Free";
    }

}