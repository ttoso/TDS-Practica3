package uva.tds.pr2.equipo10;

/**
 * Implementación sencilla de una red de buses.
 * 
 * @author ivagonz
 * @author antroma
 */
public class Red {

	/**
	 * Inicia una red de autobuses con un vector de Lineas que la componen.
	 * 
	 * @param lineas
	 *            Vector de lineas de la Red. Debe ser correcto: No nulo, no
	 *            debe contener elementos nulos y debe contener al menos 2
	 *            lineas.
	 * @throws IllegalArgumentException
	 *             si no se cumplen las conciones impuestas al parámetro.
	 */
	public Red(Linea[] lineas) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return vector de Lineas de la Red.
	 */
	public Linea[] getLineas() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Comprueba si la Red tiene alguna Linea nula.
	 * 
	 * @return true si tiene al menos una Linea nula, false en caso contrario.
	 */
	public boolean hasLineaNull() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Agrega una Linea dentro de la Red de buses.
	 * 
	 * @param linea
	 *            Linea a agregar en la Red. Debe ser correcta: No nula, no debe
	 *            estar ya en la Red.
	 * @throws IllegalArgumentException
	 *             en caso de incumplir las condiciones impuestas al parámetro.
	 */
	public void addLinea(Linea linea) {
		// TODO Auto-generated method stub

	}

	/**
	 * Obtiene una Linea de la Red mediante la posición indicada como parámetro.
	 * 
	 * @param posicion
	 *            Entero que indica la posición de la Linea a obtener dentro de
	 *            la Red.Debe ser correcto: Positiva.
	 * @return La Linea en la posición dada de existir Linea en la posición,
	 *         null en caso contrario.
	 * @throws IllegalArgumentException
	 *             en caso de incumplir las condiciones impuestas al parámetro.
	 */
	public Linea getLinea(int posicion) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Elimina una Linea de la Red de autobuses.
	 * 
	 * @param linea
	 *            Linea a borrar.Debe ser correcta: No nula y debe estar dentro
	 *            de la Red.
	 * @throws IllegalArgumentException
	 *             en caso de incumplir las condiciones impuestas al parámetro.
	 */
	public void removeLinea(Linea linea) {
		// TODO Auto-generated method stub

	}

	/**
	 * Obtiene un vector de Lineas que tienen Parada cerca de una Direccion y un
	 * radio dados.
	 * 
	 * @param direccion
	 *            DireccionGPS en la que debe haber Paradas cerca.Debe ser
	 *            correcta: No nula.
	 * @param radio
	 *            Radio para buscar Paradas dentro de la Red.Debe ser correcto:
	 *            Positivo.
	 * @return Vector con las Lineas que tienen Parada cerca de la Direccion.
	 * @throws IllegalArgumentException
	 *             en caso de incumplir alguna de las condiciones impuestas a
	 *             los parámetros.
	 */
	public Linea[] infoParadas(DireccionGPS direccion, int radio) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Obtiene la distancia en metros entre dos Paradas de la Red.
	 * 
	 * @param parada1
	 *            Primera Parada a comprobar. Debe ser correcta: No nula.
	 * @param parada2
	 *            Segunda Parada a comprobar. Debe ser correcta: No nula.
	 * @return La distancia en metros entre las 2 Paradas.
	 * @throws IllegalArgumentException
	 *             si se incumple alguna de las condiciones impuestas a los
	 *             parámetros.
	 */
	public int getDistanciaParadas(Parada parada1, Parada parada2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
