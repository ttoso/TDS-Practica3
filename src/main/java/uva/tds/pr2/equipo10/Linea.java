package uva.tds.pr2.equipo10;

import java.util.ArrayList;

/**
 * Implementación basica de una linea de buses
 *
 * @author antroma
 * @author ivagonz
 *
 */
public class Linea {

	private int identificador;
	private ArrayList<Parada> paradas = new ArrayList<Parada>();

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
	 *            contener elementos nulos Debe tener 3 elementos o mas La
	 *            distancia entre el primer y ultimo elemento del array debe ser
	 *            menor a 100.
	 * @throws IllegalArgumentException
	 *             en caso de incumplir las condiciones impuestas a los
	 *             parámetros.
	 */
	public Linea(int identificador, Parada[] paradas) {
		// TODO Auto-generated constructor stub
		if (identificador < 1)
			throw new IllegalArgumentException("El identificador debe ser positivo.");
		if (paradas == null)
			throw new IllegalArgumentException("El vector de paradas no puede ser null.");
		if (hasParadaNull(paradas))
			throw new IllegalArgumentException("El vector de paradas no puede tener Paradas nulas.");
		if (paradas.length < 3)
			throw new IllegalArgumentException("El vector de paradas debe tener al menos 3 elementos.");
		if (paradas[0].getDistancia(paradas[paradas.length - 1]) > 100)
			throw new IllegalArgumentException(
					"La distancia entre el primer y el ultimo elemento del vector debe ser menor a 100.");
		this.identificador = identificador;
		volcarParadas(paradas);
	}

	/**
	 * Añade Paradas intermedias a la línea.
	 *
	 * @param parada
	 *            Parada a anadir. Debe ser correcta: No nula.
	 * @param posicion
	 *            Posicion en la que añadir la Parada.Debe ser correcta: No
	 *            puede ser el inicio ni el final de la Linea.
	 * @throws IllegalArgumentException
	 *             en caso de incumplir las condiciones impuestas a los
	 *             parámetros.
	 */
	public void addParadaIntermedia(Parada parada, int posicion) {
		if (parada == null)
			throw new IllegalArgumentException("La parada no puede ser null.");
		if (posicion == 0)
			throw new IllegalArgumentException("La posicion no puede ser la de la parada inicial");
		if (posicion == paradas.size() - 1)
			throw new IllegalArgumentException("La posicion no puede ser la de la parada final");
		paradas.add(posicion, parada);

	}

	/**
	 * Añade una parada como final del recorrido
	 *
	 * @param parada
	 *            parada que se añade. Debe ser correcta: no nula estar a menos
	 *            de 100 metros de la parada inicial.
	 */
	public void addParadaFinal(Parada parada) {
		if (parada == null)
			throw new IllegalArgumentException("La parada no puede ser null.");
		if (parada.getDistancia(paradas.get(0)) > 100)
			throw new IllegalArgumentException(
					"La distancia entre la parada y la parada inicial debe ser menor a 100.");
		paradas.add(parada);

	}

	/**
	 * Anade una parada como inicio del recorrido.
	 *
	 * @param parada
	 *            parada que se añade. Debe ser correcta: no nula estar a menos
	 *            de 100 metros de la parada final.
	 */
	public void addParadaInicial(Parada parada) {
		if (parada == null)
			throw new IllegalArgumentException("La parada no puede ser null.");
		if (parada.getDistancia(paradas.get(paradas.size() - 1)) > 100)
			throw new IllegalArgumentException("La distancia entre la parada y la parada final debe ser menor a 100.");
		paradas.add(0, parada);
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
		if (parada == null)
			throw new IllegalArgumentException("La parada a eliminar no puede ser null.");
		if (parada.equals(paradas.get(0)))
			throw new IllegalArgumentException("La parada a eleminar no puede ser la inicial.");
		if (parada.equals(paradas.get(paradas.size() - 1)))
			throw new IllegalArgumentException("La parada a eleminar no puede ser la final.");
		paradas.remove(parada);
	}

