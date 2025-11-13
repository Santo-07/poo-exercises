package org.ies.objects.highschool.readers;

import org.ies.objects.highschool.model.Student;

import java.util.Scanner;

public class StudentReader {
    private final Scanner scanner;
    public StudentReader(Scanner scanner){
        this.scanner=scanner;
    }
    public Student read(){
        System.out.println("Introduce tu nombre");
        String name=scanner.nextLine();
        System.out.println("Introduce tu apellido");
        String surname=scanner.nextLine();
        System.out.println("Introduce tu dirección");
        String direction=scanner.nextLine();

        return new Student(name, surname, direction);
    }


}
