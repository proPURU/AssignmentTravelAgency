package com.travelmanager.test;

import com.travelmanager.Passenger.GoldPassengerType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoldPassengerTypeTest {

    @Test
    void calculateDiscountedCost_shouldApply10PercentDiscount() {
        GoldPassengerType goldPassengerType = new GoldPassengerType();
        double cost = 100.0;

        assertEquals(90.0, goldPassengerType.calculateDiscountedCost(cost));
    }

    @Test
    void canSignUp_shouldAlwaysReturnTrue() {
        GoldPassengerType goldPassengerType = new GoldPassengerType();
        assertTrue(goldPassengerType.canSignUp(50.0, 60.0));
    }
}
