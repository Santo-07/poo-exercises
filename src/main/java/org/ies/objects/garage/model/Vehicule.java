package org.ies.objects.garage.model;

import java.util.Objects;

public class Vehicule {
    private VehiculeType vehiculeType;
    private double maxspeed;
    private String color;
    private int matricula;

    public Vehicule(VehiculeType vehiculeType, double maxspeed, String color, int matricula) {
        this.vehiculeType = vehiculeType;
        this.maxspeed = maxspeed;
        this.color = color;
        this.matricula = matricula;
    }

    public Vehicule(String name, String direction, Vehicule[] vehicules) {
    }

    public VehiculeType getVehiculeType() {
        return vehiculeType;
    }

    public void setVehiculeType(VehiculeType vehiculeType) {
        this.vehiculeType = vehiculeType;
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return Double.compare(maxspeed, vehicule.maxspeed) == 0 && matricula == vehicule.matricula && vehiculeType == vehicule.vehiculeType && Objects.equals(color, vehicule.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehiculeType, maxspeed, color, matricula);
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "vehiculeType=" + vehiculeType +
                ", maxspeed=" + maxspeed +
                ", color='" + color + '\'' +
                ", matrucula=" + matricula +
                '}';
    }
}
