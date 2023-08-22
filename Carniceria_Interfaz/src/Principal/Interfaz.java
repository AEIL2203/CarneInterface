package Principal;

public interface Interfaz {
	public static void main(String[] args) {
		  Producto carneRes = new Producto("Carne de Res", 10.5, 15);
	        Producto pollo = new Producto("Pollo", 7.2, 30);
	        Producto chorizo = new Producto("Chorizo", 5.0, 25);

	        Factura factura = new Factura();
	        factura.agregarProducto(carneRes);
	        factura.agregarProducto(pollo);
	        factura.agregarProducto(chorizo);

	        factura.imprimirFactura();
	}
}
