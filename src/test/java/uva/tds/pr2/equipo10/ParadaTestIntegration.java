package uva.tds.pr2.equipo10;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;


@Category(Integration.class)
public class ParadaTestIntegration {

	@Test
	public void getDistanciaCorrectoTest() {
		DireccionGPS direccion = new DireccionGPS(5.1, -5.1);
		Parada parada = new Parada(direccion);
		Parada parada2 = new Parada(direccion);
		parada.getDistancia(parada2);
		assertNotNull(parada2);
	}

	@Test(expected = IllegalArgumentException.class)
	public void getDistanciaParadaACompararNullTest() {
		DireccionGPS direccion = new DireccionGPS(5.1, -5.1);
		Parada parada = new Parada(direccion);
		parada.getDistancia(null);
	}

}
