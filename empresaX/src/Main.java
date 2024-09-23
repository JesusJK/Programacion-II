import models.Empleado;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Empleado empleado = new Empleado();
        System.out.println("ingrese el nombre del empleado");
        String nombre = sc.nextLine();
        empleado.setNombreEmpleado(nombre);

        System.out.println("Ingrese horas trabajadas");
        int horas = sc.nextInt();
        empleado.setHorasTrabajadas(horas);

        System.out.println("ingrese el valor de la hora");
        double valor = sc.nextDouble();
        empleado.setValorHora(valor);
        System.out.println("Cheque generado a " + empleado.getNombreEmpleado()+ " con valor " +  empleado.getSueldo());
    }
}