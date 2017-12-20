package uva.tds.pr2.equipo10;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({Unit.class})
public class DireccionGPSTest {

	private final double errorAdmisible = 0.001;

	@Test
	public void constructorCorrectoTest() {
		double latitud = 1.0;
		double longitud = 1.0;

		DireccionGPS direccion = new DireccionGPS(latitud, longitud);
		assertEquals(latitud, direccion.getLatitud(), errorAdmisible);
		assertEquals(longitud, direccion.getLongitud(), errorAdmisible);
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

	@Test
	public void getLatitudCorrectoTest() {
		double latitud = 1.0;
		double longitud = 1.0;

		DireccionGPS direccion = new DireccionGPS(latitud, longitud);
		assertEquals(latitud, direccion.getLatitud(), errorAdmisible);
	}

	@Test
	public void getLongitudCorrectoTest() {
		double latitud = 1.0;
		double longitud = 1.0;

		DireccionGPS direccion = new DireccionGPS(latitud, longitud);
		assertEquals(longitud, direccion.getLongitud(), errorAdmisible);
	}

	@Test
	public void secuenciaTest() {
		fail("Quitar en implementacion");
		double latitud = 1.0;
		double longitud = 1.0;
		DireccionGPS direccion = new DireccionGPS(latitud, longitud);
		direccion.getLatitud();
		direccion.getLongitud();
	}

}
