package uva.tds.pr2.equipo10;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RedConstructorTest {

	private DireccionGPS direccion1;
	private DireccionGPS direccion2;
	private DireccionGPS direccion3;
	private Parada parada1;
	private Parada parada2;
	private Parada parada3;
	private Parada paradas[];
	private int identificador;
	private Linea linea;

	private Parada parada4;
	private Parada parada5;
	private Parada parada6;
	private Parada paradas2[];
	private int identificador2;
	private Linea linea2;

	@Before
	public void setUp() throws Exception {
		direccion1 = new DireccionGPS(20.45, 30.50);
		direccion2 = new DireccionGPS(30.5, 20.4);
		direccion3 = new DireccionGPS(20.44999, 30.50);
		parada1 = new Parada(direccion1);
		parada2 = new Parada(direccion2);
		parada3 = new Parada(direccion3);
		paradas = new Parada[3];
		paradas[0] = parada1;
		paradas[1] = parada2;
		paradas[2] = parada3;
		identificador = 1;
		linea = new Linea(identificador, paradas);

		parada6 = new Parada(direccion3);
		parada5 = new Parada(direccion2);
		parada4 = new Parada(direccion1);
		paradas2 = new Parada[3];
		paradas2[0] = parada6;
		paradas2[1] = parada5;
		paradas2[2] = parada4;
		identificador2 = 2;
		linea2 = new Linea(identificador2, paradas2);
	}

	@After
	public void tearDown() throws Exception {
		direccion1 = null;
		direccion2 = null;
		direccion3 = null;
		parada1 = null;
		parada2 = null;
		parada3 = null;
		paradas = null;
		identificador = 0;
		linea = null;
		parada6 = null;
		parada5 = null;
		parada4 = null;
		paradas2 = null;
		identificador2 = 0;
		linea2 = null;
	}

	@Test
	public void constructorCorrectoTest() {
		Linea lineas[] = new Linea[] { linea, linea2 };
		Red red = new Red(lineas);
		assertNotNull(lineas);
		assertArrayEquals(lineas, red.getLineas());
		assertFalse(red.hasLineaNull());
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorConLineasNullTest() {
		@SuppressWarnings("unused")
		Red red = new Red(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorConLineaNullTest() {
		Linea lineas[] = new Linea[] { linea, null };
		@SuppressWarnings("unused")
		Red red = new Red(lineas);
	}

	@Test(expected = IllegalArgumentException.class)
	public void constructorConLineasDeTamanioMenorDe2Test() {
		Linea lineas[] = new Linea[] { linea };
		@SuppressWarnings("unused")
		Red red = new Red(lineas);
	}

	@Test
	public void getLineasCorrectoTest() {
		Linea lineas[] = new Linea[] { linea, linea2 };
		Red red = new Red(lineas);
		assertArrayEquals(lineas, red.getLineas());
	}

	@Test
	public void secuenciaTest() {
		fail("Quitar en implementacion");
		Linea lineas[] = new Linea[] { linea, linea2 };
		Red red = new Red(lineas);
		red.addLinea(linea);
		red.removeLinea(linea);
		red.getDistanciaParadas(parada1, parada2);
		red.getLinea(0);
		red.infoParadas(direccion1, 100);
	}

}
