package org.ies.objects.highschool.readers;

import org.ies.objects.highschool.model.Highschool;
import org.ies.objects.highschool.model.Student;

import java.util.Scanner;

public class HighschoolReader {
    private final Scanner scanner;
    private final StudentReader studentReader;

    public HighschoolReader(Scanner scanner, StudentReader studentReader) {
        this.scanner = scanner;
        this.studentReader = studentReader;
    }


    public Highschool read() {
        System.out.println("Introduce tu nombre");
        String name = scanner.nextLine();
        int numStudents;
        do {
            System.out.println("¿Cuántos estudiantes vas a introducir?");
            numStudents = scanner.nextInt();
            scanner.nextLine();
        }while(numStudents<=0);
        Student[] students = new Student[numStudents];

        for (int i = 0; i < students.length; i++){
            students[i] = studentReader.read();
    }
        return new Highschool(name,students);
    }
}
