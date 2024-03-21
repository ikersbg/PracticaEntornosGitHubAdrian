package sistemaFacturacion;

import java.util.ArrayList;

/**
 * @author AdrianDueñasGomez
 * @Version 0.1
 * Esta clase sirve para guardar la lista de los productos que se vayan añadiendo y realizar las operaciones correspondientes
 * */
public class Facturacion {
   private ArrayList<Producto> listaProducto ;



    public Facturacion (){
    listaProducto = new ArrayList<>();

    }


        public void anyadirProductoLista(Producto nuevoProducto){

            listaProducto.add(nuevoProducto);
            System.out.println("¡Producto añadido correctamente!");

        }
/**
 * Este metodo es para mostrar el resultado de la compra
 * utiliza un for mejorado para recorrer toda la lista
 * @see
 * @since 0.2
 * */
        public void imprimirLista(){

            System.out.println("***TOTAL FACTURA***");

            for (Producto productoF : listaProducto){


                System.out.println(productoF.toString());

            }

        }
/**
 * Este método sirve para imprimir la factura final del usuario
 * @since  0.2
 */
         public void imprimirFactura(){

        System.out.println("***TOTAL FACTURA***");

        for (Producto productoF : listaProducto){


            System.out.println(productoF.toString());

        }
             System.out.println("Precio Final: " + calcularPrecioPorProducto() + "€");
    }
/**
 * En este metodo  vamos a calcular el precio final de la factura
 * @return precioFinaL devolverá el valor de todos los productos
 * @since 1.0
 * */
        public  int calcularPrecioPorProducto(){

             int precioFinaL = 0;
             for (Producto productoF : listaProducto){

                 precioFinaL = precioFinaL + (productoF.getPrecio() * productoF.getCantidad());

             }
             return precioFinaL;
        }


}
