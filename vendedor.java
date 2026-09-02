package consecionario;

public class vendedor extends Empleado {
    private int ventas;

    public vendedor(String nombre, double salarioBase, int ventas) {
        super(nombre, salarioBase);
        this.ventas = ventas;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está atendiendo clientes y vendiendo autos.");
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + (ventas * 100); // Gana $100 de comisión por venta
    }
}    

