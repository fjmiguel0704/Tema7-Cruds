package ejercicio2;

public class Almacen {
	private int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;

	public Almacen() {

	}

	public Almacen(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		if (codigo > 0) {
			this.codigo = codigo;
		}

		if (!descripcion.isEmpty()) {
			this.descripcion = descripcion;
		}

		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}

		if (precioVenta > 0) {
			this.precioVenta = precioVenta;
		}

		if (stock >= 0) {
			this.stock = stock;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		if (!descripcion.isEmpty()) {
			this.descripcion = descripcion;
		}
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		if (precioCompra > 0) {
			this.precioCompra = precioCompra;
		}
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		if (precioVenta > 0) {
			this.precioVenta = precioVenta;
		}
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock >= 0) {
			this.stock = stock;
		}
	}

	@Override
	public String toString() {
		String result;
		result = "Código: " + codigo + "\n" + "Descripcion: " + descripcion + "\n" + "Precio Compra: " + precioCompra
				+ "\n" + "Precio Venta: " + precioVenta + "\n" + "Stock: " + stock;

		return result;
	}

}
