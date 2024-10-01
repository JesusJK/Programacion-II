package models;

public class Empleado {
    private String codigo;
    private String nombreEmpleado;
    private int horasTrabajadas;
    private double valorHoraTrabajada;
    private double salario;

    public Empleado() {
        this.codigo = "00000";
        this.nombreEmpleado = "Sin definir";
        this.horasTrabajadas = 0;
        this.valorHoraTrabajada = 0;
        this.salario = 0;
    }

    public Empleado(String codigo, String nombreEmpleado, int horasTrabajadas, double valorHoraTrabajada, double salario) {
        this.codigo = codigo;
        this.nombreEmpleado = nombreEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoraTrabajada = valorHoraTrabajada;
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHoraTrabajada() {
        return valorHoraTrabajada;
    }

    public void setValorHoraTrabajada(double valorHoraTrabajada) {
        this.valorHoraTrabajada = valorHoraTrabajada;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "codigo='" + codigo + '\'' +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", horasTrabajadas=" + horasTrabajadas +
                ", valorHoraTrabajada=" + valorHoraTrabajada +
                ", salario=" + salario +
                '}';
    }
}











