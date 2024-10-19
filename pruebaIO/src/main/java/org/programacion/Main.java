package org.programacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/resources/data/empleados.json");
        System.out.println("Does it exists? " + file.exists());
        System.out.println("Does file has " + file.length() + " Bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("It it a file? " + file.isFile());
        System.out.println("Is it a absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modified on " + new Date(file.lastModified()));

        System.out.println("Escribiendo el Archivo");
        try {
            /*PrintWriter escribir = new PrintWriter(file);
            escribir.println("Hola mundo escribir");
            escribir.println("otro texto");
            escribir.close();*/
            Scanner leer = new Scanner(file);
            while (leer.hasNext()){
                System.out.println(leer.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("El archivo no existe");
        }

    }
}