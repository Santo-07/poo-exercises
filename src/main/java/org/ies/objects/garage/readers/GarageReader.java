package org.ies.objects.garage.readers;



import org.ies.objects.garage.model.Garaje;
import org.ies.objects.garage.model.Vehicule;

import java.util.Scanner;

public class GarageReader {
    private final Scanner scanner;
    private final VehiculeReader vehicleReader;

    public GarageReader(Scanner scanner, VehiculeReader vehicleReader) {
        this.scanner = scanner;
        this.vehicleReader = vehicleReader;
    }

    public Garaje read() {
        System.out.println("Introduce los datos del taller");

        System.out.println("Nombre:");
        String name = scanner.nextLine();

        System.out.println("Dirección:");
        String address = scanner.nextLine();

        Vehicule[] vehicles = readVehicles();

        return new Garaje(
                name,
                address,
                vehicles
        );
    }

    private Vehicule[] readVehicles() {
        int numVehicles;
        do {
            System.out.println("¿Cuántos vehículos hay en el taller?");
            numVehicles = scanner.nextInt();
            scanner.nextLine();
        } while (numVehicles < 1);

        Vehicule[] vehicles = new Vehicule[numVehicles];
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = vehicleReader.read();
        }
        return vehicles;
    }
}