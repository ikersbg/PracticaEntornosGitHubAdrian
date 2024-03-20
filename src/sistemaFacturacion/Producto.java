package sistemaFacturacion;

/**
 * @author  AdrianDueñasGomez
 * @version 0.1
 * La clase producto la vamos a utilizar para saber los datos que contiene Productos
 * */


public class Producto {
    private String nombre;
    private  int precio;
    private  int cantidad;

    /**
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
 * @since 0.1
 * @return nombre devolvera el nombre del producto*/
    public String getNombre() {
        return nombre;
    }
    /**
     * @since 0.1
     * @return precio devolvera el precio del producto*/
    public int getPrecio() {
        return precio;
    }
    /**
     * @since 0.1
     * @return cantidad devolvera la cantidad que tienes del producto*/
    public int getCantidad() {
        return cantidad;
    }
/**
 * @since 0.1
 * @return  este metodo nos devolvera el toString de producto
 * */
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
