package uva.tds.pr2.equipo10;

import java.util.ArrayList;

/**
 * Implementación sencilla de una red de buses.
 *
 * @author ivagonz
 * @author antroma
 */
public class Red {

	private ArrayList<Linea> lineas = new ArrayList<>();

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
		if (lineas == null)
			throw new IllegalArgumentException("El array de lineas no puede ser nulo.");
		if (lineas.length < 2)
			throw new IllegalArgumentException("El array de lineas debe contener al menos dos elementos.");
		if (hasLineaNull(lineas))
			throw new IllegalArgumentException("El array de lineas no debe contener elementos nulos");
		for (int i = 0; i < lineas.length; i++) {
			this.lineas.add(lineas[i]);
		}
	}

	/**
	 *
	 * @return vector de Lineas de la Red.
	 */
	public Linea[] getLineas() {
		Linea salida[] = new Linea[lineas.size()];
		for (int i = 0; i < lineas.size(); i++) {
			salida[i] = lineas.get(i);
		}
		return salida;
	}

	/**
	 * Comprueba si la Red tiene alguna Linea nula.
	 * 
	 * @param lineas
	 *            Array de lineas que representa una red. Debe ser correcto: no
	 *            nulo.
	 *
	 * @return true si tiene al menos una Linea nula, false en caso contrario.
	 */
	public boolean hasLineaNull(Linea[] lineas) {
		if (lineas == null)
			throw new IllegalArgumentException("El array de lineas no puede ser nulo.");
		for (int i = 0; i < lineas.length; i++) {
			if (lineas[i] == null)
				return true;
		}
		return false;
	}

	/**
	 * Agrega una Linea dentro de la Red de buses.
	 *
	 * @param linea
	 *            Linea a agregar en la Red. Debe ser correcta: No nula, no debe
	 *            estar ya en la Red.
	 * @throws IllegalArgumentException
	 *             en caso de incumplir las condiciones impuestas al par�metro.
	 */
	public void addLinea(Linea linea) {
		if (linea == null)
			throw new IllegalArgumentException("La Linea no puede ser null.");
		lineas.forEach(s -> {
			if (s.equals(linea))
				throw new IllegalArgumentException("La linea introducida ya está en la red.");
		});
		lineas.add(linea);
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
		if (posicion < 0)
			throw new IllegalArgumentException("La posición de la linea debe ser positiva.");
		if (posicion >= lineas.size()) {
			return null;
		} else {
			return lineas.get(posicion);
		}

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
		if (linea == null)
			throw new IllegalArgumentException("La Linea no puede ser null.");
		boolean find = false;
		for (int i = 0; i < lineas.size(); i++) {
			if (lineas.get(i).equals(linea))
				find = true;
		}
		if (!find)
			throw new IllegalArgumentException("La linea que se quiere borrar debe estar dentro de la red.");

		lineas.remove(linea);
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
		if (direccion == null)
			throw new IllegalArgumentException("La direcion debe ser no nula.");
		if (radio < 1)
			throw new IllegalArgumentException("El readio debe ser positivo");

		Parada referencia = new Parada(direccion);
		ArrayList<Linea> resultado = new ArrayList<>();

		for (int i = 0; i < lineas.size(); i++) {
			Parada paradas[] = lineas.get(i).getParadas();
			int j = 0;
			boolean salir = false;
			while (j < paradas.length && !salir) {
				if (paradas[j].getDistancia(referencia) <= radio) {
					resultado.add(lineas.get(i));
					salir = true;
				}
				j++;
			}

		}

		Linea respuesta[] = new Linea[resultado.size()];
		for (int i = 0; i < resultado.size(); i++) {
			respuesta[i] = resultado.get(i);
		}

		return respuesta;

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
	public double getDistanciaParadas(Parada parada1, Parada parada2) {
		if (parada1 == null)
			throw new IllegalArgumentException("La parada1 no puede ser nula");
		if (parada2 == null)
			throw new IllegalArgumentException("la parada2 no puede ser nula");
		return parada1.getDistancia(parada2);
	}

}
