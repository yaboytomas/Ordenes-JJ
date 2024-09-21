
public class Producto {

    //Atributos
    private String nombre;
    private int precio;
    private int cantDisponible;
    private int cantPedido;

    //Constructor
    public Producto(String nombre, int precio, int cantDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantDisponible = cantDisponible;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    public int getCantPedido() {
        return cantPedido;
    }

    public void setCantPedido(int cantPedido) {
        this.cantPedido = cantPedido;
    }

    //ToString
    @Override
    public String toString() {
        return "Producto: " + '\n' +
                "-----------------" + '\n' +
                "Nombre = " + nombre + '\n' +
                "Precio = $" + precio + '\n' +
                "Cantidad disponible = " + cantDisponible +
                '\n';
    }
}
