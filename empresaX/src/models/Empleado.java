package models;

public class Empleado {
    private String codigo;
    private String nombreEmpleado;
    private int horasTrabajadas;
    private double valorHora;
    private double sueldo;

    // sobrecarga de constructores
    public Empleado() {
        this.codigo = "00000";
        this.nombreEmpleado = "Sin definir";
        this.horasTrabajadas = 0;
        this.valorHora = 0;
        this.sueldo = 0;
    }

    public Empleado(String codigo, String nombreEmpleado, int horasTrabajadas, double valorHora, double sueldo) {
        this.codigo = codigo;
        this.nombreEmpleado = nombreEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.sueldo = sueldo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getValorHora() {
        return valorHora;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public double getSueldo() {
        return sueldo;
    }






















}
