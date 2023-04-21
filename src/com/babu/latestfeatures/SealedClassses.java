package com.babu.latestfeatures;

/**
 * In Java 17
 * This feature is about enabling more fine-grained inheritance control in Java.
 * Sealing allows classes and interfaces to define their permitted subtypes.
 *
 * In other words, a class or an interface can now define which classes can implement or extend it.
 * It is a useful feature for domain modeling and increasing the security of libraries.
 *
 * As an example, imagine a business domain that only works with cars and trucks, not motorcycles.
 * When creating the Vehicle abstract class in Java, we should be able to allow only Car and Truck classes
 * to extend it. In that way, we want to ensure that there will be no misuse of the Vehicle abstract class
 * within our domain.
 *
 * Thus, the main motivation behind sealed classes is to have the possibility for a superclass to be widely
 * accessible but not widely extensible.
 */
public class SealedClassses {

    public static void main(String[] args) {
        Vehicle vehicle = new Car(5, "AP10BP1070");

        if (vehicle instanceof Car car) {
            //return car.getNumberOfSeats();
            System.out.println(car.getNumberOfSeats());
        } else if (vehicle instanceof Truck truck) {
            //return truck.getLoadCapacity();
            System.out.println(truck.getLoadCapacity());
        } else {
            throw new RuntimeException("Unknown instance of Vehicle");
        }
    }
}

