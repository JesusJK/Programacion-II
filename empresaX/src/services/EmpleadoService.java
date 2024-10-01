package services;

import models.Empleado;
import java.util.HashMap;
import java.util.Scanner;

public class EmpleadoService {
    private Scanner sc;
    private Empleado empleado;
    private HashMap<String,Empleado> listaEmpleado;
    private DireccionService direccionService;

    public EmpleadoService() {
        this.sc = new Scanner(System.in);
        listaEmpleado = new HashMap<>();
    }

    public void menu() {
        int seleccion;
        do {
            System.out.println("*****MENU*****");
            System.out.println("1 - CREAR EMPLEADO");
            System.out.println("2 - MODIFICAR EMPLEADO");
            System.out.println("3 - BUSCAR EMPLEADO");
            System.out.println("4 - LISTAR EMPLEADOS");
            System.out.println("0 - SALIR");
            System.out.println("Ingrese un valor del menu");
            seleccion = sc.nextInt();
            switch (seleccion) {
                case 1 -> crearEmpleado();
                case 2 -> modificarEmpleado();
                case 3 -> buscarEmpleado();
                case 4 -> listarEmpleados();
                default -> {
                    seleccion = 0;
                    System.out.println("Gracias por utilizar este menu");
                }
            }
        } while (seleccion != 0);
    }

    private void crearEmpleado() {
        System.out.println("****CREAR EMPLEADOS****");
        System.out.println("Ingrese el codigo");
        String codigo = sc.next();

        System.out.println("Ingrese el nombre del empleado");
        String nombre = sc.next();

        System.out.println("Ingrese las horas trabajadas");
        int horas = sc.nextInt();

        System.out.println("Ingrese el valor de la hora");
        double valor = sc.nextDouble();

        empleado = new Empleado(codigo, nombre, horas, valor, calcularSueldo(horas, valor));
        listaEmpleado.put(codigo,empleado);
    }

    private void modificarEmpleado() {
        empleado = buscarEmpleado();

            System.out.println("Ingrese el nuevo nombre");
            empleado.setNombreEmpleado(sc.next());

            System.out.println("Ingrese las horas trabajadas");
            int horas = sc.nextInt();
            empleado.setHorasTrabajadas(horas);

            System.out.println("Ingrese el valor de la hora");
            double valor = sc.nextDouble();
            empleado.setValorHoraTrabajada(valor);

            empleado.setSalario(calcularSueldo(horas, valor));
            listaEmpleado.put(empleado.getCodigo(),empleado);


    }

    private Empleado buscarEmpleado() {
        System.out.println("BUSCAR EMPLEADO");
        System.out.println("Ingrese el codigo del empleado a buscar");
        String codigo = sc.next();
        Empleado empleadoEncontrado = null;
        if (listaEmpleado.containsKey(codigo)) {
            empleadoEncontrado = listaEmpleado.get(codigo);
            System.out.println("Nombre: " + empleadoEncontrado.getNombreEmpleado());
            System.out.println("Horas: " + empleadoEncontrado.getHorasTrabajadas());
            System.out.println("Valor: " + empleadoEncontrado.getValorHoraTrabajada());
            System.out.println("Salario: " + empleadoEncontrado.getSalario());
        }else {
            System.out.println("El empleado no existe");
            buscarEmpleado();
        }
        return empleadoEncontrado;

    }

    private void listarEmpleados() {
        System.out.println("LISTAR EMPLEADOS");
        for (Empleado empleado : listaEmpleado.values()) {
            System.out.println(empleado);
        }
    }

    private double calcularSueldo(int horas, double valorHora) {
        return horas * valorHora;
    }
}




