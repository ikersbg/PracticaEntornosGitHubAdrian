package sistemaFacturacion;

import java.util.ArrayList;

/**
 * @author AdrianDueñasGomez
 * @Version 0.1
 * Esta clase sirve para guardar la lista de los productos que se vayan añadiendo y realizar las operaciones correspondientes
 * */
public class Facturacion {

    ArrayList<Producto> listaProducto ;



    public Facturacion (){
    listaProducto = new ArrayList<>();

    }


        private void añadirProductoLista(Producto nuevoProducto){

            listaProducto.add(nuevoProducto);
            System.out.println("¡Producto añadido correctamente!");

        }

        private void imprimirLista(){


        }


}
