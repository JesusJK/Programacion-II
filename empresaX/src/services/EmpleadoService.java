package services;

import models.Empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoService {
    private Scanner sc;
    private Empleado empleado;
    private ArrayList<Empleado> listaEmpleados;

    public EmpleadoService() {
        this.sc = new Scanner(System.in);
        listaEmpleados = new ArrayList<>();
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
        System.out.println("El codigo tiene que llevar 4 digitos por los menos");
        String codigo = sc.next();
        while (codigo.length() != 4) {
            System.out.println("El codigo no tiene 4 digitos tilin, ingrese otro");
            codigo = sc.next();
        }
        for (int i = 0; i < listaEmpleados.size(); i++) {
            while (codigo.equals(listaEmpleados.get(i).getCodigo())) {
                System.out.println("El codigo ya existe rey");
                System.out.println("Ingrese otro codigo Por favor");
                codigo = sc.next();
            }
            while (codigo.length() != 4) {
                System.out.println("El codigo no tiene 4 digitos tilin, ingrese otro");
                codigo = sc.next();
            }
        }

        System.out.println("Ingrese el nombre del empleado");
        String nombre = sc.next();

        System.out.println("Ingrese las horas trabajadas");
        int horas = sc.nextInt();

        System.out.println("Ingrese el valor de la hora");
        double valor = sc.nextDouble();


        empleado = new Empleado(codigo, nombre, horas, valor, calcularSueldo(horas , valor));
        listaEmpleados.add(empleado);

    }

    private void modificarEmpleado() {
        int posicion = buscarEmpleado();
        if (posicion != -1) {
            empleado = listaEmpleados.get(posicion);
            System.out.println("Ingrese el nuevo nombre");
            empleado.setNombreEmpleado(sc.next());

            System.out.println("Ingrese las horas trabajadas");
            int horas = sc.nextInt();
            empleado.setHorasTrabajadas(horas);

            System.out.println("Ingrese el valor de la hora");
            double valor = sc.nextDouble();
            empleado.setValorHoraTrabajada(valor);

            empleado.setSalario(calcularSueldo(horas, valor));
            listaEmpleados.set(posicion, empleado);
        }
    }

    private int buscarEmpleado() {
        System.out.println("BUSCAR EMPLEADO");
        System.out.println("Ingrese el codigo del empleado a buscar");
        String codigo = sc.next();
        Empleado empleadoEncontrado = null;
        for (Empleado empleado : listaEmpleados) {
            if (codigo.equals(empleado.getCodigo())) {
                empleadoEncontrado = empleado;
                System.out.println("Empleado encontrado.");
                System.out.println("Nombre:"+empleadoEncontrado.getNombreEmpleado());
                System.out.println("Horas Trabajadas:"+empleadoEncontrado.getHorasTrabajadas());
                System.out.println("Valor de las Horas:"+empleadoEncontrado.getValorHoraTrabajadas());
                break;
            }
            else {
                System.out.println("El Empleado no a sido encontrado o no Existe");
                break;
            }
        }
        return listaEmpleados.indexOf(empleadoEncontrado);
    }

    private void listarEmpleados() {
        System.out.println("LISTAR EMPLEADOS");
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado.getCodigo() + " | " + empleado.getNombreEmpleado() + " | " +
                    empleado.getSalario());
        }
    }

    private double calcularSueldo(int horas, double valorHora) {
        return horas * valorHora;
    }
}




