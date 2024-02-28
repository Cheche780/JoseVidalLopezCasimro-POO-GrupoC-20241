
package tarea.pkg5;

public class Tarea5 {

    public static void main(String[] args) {
rectangle rectangle1 = new rectangle();
Empleado empleado1 = new Empleado();
calculadoraImpuestos calcularImpuesto = new calculadoraImpuestos();
//results' rectangle
        System.out.println(rectangle1.resultados(5, 6));
        System.out.println(rectangle1.resultados(5.5, 6.5));
        System.out.println("*******\n");
        
        //salary's emplado
        System.out.println(empleado1.calcularSalario(15000.99));
        System.out.println(empleado1.calcularSalario(150000.99, 1000));
        System.out.println(empleado1.calcularSalario(150000.99, 1000, 5));
        System.out.println("");
        //calculadora impuesto
        System.out.println("solo retorna ingresos");
        System.out.println(calcularImpuesto.calcularImpuesto(1000, 0, 0, 0));
        System.out.println("retorna ventas y porcentaje de impuestos");
        System.out.println(calcularImpuesto.calcularImpuesto(1000, 200, 0, 0));
        System.out.println("retorna porcentaje de impuestos, dividendo y excencion");
        System.out.println(calcularImpuesto.calcularImpuesto(0, 200, 500, 500));

    }
    
}
