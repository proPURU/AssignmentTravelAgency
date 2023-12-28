package com.travelmanager.test;

import com.travelmanager.Passenger.Passenger;
import com.travelmanager.Passenger.StandardPassengerType;
import com.travelmanager.Travel.Activity;
import com.travelmanager.Travel.Destination;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PassengerTest {

    @Test
    void signUpForActivity_shouldSignUpPassengerForActivity() {
        Passenger passenger = new Passenger("Test Passenger", 1, 100.0, new StandardPassengerType());
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Description", 50.0, 10, destination);

        passenger.signUpForActivity(activity);

        assertTrue(passenger.getActivities().contains(activity));
    }

    @Test
    void signUpForActivity_shouldNotSignUpForFullActivity() {
        Passenger passenger = new Passenger("Test Passenger", 1, 100.0, new StandardPassengerType());
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Description", 50.0, 0, destination);

        passenger.signUpForActivity(activity);

        assertFalse(passenger.getActivities().contains(activity));
    }

    @Test
    void signUpForActivity_shouldNotSignUpForInsufficientBalance() {
        Passenger passenger = new Passenger("Test Passenger", 1, 50.0, new StandardPassengerType());
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Description", 60.0, 10, destination);

        passenger.signUpForActivity(activity);

        assertFalse(passenger.getActivities().contains(activity));
    }
}