	/**
	 * Comprueba si la Linea tiene una Parada cerca de la direccion pasada.
	 *
	 * @param direccion
	 *            DireccionGPS a comprobar.Debe ser correcto: No ser null.
	 * @return true si tiene una Parada a menos de 200m de la Direccion pasada,
	 *         false en caso contrario.
	 * @throws IllegalArgumentException
	 *             si se incumplen las condiciones impuestas al parámetro.
	 */
	public boolean hasParadaCerca(DireccionGPS direccion) {
		if (direccion == null)
			throw new IllegalArgumentException("La dirección no puede ser null.");
		Parada direccionAComprobar = new Parada(direccion);
		for (int i = 0; i < paradas.size(); i++) {
			if (paradas.get(i).getDistancia(direccionAComprobar) < 200)
				return true;
		}

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
		if (linea == null)
			throw new IllegalArgumentException("La linea no puede ser null.");
		Parada paradasLinea[] = linea.getParadas();
		boolean cerca = false;
		for (int i = 0; i < paradasLinea.length; i++) {
			cerca = hasParadaCerca(paradasLinea[i].getDireccion());
			if (cerca) {
				return cerca;
			}
		}
		return cerca;
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
		if (linea == null)
			throw new IllegalArgumentException("La linea no puede ser null.");
		if (!linea.hasCorrespondencia(this))
			throw new IllegalArgumentException("La linea proporcionada debe tener correspondencia con esta linea.");

		ArrayList<Parada> correspondencias = new ArrayList<>();
		for (int i = 0; i < linea.getParadas().length; i++) {
			if (hasParadaCerca(linea.getParadas()[i].getDireccion())) {
				correspondencias.add(linea.getParadas()[i]);
			}
		}

		Parada paradasCorrespondencia[] = new Parada[correspondencias.size()];
		for (int i = 0; i < correspondencias.size(); i++) {
			paradasCorrespondencia[i] = correspondencias.get(i);
		}

		return paradasCorrespondencia;
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
		if (linea == null)
			throw new IllegalArgumentException("La linea no puede ser null.");
		Parada paradasLinea[] = linea.getParadas();
		for (int i = 0; i < paradasLinea.length; i++) {
			for (int j = 0; j < paradas.size(); j++) {
				if (paradas.get(j).getDistancia(paradasLinea[i]) == 0) {
					return true;
				}
			}
		}
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
		if (linea == null)
			throw new IllegalArgumentException("La linea no puede ser null.");
		if (!linea.hasTrasbordoDirecto(this))
			throw new IllegalArgumentException("La linea proporcionada debe tener trasbordo directo con esta linea.");

		ArrayList<Parada> trasbordos = new ArrayList<>();
		for (int i = 0; i < linea.getParadas().length; i++) {
			for (int j = 0; j < paradas.size(); j++) {
				if (paradas.get(j).getDistancia(linea.getParadas()[i]) == 0) {
					trasbordos.add(linea.getParadas()[i]);
				}
			}

		}

		Parada paradasCorrespondencia[] = new Parada[trasbordos.size()];
		for (int i = 0; i < trasbordos.size(); i++) {
			paradasCorrespondencia[i] = trasbordos.get(i);
		}

		return paradasCorrespondencia;
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
	public double checkDistancia(Parada parada1, Parada parada2) {
		// TODO Auto-generated method stub
		if (parada1 == null)
			throw new IllegalArgumentException("La primera parada no puede ser null.");
		if (parada2 == null)
			throw new IllegalArgumentException("La segunda parada no puede ser null.");
		return parada1.getDistancia(parada2);
	}

	/**
	 *
	 * @return Identificador de this.
	 */
	public int getId() {
		// TODO Auto-generated method stub
		return identificador;
	}

	/**
	 *
	 * @return Vector de Paradas de this.
	 */
	public Parada[] getParadas() {
		// TODO Auto-generated method stub
		Parada[] paradas = new Parada[this.paradas.size()];
		for (int i = 0; i < paradas.length; i++) {
			paradas[i] = this.paradas.get(i);
		}
		return paradas;
	}

	/**
	 * Comprobará si la Linea tiene alguna Parada null, para informar al
	 * usuario.
	 *
	 * @param paradas
	 *            Vector de Paradas en el que se comprobará si hay elementos
	 *            nulos.
	 * @return true si tiene alguna Parada null, false en caso contrario.
	 */
	public boolean hasParadaNull(Parada[] paradas) {
		// TODO Auto-generated method stub
		for (int i = 0; i < paradas.length; i++) {
			if (paradas[i] == null)
				return true;
		}
		return false;
	}

	/**
	 * Comprueba si la Linea tiene una Parada.
	 *
	 * @param parada
	 *            Parada a comprobar dentro de la linea. Debe ser correcta:No
	 *            nula.
	 * @return true si la Linea tiene la Parada, false en caso contrario.
	 */
	public boolean hasParada(Parada parada) {
		// TODO Auto-generated method stub
		if (parada == null)
			throw new IllegalArgumentException("La parada no puede ser null.");
		for (int i = 0; i < paradas.size(); i++) {
			if (parada.equals(paradas.get(i))) {
				return true;
			}
		}
		return false;
	}

	private void volcarParadas(Parada[] paradas) {
		// TODO Auto-generated method stub
		for (int i = 0; i < paradas.length; i++) {
			this.paradas.add(paradas[i]);
		}
	}

}
