package uva.tds.pr2.equipo10;

/**
 * Implementación de una Parada para la segunda práctica de la asignatura TDS.
 *
 * @author ivagonz
 * @author antroma
 */
public class Parada {

	private DireccionGPS direccionGPS;

	/**
	 * Constructor de la clase Parada.
	 *
	 * @param direccionGPS
	 *            Recibe un objeto DireccionGPS que indicara la posición de la
	 *            Parada dentro de una Linea de la Red. Debe ser correcto: no
	 *            nulo.
	 * @throws IllegalArgumentException
	 *             si se incumplen las condiciones impuestas al parámetro.
	 */
	public Parada(DireccionGPS direccionGPS) {
		if (direccionGPS == null)
			throw new IllegalArgumentException("La direccionGPS no puede ser nula");

		this.direccionGPS = direccionGPS;
	}

	/**
	 * Función que dada otra parada, obtendrá la distancia entre this y dicha
	 * Parada, expresada en metros.
	 *
	 * @param parada
	 *            Parada a comparar con this. Debe ser correcta: no nula.
	 * @throws IllegalArgumentException
	 *             si se incumplen las condiciones impuestas al parámetro.
	 */
	public int getDistancia(Parada parada) {
		if (parada == null)
			throw new IllegalArgumentException("La parada no puede ser nula");

		int radioTierra = 6371000;
		double diferenciaDeLatitudes = getDireccion().getLatitud() - parada.getDireccion().getLatitud();
		double diferenciaDeLongitudes = getDireccion().getLongitud() - parada.getDireccion().getLongitud();
		double sindLat = Math.sin(diferenciaDeLatitudes / 2);
		double sindLng = Math.sin(diferenciaDeLongitudes / 2);
		double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2) * Math.cos(Math.toRadians(getDireccion().getLatitud()))
				* Math.cos(Math.toRadians(parada.getDireccion().getLatitud()));
		double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));

		double distancia = radioTierra * va2;

		return (int) distancia;
	}

	/**
	 * @return DireccionGPS de this.
	 */
	public DireccionGPS getDireccion() {
		return direccionGPS;
	}

}
