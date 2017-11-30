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
	 * Añade Paradas intermedias a la l�nea.
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

	/**
	 * Añade una parada como final del recorrido
	 * 
	 * @param parada
	 *            parada que se añade. Debe ser correcta: no nula estar a menos
	 *            de 100 metros de la parada inicial.
	 */
	public void addParadaFinal(Parada parada) {
		// TODO Auto-generated method stub
	}

	/**
	 * A�ade una parada como inicio del recorrido.
	 * 
	 * @param parada
	 *            parada que se añade. Debe ser correcta: no nula estar a menos
	 *            de 100 metros de la parada final.
	 */
	public void addParadaInicial(Parada parada) {

		// TODO Auto-generated method stub

	}

	/**
	 * Elimina una parada de la linea, si la parada proporcionada no está, no
	 * hará nada
	 * 
	 * @param parada
	 *            parada que se elimina. Debe ser correcta: no nula, no debe ser
	 *            la parada inicial ni la final.
	 * @throws IllegalArgumentException
	 *             si se incumplen las condiciones impuestas
	 */
	public void removeParada(Parada parada) {
		// TODO Auto-generated method stub

	}

	/**
	 * Comprueba si la Linea tiene una Parada cerca de la direccion pasada.
	 * 
	 * @param direccion2
	 *            DireccionGPS a comprobar.Debe ser correcto: No ser null.
	 * @return true si tiene una Parada a menos de 200m de la Direccion pasada,
	 *         false en caso contrario.
	 * @throws IllegalArgumentException
	 *             si se incumplen las condiciones impuestas al parámetro.
	 */
	public boolean hasParadaCerca(DireccionGPS direccion2) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Comprueba si la Linea pasada como argumento tiene correspondencia con
	 * this.
	 * 
	 * @param linea
	 *            Linea a comparar con this. Tendrá correspondencia si tiene una
	 *            Parada a menos de 200 metros de una Parada de this. Tiene que
	 *            ser correcta: No nula.
	 * @return true si linea tiene correspondencia con this, false en caso
	 *         contrario.
	 * @throws IllegalArgumentException
	 *             si se incumplen las condiciones impuestas al parámetro.
	 */
	public boolean hasCorrespondencia(Linea linea) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Da información sobre las Paradas que tienen correspondencia de linea y
	 * this.
	 * 
	 * @param linea
	 *            Linea a comparar con this. Debe ser correcta: No debe ser null
	 *            y debe tener correspondencia con this.
	 * @return Vector con las Paradas que tienen correspondencia con Paradas de
	 *         this.
	 * @throws IllegalArgumentException
	 *             si se incumplen las condiciones impuestas al parámetro.
	 */
	public Parada[] getParadasConCorrespondencia(Linea linea) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Comprueba si la Linea pasada como parámetro tiene trasbordo directa con
	 * this.
	 * 
	 * @param linea
	 *            Linea a comparar con this. Debe ser correcta: No nula.
	 * @return true si la Linea tiene trasbordo directo con this, false en caso
	 *         contrario.
	 * @throws IllegalArgumentException
	 *             si se incumplen las condiciones impuestas al parámetro.
	 */
	public boolean hasTrasbordoDirecto(Linea linea) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Obtiene un vector de Paradas con trasbordo directo entre Linea y this, si
	 * linea tiene trasbordo directo con this.
	 * 
	 * @param linea
	 *            Linea a comparar con this, para obtener las Paradas con
	 *            trasbordo directo. Debe ser correcta: No nula y tiene que
	 *            tener Paradas con trasbordo directo.
	 * @return Vector con las Paradas de trasbordo directo entre Linea y this.
	 * @throws IllegalArgumentException
	 *             si se incumplen las condiciones impuestas al parámetro.
	 */
	public Parada[] getParadasConTrasbordoDirecto(Linea linea) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Comprobará la distancia entre 2 Paradas de la Linea.
	 * 
	 * @param parada1
	 *            Primera Parada a comprobar. Debe ser correcta: No nula.
	 * @param parada2
	 *            Segunda Parada a comprobar.Debe ser correcta: No nula.
	 * @return La distancia entre las 2 paradas pasadas como parámetro si están
	 *         en la Ĺinea, 0 en caso contrario.
	 * @throws IllegalArgumentException
	 *             si se incumplen las condiciones impuestas a los parámetros.
	 */
	public int checkDistancia(Parada parada1, Parada parada2) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 
	 * @return Identificador de this.
	 */
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 
	 * @return Vector de Paradas de this.
	 */
	public Parada[] getParadas() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Comprobará si la Linea tiene alguna Parada null, para informar al
	 * usuario.
	 * 
	 * @return true si tiene alguna Parada null, false en caso contrario.
	 */
	public boolean hasParadaNull() {
		// TODO Auto-generated method stub
		return false;
	}

}
