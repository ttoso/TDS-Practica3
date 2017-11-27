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
	 *             par�metros.
	 */
	public Linea(int identificador, Parada[] paradas) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Funci�n para a�adir Paradas intermedias a la l�nea.
	 * 
	 * @param parada
	 *            Parada a a�adir. Debe ser correcta: No nula.
	 * @param posicion
	 *            Posicion en la que a�adir la Parada.Debe ser correcta: No
	 *            puede ser el inicio ni el final de la Linea.
	 * @throws IllegalArgumentException
	 *             en caso de incumplir las condiciones impuestas a los
	 *             par�metros.
	 */
	public void addParadaIntermedia(Parada parada, int posicion) {
		// TODO Auto-generated method stub

	}

}
