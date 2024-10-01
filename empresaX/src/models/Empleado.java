package models;

public class Empleado {
    private String codigo;
    private String nombreEmpleado;
    private int horasTrabajadas;
    private double valorHoraTrabajadas;
    private double salario;

    public Empleado() {
        this.codigo = "00000";
        this.nombreEmpleado = "Sin definir";
        this.horasTrabajadas = 0;
        this.valorHoraTrabajadas = 0;
        this.salario = 0;
    }

    public Empleado(String codigo, String nombreEmpleado, int horasTrabajadas, double valorHoraTrabajadas, double salario) {
        this.codigo = codigo;
        this.nombreEmpleado = nombreEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoraTrabajadas = valorHoraTrabajadas;
        this.salario = salario;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setValorHoraTrabajada(double valorHoraTrabajadas) {
        this.valorHoraTrabajadas = valorHoraTrabajadas;
    }
    public double getValorHoraTrabajadas() {
        return valorHoraTrabajadas;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}














