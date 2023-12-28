package com.travelmanager.Passenger;

import com.travelmanager.Travel.Activity;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter

public class Passenger {
    private String name;
    private int passengerNumber;
    private double balance;
    private PassengerType type;
    private List<Activity> activities;

    public Passenger(String name, int passengerNumber, double balance, PassengerType type) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.type = type;
        this.activities = new ArrayList<>();
    }

    public void signUpForActivity(Activity activity) {
        if (activities.contains(activity)) {
            System.out.println("Passenger " + name + " is already signed up for this activity.");
            return;
        }
        if (activity.getCapacity() > 0) {
            double cost = type.calculateDiscountedCost(activity.getCost());

            if (type.canSignUp(balance, cost)) {
                balance -= cost;
                activities.add(activity);
                activity.setCapacity(activity.getCapacity() - 1);
                System.out.println("Passenger " + name + " signed up for activity " + activity.getName());
            } else {
                System.out.println("Passenger " + name + " does not have sufficient balance to sign up for this activity.");
            }
        } else {
            System.out.println("Activity " + activity.getName() + " is already full. Cannot sign up.");
        }
    }

    public void printPassengerDetails() {
        System.out.println("Passenger Details:");
        System.out.println("Name: " + name);
        System.out.println("Passenger Number: " + passengerNumber);
        System.out.println("Passenger Type: " + type.getPassengerType());
        System.out.println(type.getBalanceDetails(balance));

        System.out.println("Activities signed up:");

        if (activities.isEmpty()) {
            System.out.println("No activities signed up.");
        } else {
            for (Activity activity : activities) {
                double cost = type.calculateDiscountedCost(activity.getCost());
                System.out.println("Destination: " + activity.getDestination().getName());
                System.out.println("Activity: " + activity.getName());
                System.out.println("Cost: $" + cost);
                System.out.println("Description: " + activity.getDescription());
                System.out.println("---");
            }
        }
    }


}
