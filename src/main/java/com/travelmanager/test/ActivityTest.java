package com.travelmanager.test;

import com.travelmanager.Travel.Activity;
import com.travelmanager.Travel.Destination;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActivityTest {
    @Test
    void activityConstructor_shouldCreateActivity() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Description", 50.0, 10, destination);

        assertEquals("Test Activity", activity.getName());
        assertEquals("Description", activity.getDescription());
        assertEquals(50.0, activity.getCost());
        assertEquals(10, activity.getCapacity());
        assertEquals(destination, activity.getDestination());
    }

}
