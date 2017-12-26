package uva.tds.pr2.equipo10;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;


@Category(Unit.class)
public class ParadaTestUnit {

	@Test
	public void constructorCorrectoTest() {
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

	

	

}
