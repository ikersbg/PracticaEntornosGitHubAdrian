package sistemaFacturacion;

import java.util.Scanner;
/**
 * Esta es la clase main , donde vamos a ejecutar el programa mostrandole al usuario un menu donde pueda elegir entre 5 opciones
 * @author AdrianDueñasGomez
 * @version 1.1
 * */
public class ProgramaFacturacion {
   /**
    * El metodo main mostrará un menu al usuario , si elije una opción que no este en esas opciones se le enviara un error para que vuelva a elegir
    * @since 0.1
    * */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        boolean acabado = false;
        System.out.println("***Bienvenido a su tienda de confianza***");
        Facturacion facturacionF = new Facturacion();
        do {
            System.out.println("Elija la opción deseada");
            System.out.println("1- Mostrar todos sus productos");
            System.out.println("2- Calcular precio de todo");
            System.out.println("3- Eliminar algun producto");
            System.out.println("4- Agregar producto a la cesta");
            System.out.println("5- Salir");

            int opcionUsuario = teclado.nextInt();



            while (opcionUsuario > 5 || opcionUsuario < 1 ){
                System.out.println("No puedes elejir esa opción , por favor intentelo de nuevo");
                opcionUsuario = teclado.nextInt();

            }










                switch (opcionUsuario) {

                    case 1:
                        facturacionF.imprimirLista();
                        break;

                    case 2:
                        facturacionF.imprimirFactura();
                        break;

                    case 3:
                        System.out.println("Vamos a eliminar un producto dime su numero de lista");
                        facturacionF.imprimirLista();
                        int numeroLista = teclado.nextInt();

                        facturacionF.eliminarProducto(numeroLista);

                        break;

                    case 4:
                        System.out.println("¿Cual es el nombre del producto?");
                        String nombreProducto = teclado.next();

                        System.out.println("Ahora dime cuanto vale una unidad de ese producto");
                        int precioUnidad = teclado.nextInt();

                        System.out.println("Y por último cuantas unidades se ha llevado de ese producto");
                        int cantidadP = teclado.nextInt();

                        Producto productoUsuario = new Producto(nombreProducto,precioUnidad,cantidadP);
                        facturacionF.anyadirProductoLista(productoUsuario);

                        break;
                    default:
                        acabado = true;


            }





        } while (acabado == false);


        System.out.println("Gracias por usar mi programa");

    }
}
