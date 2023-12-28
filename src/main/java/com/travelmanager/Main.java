package com.travelmanager;

import com.travelmanager.Passenger.GoldPassengerType;
import com.travelmanager.Passenger.Passenger;
import com.travelmanager.Passenger.PremiumPassengerType;
import com.travelmanager.Passenger.StandardPassengerType;
import com.travelmanager.Travel.Activity;
import com.travelmanager.Travel.Destination;
import com.travelmanager.Travel.TravelPackage;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Create Travel Package
        TravelPackage europeTrip = new TravelPackage("Europe Trip", 20);

        // Create Destinations
        Destination paris = new Destination("Paris");
        Destination rome = new Destination("Rome");

        // Create Activities
        Activity eiffelTowerTour = new Activity("Eiffel Tower Tour", "Explore Eiffel Tower", 50.0, 10, paris);
        Activity louvreVisit = new Activity("Louvre Museum Visit", "Visit Louvre Museum", 40.0, 15, paris);
        Activity colosseumTour = new Activity("Colosseum Tour", "Explore Colosseum", 60.0, 12, rome);
        Activity vaticanCityTour = new Activity("Vatican City Tour", "Explore Vatican City", 55.0, 10, rome);

        // Add Activities to Destinations
        paris.addActivity(eiffelTowerTour);
        paris.addActivity(louvreVisit);
        rome.addActivity(colosseumTour);
        rome.addActivity(vaticanCityTour);

        // Add Destinations to Travel Package
        europeTrip.addDestination(paris);
        europeTrip.addDestination(rome);

        // Create Passengers
        Passenger passenger1 = new Passenger("John", 1, 200.0, new StandardPassengerType());
        Passenger passenger2 = new Passenger("Alice", 2, 300.0, new GoldPassengerType());
        Passenger passenger3 = new Passenger("Bob", 3, 0.0, new PremiumPassengerType());

        // Sign up Passengers for Activities
        passenger1.signUpForActivity(eiffelTowerTour);
        passenger2.signUpForActivity(louvreVisit);
        passenger3.signUpForActivity(colosseumTour);

        // Add Passengers to Travel Package
        europeTrip.addPassenger(passenger1);
        europeTrip.addPassenger(passenger2);
        europeTrip.addPassenger(passenger3);



        System.out.println("<----------------->");
        europeTrip.printItinerary();
        System.out.println();
        europeTrip.printPassengerList();
        System.out.println();
        passenger1.printPassengerDetails();
        System.out.println();
        europeTrip.printAvailableActivities();
    }

}