package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

class Trip {
    String destination;
    int duration; // in days
    double price;

    public Trip(String destination, int duration, double price) {
        this.destination = destination;
        this.duration = duration;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Destination: " + destination + ", Duration: " + duration + " days, Price: $" + price;
    }
}

public class Ex_31 {
    String name;
    LinkedList<Trip> tripList = new LinkedList<>();

    public Ex_31(String name) {
        this.name = name;
    }

    public void addTrip(Trip trip) {
        tripList.add(trip);
    }

    public void removeTrip(String destination) {
        tripList.removeIf(trip -> trip.destination.equalsIgnoreCase(destination));
    }

    public void findTripsInPriceRange(double minPrice, double maxPrice) {
        System.out.println("Trips in the price range $" + minPrice + " - $" + maxPrice + ":");
        for (Trip trip : tripList) {
            if (trip.price >= minPrice && trip.price <= maxPrice) {
                System.out.println(trip);
            }
        }
    }

    public void displayTrips() {
        for (Trip trip : tripList) {
            System.out.println(trip);
        }
    }

    public static void main(String[] args) {
        Ex_31 agency = new Ex_31("Dream Vacations");
        agency.addTrip(new Trip("Hawaii", 7, 1200));
        agency.addTrip(new Trip("France", 10, 2500));
        agency.addTrip(new Trip("Japan", 14, 3000));

        agency.displayTrips();
        agency.findTripsInPriceRange(1000, 2500);

        agency.removeTrip("Hawaii");
        System.out.println("After removing trip to Hawaii:");
        agency.displayTrips();
    }
}
