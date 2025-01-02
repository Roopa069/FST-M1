import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private int maxPassengers;
    private List<String> passengers;
    private Date lastTimeLanded;

    // Constructor to initialize maxPassengers and passengers
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // Method to add passengers to the array
    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Cannot add more passengers. The plane is full.");
        }
    }

    // Method to return the current date and time (take-off time)
    public Date takeOff() {
        return new Date();
    }

    // Method to set the value of lastTimeLanded to the current date and time and clear the array
    public void land() {
        this.lastTimeLanded = new Date();
        passengers.clear();
    }

    // Method to return the value of lastTimeLanded
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    // Method to return the list of passengers
    public List<String> getPassengers() {
        return passengers;
    }
}

public class activity6 {
    public static void main(String[] args) {
        // Create an object of the Plane class with maxPassengers set to 10
        Plane plane = new Plane(10);

        // Add names to the passengers list using the onboard method
        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");

        // Print the take-off time using the takeOff() method
        Date takeOffTime = plane.takeOff();
        System.out.println("Take-off time: " + takeOffTime);

        // Print the list of passengers using the getPassengers() method
        System.out.println("Passengers on board: " + plane.getPassengers());

        try {
            // Pause execution for 5 seconds to emulate plane in flight
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Land the plane and print the time of landing using getLastTimeLanded() method
        plane.land();
        System.out.println("Landing time: " + plane.getLastTimeLanded());

        // Print the list of passengers after landing
        System.out.println("Passengers after landing: " + plane.getPassengers());
    }
}


