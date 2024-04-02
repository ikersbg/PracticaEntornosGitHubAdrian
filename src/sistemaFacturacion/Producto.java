package sistemaFacturacion;

/**
 * La clase producto la vamos a utilizar para saber los datos que contiene Productos
 * @author  AdrianDueñasGomez
 * @version 1.1
 * */


public class Producto {
    private String nombre;
    private  int precio;
    private  int cantidad;

    /**
     * Constructor de la clase producto
     * @param nombreP representa el nombre del producto
     * @param precioP valor de cada producto
     * @param cantidadP valor de cuantos productos tienes
     * @since 0.1
     * */
    public Producto(String nombreP , int precioP , int cantidadP){

        this.nombre = nombreP;
        this.cantidad = cantidadP;
        this.precio = precioP;

    }
/**
 * Metodo get que nos permite mostrar el nombre del producto
 * @since 0.1
 * @return nombre devolvera el nombre del producto*/
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo get que nos permite saber el precio del producto del usurio
     * @since 0.1
     * @return precio devolvera el precio del producto*/
    public int getPrecio() {
        return precio;
    }
    /**
     * Metodo get que nos permite mostrar la cantidad de productos que ha comprado
     * @since 0.1
     * @return cantidad devolvera la cantidad que tienes del producto*/
    public int getCantidad() {
        return cantidad;
    }
/**
 * Metodo que nos permite mostrar de forma ordenada los parametros del contructor de la clase producto
 * @since 0.1
 * @return  este metodo nos desvolvera el nombre , precio y cantidad de cada producto
 * */
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
/**
 * Método que servía para introducir el nombre del producto
 * @deprecated
 * @since 1.1
 * */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
