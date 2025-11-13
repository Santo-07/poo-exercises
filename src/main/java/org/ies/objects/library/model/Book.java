package org.ies.objects.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private int isbn;
    private String titule;
    private int year;
    private Autor[] autors;

    public Book(int isbn, String titule, int year, Autor[] autors) {
        this.isbn = isbn;
        this.titule = titule;
        this.year = year;
        this.autors = autors;
    }

    public boolean hasAutor(String nif) {
        for (Autor autor : autors) {
            if (nif.equals(autor.getNIF()))
                return true;
        }
        return false;
    }


    public int getISBN() {
        return isbn;
    }

    public void setISBN(int isbn) {
        this.isbn = isbn;
    }

    public String getTitule() {
        return titule;
    }

    public void setTitule(String titule) {
        this.titule = titule;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Autor[] getAutors() {
        return autors;
    }

    public void setAutors(Autor[] autors) {
        this.autors = autors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && year == book.year && Objects.equals(titule, book.titule) && Objects.deepEquals(autors, book.autors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, titule, year, Arrays.hashCode(autors));
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + isbn +
                ", titule='" + titule + '\'' +
                ", year=" + year +
                ", autors=" + Arrays.toString(autors) +
                '}';
    }
}
