package uva.tds.pr2.equipo10;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParadaTest {

	@Test
	public void constructorCorrectoTest() {
		fail("Quitar en implentación");
		DireccionGPS direccion = new DireccionGPS(5.1, -5.1);
		@SuppressWarnings("unused")
		Parada parada = new Parada(direccion);
		assertNotNull(direccion);
	}

	@Test(expected = NullPointerException.class)
	public void constructorDireccionNullTest() {
		@SuppressWarnings("unused")
		Parada parada = new Parada(null);
	}

	@Test
	public void getDistanciaCorrectoTest() {
		fail("Quitar en implentación");
		DireccionGPS direccion = new DireccionGPS(5.1, -5.1);
		Parada parada = new Parada(direccion);
		Parada parada2 = new Parada(direccion);
		parada.getDistancia(parada2);
		assertNotNull(parada2);
	}

	@Test(expected = NullPointerException.class)
	public void getDistanciaParadaACompararNullTest() {
		DireccionGPS direccion = new DireccionGPS(5.1, -5.1);
		Parada parada = new Parada(direccion);
		parada.getDistancia(null);
	}

}
