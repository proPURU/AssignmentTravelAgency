package com.travelmanager.Passenger;

public class GoldPassengerType implements PassengerType ,PrintablePassenger{
    @Override
    public double calculateDiscountedCost(double originalCost) {
        return 0.9 * originalCost; // Apply 10% discount
    }
    @Override
    public boolean canSignUp(double balance, double cost) {
        return true; // Gold passengers can always sign up
    }
    @Override
    public String getPassengerType() {
        return "Gold";
    }
    @Override
    public String getBalanceDetails(double balance) {
        return "Balance: $" + balance;
    }
}