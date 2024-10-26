package org.programacion;

import org.programacion.servicios.PersonaService;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();
        personaService.menu();

    }
}