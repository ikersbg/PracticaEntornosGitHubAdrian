package sistemaFacturacion;

import java.util.ArrayList;

/**
 *  Esta clase sirve para guardar la lista de los productos que se vayan añadiendo y realizar las operaciones correspondientes
 * @author AdrianDueñasGomez
 * @version  1.1
 * */
public class Facturacion {
   private ArrayList<Producto> listaProducto ;


/**
 * Constructor de la clase facturacion el que se almacena un arratList listaProducto
 * @since  0.1
 * */
    public Facturacion (){
    listaProducto = new ArrayList<>();

    }

/**
 * Método para añadir los productos al arrayList "listaProducto"
 * @see Producto
 * @param  nuevoProducto valor del objeto producto del usuario que deseamos añadir
 * @since 0.1
 * */
        public void anyadirProductoLista(Producto nuevoProducto){

            listaProducto.add(nuevoProducto);
            System.out.println("¡Producto añadido correctamente!");

        }
/**
 * Este metodo es para mostrar el resultado de la compra
 * utiliza un for mejorado para recorrer toda la lista
 * @since 0.2
 * @see Producto
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
 * @see Producto
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
 * @see Producto
 * */
        public  int calcularPrecioPorProducto(){

             int precioFinaL = 0;
             for (Producto productoF : listaProducto){

                 precioFinaL = precioFinaL + (productoF.getPrecio() * productoF.getCantidad());

             }
             return precioFinaL;
        }
    /**
     * Este metodo nos permite eliminar un producto del arrayList listaProducto
     * @param posicion valor que indica la posicion del producto que desea eliminar el usuario
     * @since 1.1
     * @see Producto
     * */
        public  void eliminarProducto(int posicion){

            listaProducto.remove(posicion);
            System.out.println("Producto eliminado correctamente");
        }

}
