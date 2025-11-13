package org.ies.objects.airline.model;

import java.util.Objects;

public class Passenger {
    private int nif;
    private String name;
    private String surname;
    private int seets;

    public Passenger(int nif, String name, String surname, int seets) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.seets = seets;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSeets() {
        return seets;
    }

    public void setSeets(int seets) {
        this.seets = seets;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return nif == passenger.nif && seets == passenger.seets && Objects.equals(name, passenger.name) && Objects.equals(surname, passenger.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, seets);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "nif=" + nif +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", seets=" + seets +
                '}';
    }
}
