package uva.tds.pr2.equipo10;

import static org.junit.Assert.*;

import org.junit.Test;

public class DireccionGPSTest {

	@Test
	public void constructorCorrectoTest() {
		fail("Quitar en implementacion");
		double latitud = 1.0;
		double longitud = 1.0;

		DireccionGPS direccion = new DireccionGPS(latitud, longitud);
		assertTrue(direccion.getLatitud() >= -180);
		assertTrue(direccion.getLatitud() <= 180);
		assertTrue(direccion.getLongitud() >= -180);
		assertTrue(direccion.getLongitud() <= 180);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorLatitudMenorQueMenos180Test() {
		double longitud = 1.0;
		@SuppressWarnings("unused")
		DireccionGPS direccion = new DireccionGPS(-180.01, longitud);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorLatitudMayorQue180Test() {
		double longitud = 1.0;
		@SuppressWarnings("unused")
		DireccionGPS direccion = new DireccionGPS(180.01, longitud);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorLongitudMenorQueMenos180Test() {
		double latitud = 1.0;
		@SuppressWarnings("unused")
		DireccionGPS direccion = new DireccionGPS(latitud, -180.01);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorLongitudMayorQue180Test() {
		double latitud = 1.0;
		@SuppressWarnings("unused")
		DireccionGPS direccion = new DireccionGPS(latitud, 180.01);
	}

}
