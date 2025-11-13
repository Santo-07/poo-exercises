package org.ies.objects.garage.readers;

import org.ies.objects.garage.model.Vehicule;
import org.ies.objects.garage.model.VehiculeType;

import java.util.Scanner;

public class VehiculeReader {

    private final Scanner scanner;

    public VehiculeReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Vehicule read() {
        System.out.println("Introduce los datos del vehículo:");

        VehiculeType vehicleType = null;
        do {
            System.out.println("Tipo de vehiculo:");
            System.out.println("1. Moto");
            System.out.println("2. Coche");
            System.out.println("3. Camión");
            int index = scanner.nextInt();
            scanner.nextLine();
            if (index == 1) {
                vehicleType = VehiculeType.Motorbike;
            } else if (index == 2) {
                vehicleType = VehiculeType.Car;
            } else if (index == 3) {
                vehicleType = VehiculeType.Truck;
            } else {
                System.out.println("Opción inválida");
            }
        } while (vehicleType == null);

        System.out.println("Máxima velocidad:");
        int maxSpeed = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Color:");
        String color = scanner.nextLine();

        System.out.println("Matrícula:");
        int plate = scanner.nextInt();
        scanner.nextLine();

        return new Vehicule(
                vehicleType,
                maxSpeed,
                color,
                plate
        );

    }
}
