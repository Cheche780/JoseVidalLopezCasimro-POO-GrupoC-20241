package libreriaProyecto;

import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList<libreria> libros = new ArrayList();
        ArrayList<clientes> cliente = new ArrayList();

        int con = 0;
        int aux;

        System.out.println("desea registrar cliente, seleccione 1");
        System.out.println("desea registrar lirbo, seleccione 2");
        System.out.println("desea rentar libro, seleccione 3");
        con = leer.nextInt();
        leer.nextLine();

        switch (con) {
            case 1:

                do {
                    leer.nextLine();

                    System.out.println("ingrese nombre del cliente: ");
                    String clienteNombre = leer.nextLine();
                    System.out.println("ingrese la edad del cliente: ");
                    int edadCliente = leer.nextInt();
                    clientes clienteNuevo = new clientes(clienteNombre, edadCliente);
                    cliente.add(clienteNuevo);

                    System.out.println("desea agregar otro cliente? 1-SI, 2-NO");
                    aux = leer.nextInt();
                } while (aux == 1);
                break;

            case 2:
                do {
                    leer.nextLine();
                    System.out.println("ingrese el nombre del libro");
                    String libroNombre = leer.nextLine();
                    System.out.println("ingrese el nombre del Autor");
                    String autorNombre = leer.nextLine();
                    System.out.println("ingrese el precio");
                    double precioLibro = leer.nextDouble();
                    libreria libroNuevo = new libreria(libroNombre, autorNombre, precioLibro);
                    libros.add(libroNuevo);

                    System.out.println("desea agregar otro libro? 1-SI, 2-NO");
                    aux = leer.nextInt();
                } while (aux == 1);

                break;
            case 3:
                System.out.println("seleccione un libro");
                for (int i = 0; i < libros.size(); i++) {
                    System.out.println((i + 1) + ". " + libros.get(i).getName());
                }
                int seleccionar = leer.nextInt() - 1;
                leer.nextLine();
                libreria seleccionarLibro = libros.get(seleccionar);
                System.out.println("usted ah seleccionados el libro: " + libros);
        }

    }

}
