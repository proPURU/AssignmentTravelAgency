package com.travelmanager.test;

import com.travelmanager.Passenger.StandardPassengerType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StandardPassengerTypeTest {
    @Test
    void calculateDiscountedCost_shouldNotApplyDiscount() {
        StandardPassengerType standardPassengerType = new StandardPassengerType();
        double cost = 100.0;

        assertEquals(100.0, standardPassengerType.calculateDiscountedCost(cost));
    }

    @Test
    void canSignUp_shouldReturnTrueForSufficientBalance() {
        StandardPassengerType standardPassengerType = new StandardPassengerType();
        assertTrue(standardPassengerType.canSignUp(100.0, 50.0));
    }

    @Test
    void canSignUp_shouldReturnFalseForInsufficientBalance() {
        StandardPassengerType standardPassengerType = new StandardPassengerType();
        assertFalse(standardPassengerType.canSignUp(50.0, 60.0));
    }

}
