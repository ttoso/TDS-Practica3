package uva.tds.pr2.equipo10;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParadaTest {

	@Test
	public void constructorCorrectoTest() {
		// fail("Quitar en implentación");
		DireccionGPS direccion = new DireccionGPS(5.1, -5.1);
		@SuppressWarnings("unused")
		Parada parada = new Parada(direccion);
		assertNotNull(direccion);
	}
}
