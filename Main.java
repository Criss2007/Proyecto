public class Main {

    public static void main(String[] args) {
       System.out.println("PERSONAL DE LA CONCESIONARIA"); 

        Empleado v = new Vendedor("Carlos", 1000, 3);
        Empleado m = new Mecanico("Ana", 900, 10);
        Empleado g = new Gerente("Luis", 2000, 500);
        Empleado a = new AsesorServicio("Sofia", 950);

        v.trabajar();
        System.out.println("Sueldo total: $" + v.calcularSueldo());
        System.out.println("------------------------------------");
        
        m.trabajar();
        System.out.println("Sueldo total: $" + m.calcularSueldo());
        System.out.println("------------------------------------");
        
        g.trabajar();
        System.out.println("Sueldo total: $" + g.calcularSueldo());
        System.out.println("------------------------------------");
        
         a.trabajar();
        System.out.println("Sueldo total: $" + a.calcularSueldo());
        System.out.println("------------------------------------");
    }
}
