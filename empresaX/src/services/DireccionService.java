package services;

import models.Direccion;
import java.util.Scanner;

public class DireccionService {
    private Scanner sc;
    private Direccion direccion;

    public DireccionService() {
        this.sc = new Scanner(System.in);

    }

    public Direccion crearDireccion(){
        System.out.println("CREAR LA DIRECCIÓN");
        System.out.println("Describa el nombre de la calle");
        String calle = sc.next();
        System.out.println("Escriba el numero de la casa");
        String numero = sc.next();
        System.out.println("Escriba el nombre del barrio");
        String barrio = sc.next();
        System.out.println("Escriba el nombre de la ciudad");
        String ciudad = sc.next();
        System.out.println("Escriba el numero postal");
        String nPostal = sc.next();
        direccion = new Direccion(calle, numero, barrio, ciudad, nPostal);
        return direccion;
    }

}
