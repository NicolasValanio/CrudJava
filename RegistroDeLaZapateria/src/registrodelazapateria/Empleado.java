/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrodelazapateria;

/**
 *
 * @author aula16
 */
public class Empleado {
    private int codigo ;
    private String nombre;
    private String cargo;
    private String fechaContrato;

    public Empleado(int codigo, String nombre, String cargo, String fechaContrato, double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargo = cargo;
        this.fechaContrato = fechaContrato;
        this.sueldo = sueldo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    private double sueldo;
}

