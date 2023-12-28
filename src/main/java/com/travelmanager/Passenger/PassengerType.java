package com.travelmanager.Passenger;

public interface PassengerType {
    double calculateDiscountedCost(double originalCost);
    boolean canSignUp(double balance, double cost);
   String getBalanceDetails(double balance);

    String getPassengerType();
}
