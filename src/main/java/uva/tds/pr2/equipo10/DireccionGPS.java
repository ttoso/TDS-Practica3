package uva.tds.pr2.equipo10;

/**
 * Implementación de una DirecciónGPS para la segunda práctica de la asignatura
 * TDS.
 *
 * @author ivagonz
 * @author antroma
 */
public class DireccionGPS {

	private double latitud;
	private double longitud;

	/**
	 * Constructor de una dirección GPS.
	 *
	 * @param latitud
	 *            Número que indica la latitud de la dirección. Debe ser
	 *            correcto: >=-180 && <=180.
	 * @param longitud
	 *            Número que indica la longitud de la dirección. Debe ser
	 *            correcto: >=-180 && <=180.
	 * @throws IllegalArgumentException
	 *             En caso de incumplir alguna de las condiciones impuestas a
	 *             los argumentos del constructor.
	 */
	public DireccionGPS(double latitud, double longitud) {
		if (latitud < -180)
			throw new IllegalArgumentException("La latitud debe ser mayor o igual a -180");
		if (latitud > 180)
			throw new IllegalArgumentException("La latitud debe ser menor o igual a 180");
		if (longitud < -180)
			throw new IllegalArgumentException("La longitud debe ser mayor o igual a -180");
		if (longitud > 180)
			throw new IllegalArgumentException("La longitud debe ser menor o igual a 180");
		this.latitud = latitud;
		this.longitud = longitud;
	}

	/**
	 * @return latitud de la DireccionGPS.
	 */
	public double getLatitud() {
		return latitud;
	}

	/**
	 *
	 * @return longitud de la DireccionGPS .
	 */
	public double getLongitud() {
		return longitud;
	}

}