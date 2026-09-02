
package com.mycompany.mavenproject1;

public class Mecanico extends Empleado {
    private int horasExtra;

    public Mecanico(String nombre, double salarioBase, int horasExtra) {
        super(nombre, salarioBase);
        this.horasExtra = horasExtra;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está en el taller realizando reparaciones.");
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + (horasExtra * 20); // Gana $20 por hora extra
    }
}