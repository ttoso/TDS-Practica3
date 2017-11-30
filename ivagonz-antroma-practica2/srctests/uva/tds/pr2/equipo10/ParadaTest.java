package uva.tds.pr2.equipo10;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParadaTest {

	@Test
	public void constructorCorrectoTest() {
		fail("Quitar en implentaci�n");
		DireccionGPS direccion = new DireccionGPS(5.1, -5.1);

		Parada parada = new Parada(direccion);
		assertNotNull(parada.getDireccion());
		assertEquals(direccion, parada.getDireccion());
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorDireccionNullTest() {
		@SuppressWarnings("unused")
		Parada parada = new Parada(null);
	}

	@Test
	public void getDireccionCorrectoTest() {
		DireccionGPS direccion = new DireccionGPS(5.1, -5.1);
		Parada parada = new Parada(direccion);
		assertEquals(direccion, parada.getDireccion());
	}

	@Test
	public void getDistanciaCorrectoTest() {
		fail("Quitar en implentaci�n");
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
