package models;

public class Empleado {
    private String codigo;
    private String nombreEmpleado;
    private int horasTrabajadas;
    private double valorHoraTrabajada;
    private double salario;
    private Direccion direccion;

    public Empleado() {
        this.codigo = "00000";
        this.nombreEmpleado = "Sin definir";
        this.horasTrabajadas = 0;
        this.valorHoraTrabajada = 0;
        this.salario = 0;
        this.direccion = null;
    }

    public Empleado(String codigo, String nombreEmpleado, int horasTrabajadas, double valorHoraTrabajada, double salario, Direccion direccion) {
        this.codigo = codigo;
        this.nombreEmpleado = nombreEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoraTrabajada = valorHoraTrabajada;
        this.salario = salario;
        this.direccion = direccion;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public double getValorHoraTrabajada() {
        return valorHoraTrabajada;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public void setValorHoraTrabajada(double valorHoraTrabajada) {
        this.valorHoraTrabajada = valorHoraTrabajada;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "codigo='" + codigo + '\'' +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                ", valorHoraTrabajada=" + valorHoraTrabajada +
                ", salario=" + salario +
                ", direccion=" + direccion +
                '}';
    }
}











