
package libreriaProyecto;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class clientes {
    private String name;
private List<libreria> librosRentados;
    public clientes(String name, int age) {
        this.name = name;
        this.librosRentados = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<libreria> getLibrosRentados() {
        return librosRentados;
    }

    public void librosRentados(libreria libro) {
        librosRentados.add(libro);
    }

}
