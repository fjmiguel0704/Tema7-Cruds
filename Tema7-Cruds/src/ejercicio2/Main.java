package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opc;
		int codigo;
		String descripcion;
		double precioCompra;
		double precioVenta;
		int stock;

		Almacen articulos[] = new Almacen[0];

		Scanner read = new Scanner(System.in);

		do {
			System.out.println("MENÚ");
			System.out.println("=========================");
			System.out.println("1. LISTADO");
			System.out.println("2. ALTA");
			System.out.println("3. BAJA");
			System.out.println("4. MODIFICACIÓN");
			System.out.println("5. ENTRADA MERCANCIA");
			System.out.println("6. SALIDA MERCANCIA");
			System.out.println("7. SALIR");

			System.out.println();

			System.out.println("Elige una opción:");

			opc = read.nextInt();
			switch (opc) {
			case 1:
				for (int i = 0; i < articulos.length; i++) {
					System.out.println(articulos[i].toString());
					System.out.println();
				}

				break;
			case 2:
				System.out.println("Código del artículo: ");
				codigo = read.nextInt();
				System.out.println("Descripción del artículo: ");
				descripcion = read.next();
				System.out.println("Precio de compra: ");
				precioCompra = read.nextDouble();
				System.out.println("Precio de venta: ");
				precioVenta = read.nextDouble();
				System.out.println("Stock del artículo: ");
				stock = read.nextInt();

				articulos = Arrays.copyOf(articulos, articulos.length + 1);
				articulos[articulos.length - 1] = new Almacen();

				for (int i = 0; i < articulos.length; i++) {
					if (articulos[i].getCodigo() == 0) {
						articulos[i].setCodigo(codigo);
						articulos[i].setDescripcion(descripcion);
						articulos[i].setPrecioCompra(precioCompra);
						articulos[i].setPrecioVenta(precioVenta);
						articulos[i].setStock(stock);
					}
				}
				break;
			case 3:
				System.out.println("Código del artículo de baja: ");
				codigo = read.nextInt();

				for (int i = 0; i < articulos.length; i++) {
					if (articulos[i].getCodigo() == codigo) {
						System.arraycopy(articulos, i + 1, articulos, i, articulos.length - i - 1);
						articulos = Arrays.copyOf(articulos, articulos.length - 1);
					}
				}
				break;

			case 4:
				System.out.println("Código del artículo a modificar: ");
				codigo = read.nextInt();

				for (int i = 0; i < articulos.length; i++) {
					if (articulos[i].getCodigo() == codigo) {
						System.out.println("Nuevo código: ");
						codigo = read.nextInt();
						articulos[i].setCodigo(codigo);
						System.out.println("Nueva descripción: ");
						descripcion = read.next();
						articulos[i].setDescripcion(descripcion);
						System.out.println("Nuevo precio de compra: ");
						precioCompra = read.nextDouble();
						articulos[i].setPrecioCompra(precioCompra);
						System.out.println("Nuevo precio de venta: ");
						precioVenta = read.nextDouble();
						articulos[i].setPrecioVenta(precioVenta);
					}

				}
				break;

			case 5:
				int cantIncr;
				int stockActual;
				System.out.println("Código del artículo al que se le desea aumentar su stock: ");
				codigo = read.nextInt();

				for (int i = 0; i < articulos.length; i++) {
					if (articulos[i].getCodigo() == codigo) {
						stockActual = articulos[i].getStock();
						System.out.println("Cuántos arículos quiere añadir al stock: ");
						cantIncr = read.nextInt();
						articulos[i].setStock(stockActual += cantIncr);
					}

				}
				break;

			case 6:
				int cantDecr;

				System.out.println("Código del artículo al que se le desea decrementar su stock: ");
				codigo = read.nextInt();

				for (int i = 0; i < articulos.length; i++) {
					if (articulos[i].getCodigo() == codigo) {
						stockActual = articulos[i].getStock();
						System.out.println("Cuántos arículos quiere quitar del stock: ");
						cantDecr = read.nextInt();
						articulos[i].setStock(stockActual -= cantDecr);
					}
				}
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		} while (opc != 7);

	}

}
