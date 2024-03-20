package sistemaFacturacion;

public class Producto {
    private String nombre;
    private  int precio;
    private  int cantidad;


    public Producto(String nombreP , int precioP , int cantidadP){

        this.nombre = nombreP;
        this.cantidad = cantidadP;
        this.precio = precioP;

    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
