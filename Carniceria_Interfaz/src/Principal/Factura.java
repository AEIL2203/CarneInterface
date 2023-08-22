package Principal;

import java.util.ArrayList;
import java.util.List;

public class Factura {
	private List<Producto> productos;

    public Factura() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void imprimirFactura() {
        System.out.println("----- Factura -----");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + "\t" + producto.getPrecio());
        }
        System.out.println("-------------------");
        System.out.println("Total: " + calcularTotal());
    }
}










