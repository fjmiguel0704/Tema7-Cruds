package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

import ejercicio3.Pizza.Estado;
import ejercicio3.Pizza.Sabor;
import ejercicio3.Pizza.Tamaño;

public class Main {

	public static void main(String[] args) {
		int opc;
		int codigo;
		String tamaño;
		String tipo;

		Pizza pizzas[] = new Pizza[0];

		Scanner read = new Scanner(System.in);

		do {
			System.out.println("MENÚ");
			System.out.println("=========================");
			System.out.println("1. LISTADO DE PIZZAS");
			System.out.println("2. NUEVO PEDIDO");
			System.out.println("3. PIZZA SERVIDA");
			System.out.println("4. SALIR");

			System.out.println("Seleccione una opción: ");
			opc = read.nextInt();

			switch (opc) {
			case 1:
				for (int i = 0; i < pizzas.length; i++) {
					System.out.println(pizzas[i].toString());
					System.out.println();
				}
				break;
			case 2:
				pizzas = Arrays.copyOf(pizzas, pizzas.length + 1);
				pizzas[pizzas.length - 1] = new Pizza();

				System.out.println("Código de la pizza pedida: ");
				codigo = read.nextInt();
				System.out.println("Tamaño de la pizza: ");
				tamaño = read.next();
				System.out.println("Tipo de pizza: ");
				tipo = read.next();

				for (int i = 0; i < pizzas.length; i++) {
					if (pizzas[i].getCodigo() == 0) {
						pizzas[i].setCodigo(codigo);
						pizzas[i].setTamaño(Tamaño.valueOf(tamaño));
						pizzas[i].setTipo(Sabor.valueOf(tipo));
					}
				}
				break;
			case 3:
				System.out.println("Código de pizza servida: ");
				codigo = read.nextInt();
				for (int i = 0; i < pizzas.length; i++) {
					if (pizzas[i].getCodigo() == codigo) {
						pizzas[i].setEstado(Estado.Servida);
					}
				}
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("La opción no es correcta");
			}
		} while (opc != 4);

	}

}
