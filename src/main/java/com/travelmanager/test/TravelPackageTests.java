package com.travelmanager.test;

import com.travelmanager.Passenger.GoldPassengerType;
import com.travelmanager.Passenger.Passenger;
import com.travelmanager.Passenger.PremiumPassengerType;
import com.travelmanager.Passenger.StandardPassengerType;
import com.travelmanager.Travel.Activity;
import com.travelmanager.Travel.Destination;
import com.travelmanager.Travel.TravelPackage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TravelPackageTests {


    @Test
    void destination_addActivity_shouldAddActivity() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Description", 50.0, 10, destination);

        destination.addActivity(activity);

        assertTrue(destination.getActivities().contains(activity));
    }

    @Test
    void activity_activityConstructor_shouldCreateActivity() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Description", 50.0, 10, destination);

        assertEquals("Test Activity", activity.getName());
        assertEquals("Description", activity.getDescription());
        assertEquals(50.0, activity.getCost());
        assertEquals(10, activity.getCapacity());
        assertEquals(destination, activity.getDestination());
    }

    @Test
    void passenger_signUpForActivity_shouldSignUpPassengerForActivity() {
        Passenger passenger = new Passenger("Test Passenger", 1, 100.0, new StandardPassengerType());
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Description", 50.0, 10, destination);

        passenger.signUpForActivity(activity);

        assertTrue(passenger.getActivities().contains(activity));
    }

    @Test
    void standardPassengerType_calculateDiscountedCost_shouldApplyNoDiscount() {
        StandardPassengerType standardPassengerType = new StandardPassengerType();
        double cost = 100.0;

        assertEquals(100.0, standardPassengerType.calculateDiscountedCost(cost));
    }

    @Test
    void goldPassengerType_calculateDiscountedCost_shouldApply10PercentDiscount() {
        GoldPassengerType goldPassengerType = new GoldPassengerType();
        double cost = 100.0;

        assertEquals(90.0, goldPassengerType.calculateDiscountedCost(cost));
    }

    @Test
    void premiumPassengerType_calculateDiscountedCost_shouldApply100PercentDiscount() {
        PremiumPassengerType premiumPassengerType = new PremiumPassengerType();
        double cost = 100.0;

        assertEquals(0.0, premiumPassengerType.calculateDiscountedCost(cost));
    }
}
