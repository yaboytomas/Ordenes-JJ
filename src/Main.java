import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Instancias
        Producto producto1 = new Producto("Polera", 14990, 7);
        Producto producto2 = new Producto("Shorts", 24990, 4);
        Producto producto3 = new Producto("Zapatillass", 95000, 11);
        Producto producto4 = new Producto("Boxers", 12000, 12);
        Producto producto5 = new Producto("Calcetines", 9000, 9);

        Orden orden1 = new Orden(00001, new ArrayList<>());
        Orden orden2 = new Orden(00002, new ArrayList<>());

        //Agregar productos a orden
        orden1.agregarProducto(producto1, 5);
        orden1.agregarProducto(producto2, 3);
        orden1.agregarProducto(producto3, 1);
        orden1.agregarProducto(producto4, 7);
        orden1.agregarProducto(producto5, 7);

        orden2.agregarProducto(producto1, 7);
        orden2.agregarProducto(producto2, 5);
        orden2.agregarProducto(producto5, 5);

        //Mostrar ordenes y totales
        orden1.mostrarOrden();
        System.out.println("Total de la orden 1: $" + orden1.calcularTotal());
        orden2.mostrarOrden();
        System.out.println("Total de la orden 2: $" + orden2.calcularTotal());
        System.out.println();

        //Mostrar descripcion de productos
        System.out.println("Descripcion de productos:");
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println(producto4);
        System.out.println(producto5);










    }
}