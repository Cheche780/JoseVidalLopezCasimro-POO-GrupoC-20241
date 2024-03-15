
package libreriaProyecto;

public class libreria {
    private String name;
   
    private double precioRenta;
    private boolean ocupados;
    
    public libreria(String name, String autor, double precioRenta){
        
        this.name = name;
        this.precioRenta = precioRenta;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPrecioRenta() {
        return precioRenta;
    }

    public void setPrecioRenta(double precioRenta) {
        this.precioRenta = precioRenta;
    }

    
    
    
    
    
    
}
