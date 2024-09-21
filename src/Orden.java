import java.util.List;

public class Orden {

    //Atributos
    private int idOrden;
    private List<Producto> productos;

    //Constructor
    public Orden(int idOrden, List<Producto> productos) {
        this.idOrden = idOrden;
        this.productos = productos;
    }

    //Metodo para agregar productos al array list
    public void agregarProducto(Producto producto, int cantidad) {
        producto.setCantPedido(cantidad);
        productos.add(producto);
    }

    //Metodo para mostrar la orden
    public void mostrarOrden() {
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Orden: " + idOrden);
        System.out.println("--------------------------------------");
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + ", Cantidad: " + producto.getCantPedido());
        }
        System.out.println("--------------------------------------");
    }

    //Metodo para calcular el total de la orden
    public int calcularTotal() {
        int total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantPedido();
        }
        return total;
    }

}
