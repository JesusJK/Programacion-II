package org.programacion.servicios;

import java.util.Date;
import java.util.Scanner;
import org.programacion.modelos.Persona;


public class PersonaService {
    private Persona persona;
    private Scanner sc;
    private PersonaIOServicie personaIOServicie;

    public  PersonaService(){
        sc = new Scanner(System.in);
        personaIOServicie = new PersonaIOServicie();
    }

    public void menu(){
        int opcion = 0;
        do {
            System.out.println("MENU DE OPCIONES JSON");
            System.out.println("1 -> Crear Persona");
            System.out.println("2 -> Visualizar Persona");
            System.out.println("Ingrese una Opcion");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 -> crearPersona();
                case 2 -> visualizarPersona();
                default -> opcion=0;
            }
        }while (opcion != 0);
    }

    private void visualizarPersona(){
        System.out.println("Visualizar Persona");
        persona = personaIOServicie.leerJson();
        System.out.println(persona);

    }
    private void crearPersona(){
        System.out.println("Crear una Persona");
        System.out.println("Ingrese el nombre de la persona");
        String nombre = sc.next();
        System.out.println("Ingrese el telefono");
        String telefono = sc.next();
        System.out.println("Ingrese el correo");
        String correo = sc.next();
        String fechaCreacion = new Date().toString();
        persona = new Persona(nombre,telefono,correo,fechaCreacion);
        personaIOServicie.escribirJson(persona);

    }
}
