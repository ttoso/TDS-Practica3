package uva.tds.pr2.equipo10;

/**
 * Implementacion basica de una linea de buses
 * 
 * @author antroma
 * @author ivagonz
 *
 */
public class Linea {

	/**
	 * Constructor de la clase linea
	 * 
	 * @param identificador
	 *            Identificadeor de la linea. Debe ser correcto: identificador
	 *            positivo
	 * @param paradas
	 *            Array que contiene las paradas de la linea y cuya primera y
	 *            ultima posicion seran la primera y ultima parada de la linea
	 *            respectivamente. Debe ser correcto: No debe ser nulo No debe
	 *            contener elementos nulos Debe tener 3 elmentos o mas La
	 *            distancia entre el primer y ultimo elemento del array debe ser
	 *            menor a 100.
	 * @throws IllegalArgumentException
	 *             en caso de incumplir las condiciones impuestas a los
	 *             parámetros.
	 */
	public Linea(int identificador, Parada[] paradas) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Función para añadir Paradas intermedias a la línea.
	 * 
	 * @param parada
	 *            Parada a añadir. Debe ser correcta: No nula.
	 * @param posicion
	 *            Posicion en la que añadir la Parada.Debe ser correcta: No
	 *            puede ser el inicio ni el final de la Linea.
	 * @throws IllegalArgumentException
	 *             en caso de incumplir las condiciones impuestas a los
	 *             parámetros.
	 */
	public void addParadaIntermedia(Parada parada, int posicion) {
		// TODO Auto-generated method stub

	}

}
