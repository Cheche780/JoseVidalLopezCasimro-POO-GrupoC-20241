package tarea.pkg6;

import java.text.DecimalFormat;

public class productos {

    private String name;
    private float price;
    private int Stock;

    public void prodcuto() {
        DecimalFormat price1 = new DecimalFormat("#.00");

        System.out.printf("--------------------------------------\n");
        System.out.printf("|          tiendita maniaca          |\n");
        System.out.printf("--------------------------------------\n");
        System.out.printf("|%8s| %8s |%15s |\n", name, price1.format(price), Stock);
        System.out.printf("--------------------------------------\n");
        System.out.println("");
    }

    public productos(String name, float price, int Stock) {
        this.name = name;
        this.price = price;
        this.Stock = Stock;
    }

    public productos(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void aumentarStock(int cantidad) {
        Stock = Stock + cantidad;

    }

    public void reducirStock(int cantidad) {
        if (cantidad<= Stock) {
                    Stock = Stock - cantidad;
        }else{
            System.out.println("no tienes suficiente Stock ");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return Stock;
    }

    public boolean setStock(int Stock) {
        boolean bo = true;
        if (Stock > 0) {            
            this.Stock = Stock;
        } else {
            System.out.println("no podemos tener el Stock en 0");

            bo = false;
        }
        return bo;

    }

}
