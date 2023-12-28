package com.travelmanager.test;

import com.travelmanager.Passenger.PremiumPassengerType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PremiumPassengerTypeTest {

    @Test
    void calculateDiscountedCost_shouldAlwaysReturnZero() {
        PremiumPassengerType premiumPassengerType = new PremiumPassengerType();
        double cost = 100.0;

        assertEquals(0.0, premiumPassengerType.calculateDiscountedCost(cost));
    }

    @Test
    void canSignUp_shouldAlwaysReturnTrue() {
        PremiumPassengerType premiumPassengerType = new PremiumPassengerType();
        assertTrue(premiumPassengerType.canSignUp(50.0, 60.0));
    }

}
