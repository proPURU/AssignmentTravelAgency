package com.travelmanager.Travel;

import com.travelmanager.Passenger.Passenger;

import java.util.ArrayList;
import java.util.List;


    public class TravelPackage {
        private String name;
        private int passengerCapacity;
        private List<Destination> destinations;
        private List<Passenger> passengers;

        public TravelPackage(String name, int passengerCapacity) {
            this.name = name;
            this.passengerCapacity = passengerCapacity;
            this.destinations = new ArrayList<>();
            this.passengers = new ArrayList<>();
        }

        public void addDestination(Destination destination) {
            destinations.add(destination);
        }

        public void addPassenger(Passenger passenger) {
            if (passengers.size() < passengerCapacity) {
                passengers.add(passenger);
            } else {
                System.out.println("Travel package is full. Cannot add more passengers.");
            }
        }

        public void printItinerary() {
            System.out.println("Travel Package Itinerary:");
            System.out.println("Package Name: " + name);
            System.out.println("Destinations and Activities:");

            for (Destination destination : destinations) {
                System.out.println("Destination: " + destination.getName());
                List<Activity> activities = destination.getActivities();

                if (activities.isEmpty()) {
                    System.out.println("No activities available at this destination.");
                } else {
                    for (Activity activity : activities) {
                        System.out.println("  Activity: " + activity.getName());
                        System.out.println("    Cost: $" + activity.getCost());
                        System.out.println("    Capacity: " + activity.getCapacity());
                        System.out.println("    Description: " + activity.getDescription());
                    }
                }
                System.out.println("---");
            }
        }

        public void printPassengerList() {
            System.out.println("Passenger List for Travel Package " + name + ":");
            System.out.println("Package Capacity: " + passengerCapacity);
            System.out.println("Number of Passengers Enrolled: " + passengers.size());

            for (Passenger passenger : passengers) {
                System.out.println("Passenger Name: " + passenger.getName());
                System.out.println("Passenger Number: " + passenger.getPassengerNumber());
                System.out.println("---");
            }
        }

        public void printAvailableActivities() {
            System.out.println("Available Activities for Travel Package " + name + ":");
            for (Destination destination : destinations) {
                List<Activity> activities = destination.getActivities();

                for (Activity activity : activities) {
                    if (activity.getCapacity() > 0) {
                        System.out.println("Destination: " + destination.getName());
                        System.out.println("Activity: " + activity.getName());
                        System.out.println("Cost: $" + activity.getCost());
                        System.out.println("Capacity: " + activity.getCapacity());
                        System.out.println("Description: " + activity.getDescription());
                        System.out.println("---");
                    }
                }
            }
        }

}
