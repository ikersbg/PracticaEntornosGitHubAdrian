package sistemaFacturacion;

import java.util.ArrayList;

public class Facturacion {


    public static void main(String[] args) {

        ArrayList<Producto> listaProducto = new ArrayList<>();

        Producto producto1 = new Producto("Manzana", 2,40);
        Producto producto2 = new Producto("Filetes", 10,30);
        Producto producto3 = new Producto("Tomate", 4,80);
        Producto producto4 = new Producto("Chup&&Chups", 5,100);
        Producto producto5 = new Producto("Pollo", 18,20);

        listaProducto.add(producto1);
        listaProducto.add(producto2);
        listaProducto.add(producto3);
        listaProducto.add(producto4);
        listaProducto.add(producto5);

        System.out.println("***Bienvenido a su tienda de confianza***");



    }



}
