package org.ies.objects.library.readers;

import org.ies.objects.library.model.Autor;
import org.ies.objects.library.model.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final AutorReader authorReader;

    public BookReader(Scanner scanner, AutorReader authorReader) {
        this.scanner = scanner;
        this.authorReader = authorReader;
    }

    public Book read() {
        System.out.println("Introduce los datos del libro");
        System.out.println("ISBN:");
        int isbn = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Título:");
        String title = scanner.nextLine();

        System.out.println("Año:");
        int year = scanner.nextInt();
        scanner.nextLine();

        int numAuthors;
        do {
            System.out.println("¿Cuántos autores tiene el libro?");
            numAuthors = scanner.nextInt();
            scanner.nextLine();
        } while (numAuthors < 1);

        Autor[] authors = new Autor[numAuthors];

        for (int i = 0; i < authors.length; i++) {
            authors[i] = authorReader.read();
        }

        return new Book(
                isbn,
                title,
                year,
                authors
        );
    }
}





