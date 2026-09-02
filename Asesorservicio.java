public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está supervisando las operaciones de la concesionaria.");
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + bono; // Suma un bono fijo de gerencia
    }
}