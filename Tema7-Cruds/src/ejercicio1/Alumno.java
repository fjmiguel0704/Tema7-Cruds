package ejercicio1;

public class Alumno {
	/**
	 * Guardará el nombre del alumno
	 */

	private String nombre="";
	/**
	 * Guardará la nota media del alumno
	 */
	private double notaMedia;

	/**
	 * Constructor por defecto
	 */
	public Alumno() {

	}

	/**
	 * Constructor que asigna valores a nombre y notaMedia del alumno
	 * 
	 * @param nombre    del alumno
	 * @param notaMedia del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		this.nombre = nombre;
		this.notaMedia = notaMedia;
	}

	/**
	 * Devuelve el nombre del alumno
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre del alumno
	 * 
	 * @param nombre del alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la nota media del alumno
	 * 
	 * @return notaMedia
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Modifica la nota media del alumno
	 * 
	 * @param notaMedia 
	 */
	public void setNotaMedia(double notaMedia) {
		if (notaMedia > 0) {
			this.notaMedia = notaMedia;
		}
	}

	/**
	 * Muestra el nombre y nota media del alumno
	 */
	@Override
	public String toString() {
		return "Alumno: " + nombre + "\nNota media: " + notaMedia;
	}
}
