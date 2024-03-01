package tarea.pkg6;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Tarea6 {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int newStock;
        boolean bu;

        productos productos1 = new productos("pan", 5, 20);
        
        productos1.prodcuto();
        productos1.aumentarStock(4);
        productos1.prodcuto();
        productos1.reducirStock(5);
        productos1.prodcuto();

        //aqui cambio el valor al contar el nuevo Stock
        do {
            System.out.println("ingresa el stock: ");
            newStock = sc.nextInt();
            bu=productos1.setStock(newStock);
            productos1.setStock(newStock);
        } while (bu!= true);
        
        //imprime el nuevo Stock
        productos1.prodcuto();
        //aqui estoy reduciendo el Stock
        productos1.reducirStock(30);
                productos1.prodcuto();

    }

}
