package org.ies.objects.highschool.model;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private String direction;

    public Student(String name, String surname, String direction) {
        this.name = name;
        this.surname = surname;
        this.direction = direction;
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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(direction, student.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, direction);
    }

    @Override
    public String toString() {
        return "Pogo.model.model.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}
