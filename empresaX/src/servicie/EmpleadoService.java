package servicie;
import models.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpleadoService {
    private Scanner sc;
    private Empleado empleado;
    private ArrayList <Empleado> listaEmpleado;

    public EmpleadoService(){
        this.sc = new Scanner(System.in);
        listaEmpleado = new ArrayList<>();
    }

    public void menu(){
        int seleccion;
        do{
            System.out.println("______Menu______");
            System.out.println("1.Crear Empleado");
            System.out.println("2.Modificar Empleado");
            System.out.println("3.Buscar Empleado");
            System.out.println("4.Listar Empleado");
            System.out.println("0.Salir");
            System.out.println("Ingrese un valor del menu");
            seleccion = sc.nextInt();
            switch (seleccion){
                case 1 -> crearEmpleado();
                case 2 -> modificarEmpleado();
                case 3 -> buscarEmpleado();
                case 4 -> listarEmpleado();
                default -> {
                    seleccion = 0;
                    System.out.println("Gracias por usar el menu hiperchat :v");
                }
            }
        } while (seleccion != 0);
    }

    private void crearEmpleado(){
        System.out.println("***CREAR EMPLEADOS***");
        System.out.println("Ingrese el codigo del empleado");
        String codigo = sc.next();

        System.out.println("Ingrese el nombre del empleado");
        String nombreEmpleado = sc.next();

        System.out.println("Ingrese las horas trabajadas");
        int horas = sc.nextInt();

        System.out.println("Ingrese el valor de la hora");
        double valorHora = sc.nextDouble();

        //crear un metodo que valide el codigo para que no se repitan los codigos
        Empleado empleado = new Empleado(codigo,nombreEmpleado,horas,valorHora, calcularSueldo(horas,valorHora));
        listaEmpleado.add(empleado);

    }

    private void modificarEmpleado(){
        int posicion = buscarEmpleado();
        if (posicion != -1) {
            empleado = listaEmpleado.get(posicion);
            System.out.println("Ingrese el nuevo nombre del empleado");
            empleado.setNombreEmpleado(sc.next());

            System.out.println("Ingrese las horas trabajadas");
            int horas = sc.nextInt();
            empleado.setHorasTrabajadas(horas);

            System.out.println("Ingrese el valor de la hora");
            double valorHora = sc.nextDouble();
            empleado.setValorHora(valorHora);
            empleado.setSueldo(calcularSueldo(horas,valorHora));
            listaEmpleado.set(posicion, empleado);
        }
    }

    private int buscarEmpleado(){               //modificar metodo
        System.out.println("BUSCAR EMPLEADO");
        System.out.println("Ingrese el codigo del empleado a buscar");
        String codigo = sc.next();
        Empleado empleadoencontrado=null;
        for (Empleado empleado : listaEmpleado) {
            if (codigo.equals(empleado.getCodigo())){
                //metodo para que se visualice el empleado encontrado
                empleadoencontrado = empleado;
                break;
            }
        }
        return listaEmpleado.indexOf(empleadoencontrado);
    }
    private void listarEmpleado(){
        System.out.println("LISTAR EMPLEADO");
        for (Empleado empleado : listaEmpleado) {
            System.out.println(empleado.getCodigo() + " | " + empleado.getNombreEmpleado() + " | " + empleado.getSueldo());

        }
    }
    private double calcularSueldo(int horas, double valorHora){
        return horas * valorHora;
    }

}
