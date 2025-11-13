package org.ies.objects.garage.model;

import java.util.Arrays;
import java.util.Objects;

public class Garaje {
    private String name;
    private String direction;
    private Vehicule[] vehicules;

    public Garaje(String name, String direction, Vehicule[] vehicules) {
        this.name = name;
        this.direction = direction;
        this.vehicules = vehicules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Vehicule[] getVehicules() {
        return vehicules;
    }

    public void setVehicules(Vehicule[] vehicules) {
        this.vehicules = vehicules;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Garaje garage = (Garaje) o;
        return Objects.equals(name, garage.name) && Objects.equals(direction, garage.direction) && Objects.deepEquals(vehicules, garage.vehicules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, direction, Arrays.hashCode(vehicules));
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                ", vehicules=" + Arrays.toString(vehicules) +
                '}';
    }
}
