
package tarea.pkg5;


public class calculadoraImpuestos {
   private double impuestos;
    
    String calcularImpuesto(int ingresos, double porcentajeImpuestos, double dividendos, double excencion){
        if (ingresos != 0 && porcentajeImpuestos == 0 && dividendos == 0 && excencion == 0) {
            return String.format("tus ingresos son: "+ (ingresos + (ingresos*0.15)));
        }else if (ingresos != 0 && porcentajeImpuestos != 0 && dividendos == 0 && excencion ==0 ) {
            return String.format("las ventas son: "+ ingresos * (porcentajeImpuestos/100));
        }else if (ingresos == 0 && porcentajeImpuestos != 0 && dividendos != 0 && excencion != 0 ) {
            impuestos = dividendos * (porcentajeImpuestos / 100);
            if (impuestos > excencion) {
                System.out.println("los impuestos son mayores que la excension ");
                return String.format("esos son los impuestos: "+impuestos);
            }else {
                return String.format("0");
            }
        }
     return String.format("");   
    }
    
    
}
