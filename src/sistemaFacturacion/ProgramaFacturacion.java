package sistemaFacturacion;

import java.util.Scanner;
/**
 * @author AdrianDueñasGomez
 * @version 0.1
 * Esta clase la voy a utilizar para
 * */
public class ProgramaFacturacion {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("***Bienvenido a su tienda de confianza***");

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
        boolean acabado = false;
        while (acabado != true){
            Facturacion facturacionF = new Facturacion();

            if (opcionUsuario == 1) {
                facturacionF.imprimirLista();
                
            } else if (opcionUsuario == 2) {

            } else if (opcionUsuario == 3) {
                
            } else if (opcionUsuario == 4) {
                
            } else if ( opcionUsuario == 5) {
                acabado = true;

            }




        }

        System.out.println("Gracias por usar mi programa");

    }
}
