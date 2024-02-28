
package tarea.pkg5;

public class Empleado {
    private String name;
    private double salary;

    //solo sueldo base.
   String calcularSalario( double sueldo){
       salary = sueldo;
       return String.format("tu sueldo base es "+ salary);
   }
   //sueldo y bonificacion 
   String calcularSalario( double sueldo, double bonificacion){
       salary = sueldo + bonificacion;
       return String.format("tienes una bonificacion de " +bonificacion+ " por ser muy cumplido"
               +" junto a tu sueldo tienes en sueldo "+ salary);
   }
// sueldo, bonificacion y horas extras.
    String calcularSalario(double sueldo, double bonificacion, int horasExtras){
        int horaExtra = horasExtras * 20;
        salary = sueldo + bonificacion + horaExtra;
       return String.format("haz trabajado " +horasExtras+ " horas despues de tu turno. Más tu bonificacion y sueldo obtienes "+salary);
       
   }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
   
}
