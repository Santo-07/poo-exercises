package org.ies.objects.library.model;

import java.util.Objects;

public class Autor {
    private String nif;
    private String name;
    private String surname;

    public Autor(String nif, String name, String surname) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
    }
    public void showinfo(){
        System.out.println("Su nif es "+nif+" ,su nombre es: "+name +"y su apellido es "+surname);
    }

    public String getNIF() {
        return nif;
    }

    public void setNIF(String NIF) {
        this.nif = NIF;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return nif == autor.nif && Objects.equals(name, autor.name) && Objects.equals(surname, autor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "NIF=" + nif +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
