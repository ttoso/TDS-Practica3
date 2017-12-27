package uva.tds.pr2.equipo10;


import org.junit.Test;

import org.junit.experimental.categories.Category;


@Category(Sequence.class)
public class SecuenciaParadaTest {

	@Test
	public void secuenciaTest() {
		DireccionGPS direccion = new DireccionGPS(5.1, -5.1);
		Parada parada = new Parada(direccion);
		Parada parada2 = new Parada(direccion);
		parada.getDireccion();
		parada.getDistancia(parada2);
	}
}
