package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Creamos el Scanner
		Scanner read = new Scanner(System.in);

		// Guardará la opcion del usuario
		int opc = 0;

		// Guardará el nombre del alumno
		String nombre = " ";

		// Guardará la nota media del alumno
		double notaMedia = 0;

		// Creamos el array de objetos tipo Alumno
		Alumno[] alumnos = new Alumno[30];

		// Recorremos el array y lo inicializamos a los valores de alumno, inicialmente
		// nombre null y nota media 0
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = new Alumno();
		}

		do {
			// Mostramos el menú de opciones al usuario
			System.out.println("ALUMNOS");
			System.out.println("------------------------");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Alumno");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");

			// Leemos la opcion introducida por el usuario
			opc = read.nextInt();

			switch (opc) {

			// En caso de 1, listará los alumnos
			case 1:

				// Recorremos el array
				for (int i = 0; i < alumnos.length; i++) {
					// Comprobamos que el nombre del alumno sea distinto a null para imprimir el
					// alumno
					if (!alumnos[i].getNombre().isEmpty()) {
						System.out.println(alumnos[i].toString());
					}
				}
				break;

			// En caso de 2, introduciremos un nuevo alumno
			case 2:
				int pos = 0;
				// Pedimos el nombre del nuevo alumno
				System.out.println("Introduce el nombre del alumno");
				nombre = read.next();

				// Pedimos la nota media del alumno
				System.out.println("Introduce la nota media del alumno");
				notaMedia = read.nextDouble();

				// Mientras la nota media sea menor a cero, volvemos a pedirle la nota
				while (notaMedia < 0) {
					System.out.println("Introduce de nuevo la nota media del alumno");
					notaMedia = read.nextDouble();
				}

				// Recorremos el array
				for (int i = 0; i < alumnos.length; i++) {
					// Y comprobamos en que posición del array no se encuentra un alumno
					if (alumnos[i].getNombre().equals("")) {
						pos=i;
					}
				}
				
				// Introducimos el nombre y nota media del alumno
				alumnos[pos].setNombre(nombre);
				alumnos[pos].setNotaMedia(notaMedia);
				break;

			// En caso de 3, modificamos a un alumno
			case 3:
				// Pedimos el nombre del alumno a modificar
				System.out.println("Introduce el nombre del alumno a modificar");
				nombre = read.next();

				// Recorremos el array
				for (int i = 0; i < alumnos.length; i++) {
					// Comprobamos en que posición del array se encuentra ese nombre
					if (alumnos[i].getNombre().equals(nombre)) {
						// Y le pedimos la nueva nota del alumno
						System.out.println("Introduce la nueva nota del alumno:");
						notaMedia = read.nextDouble();
						// Mientras que la nota sea menor a 0, se la volvemos a pedir
						while (notaMedia < 0) {
							System.out.println("Introduce de nuevo la nota media del alumno");
							notaMedia = read.nextDouble();
						}
					}
					
					alumnos[i].setNotaMedia(notaMedia);
				}
				break;

			// En caso de 4, eliminaremos un alumno
			case 4:
				// Pedimos el nombre del alumno a eliminar
				System.out.println("Introduce el nombre del alumno a eliminar:");
				nombre = read.next();

				// Recorremos array
				for (int i = 0; i < alumnos.length; i++) {
					// Y comprobamos en que posición se encuentra el alumno con ese nombre
					if (alumnos[i].getNombre().equals(nombre)) {
						// Actualizamos el nombre del alumno a vacío
						alumnos[i].setNombre("");
					}
				}
				break;
			// En caso de que la opción introducida sea otra, mostrará un mensaje de no
			// válida
			default:
				System.out.println("Opción incorrecta");
			}

		} while (opc != 5); // Mientras que la opcion sea distinta de 5

		// Mostramos un mensaje de que se cerró el programa
		System.out.println("Cerrando programa...");

		// Cerramos el Scanner
		read.close();

	}

}
