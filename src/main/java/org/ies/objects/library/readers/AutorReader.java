package org.ies.objects.library.readers;


import org.ies.objects.library.model.Autor;

import java.util.Scanner;

public class AutorReader {
    private final Scanner scanner;
    public AutorReader(Scanner scanner){
        this.scanner=scanner;
    }
    public Autor read(){
        System.out.println("Introduce tu NIF");
        String nif= scanner.nextLine();
        scanner.nextLine();
        System.out.println("Introduce tu nombre");
        String name=scanner.nextLine();
        System.out.println("Introduce tu apellido");
        String surname=scanner.nextLine();


        return new Autor(nif,name,surname);
    }
}
