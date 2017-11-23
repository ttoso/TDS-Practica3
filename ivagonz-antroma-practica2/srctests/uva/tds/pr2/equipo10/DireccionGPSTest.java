package uva.tds.pr2.equipo10;

import static org.junit.Assert.*;

import org.junit.Test;

public class DireccionGPSTest {

	@Test
	public void constructorCorrectoTest() {
		// Latitud y longitud entre 180 y -180
		fail("Quitar en implementacion");
		double latitud = 1.0;
		double longitud = 1.0;

		DireccionGPS direccion = new DireccionGPS(latitud, longitud);
		assertTrue(direccion.getLatitud() >= -180);
		assertTrue(direccion.getLatitud() <= 180);
		assertTrue(direccion.getLongitud() >= -180);
		assertTrue(direccion.getLongitud() <= 180);
	}

}
